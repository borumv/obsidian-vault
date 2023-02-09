- Состоят из набора утверждений, возвращая результат последнего
- Могут содержать все CRUD - операции
- Не могут содержать COMMIT, SAVEPOINT, VACUUM
	Но это не значит, что функции в PG не транзакционны, если произойдёт какая-то ошибка, то будет откат


Делятся на:
- SQL-функции
- Процедурные(PL/pgSQL - основной диалект)
- Серверные функции (написанные на C)
- Собественные C-функции

### Cинтаксис
```postgresql
CREATE FUNCTION func_name([arg1, arg2]) RETURNS data_type AS $$
--logic
$$ LANGUAGE lang
```

```postgresql
CREATE OR REPLACE func_name...
--модифицирует уже существующую функцию с таким наименованием
```

_Создание скалярных функций_
```postgresql
CREATE OR REPLACE FUNCTION get_total_number_of_goods() RETURNS BIGINT AS $$
	SELECT SUM(units_in_stock)
	FROM products
$$ LANGUAGE SQL

SELECT get_total_number_of_goods();
```


_Функции, которые принмают аргументы_

Маркеры
---
**IN** - входящий аргумент (неявный)
**OUT** - исходящий аргумент
**INOUT** - и входящий и исходящий аргумент
**[VARIADIC](psql_VARIADIC.md)** - массив входящих параметров
**DEFAULT** ***value***  - значение по умолчанию
#####

```sql
CREATE OR REPLACE FUNCTION get_product_price_by_name(prod_name varchar) RETURNS real AS $$
	SELECT unit_price
	FROM products
	WHERE product_name = prod_name
$$ LANGUAGE SQL 

SELECT get_product_price_by_name('Chai')
SELECT * FROM get_price_boundaries() -- если хотим разделить на колонки рекорд, которы возвращает функция
```


### Возврат множества строк
- **RETURNS SETOF** *data_type* - возврат n-значений типа data_type
- **RETURNS SETOF** *table* - если нужно вернуть все столбцы из таблицы или пользовательского типа
- **RETURNS SETOF record** - только когда типы колонок в результирующем наборе заранее неизвестны
- **RETURNS TABLE** *(column_ name data_type, ...)* - тоже что и **SETOF** *table*, но имеем **возможность** явно **указать возвращаемые столбцы**
- Возврат через **OUT**-параметры

```postgresql
CREATE 
	OR REPLACE FUNCTION avg_price_product ( ) RETURNS TABLE ( category_product_name varchar, avgprice DECIMAL ) AS $$
		SELECT category_name, AVG(unit_price)
		FROM products
		JOIN categories USING(category_id)
		GROUP BY category_name
	$$ LANGUAGE SQL
	
	SELECT * FROM avg_price_product()

```

## PL/pgSQL

**Синтаксис**
```postgresql
CREATE FUNCTION func_name([arg1, arg2 ...]) RETURNS data_type AS $$
	BEGIN
	--logic
	END;
$$ LANGUAGE plpgsql;
```

- В расширении **plpgsql** разрешено создание переменных
- Есть прогон циклов и развитая логика
- В отличии от SQL-синтаксиса возврат значения через **RETURN(вместо SELECT)** или **RETURN QUERY (в дополнение к SELECT)

*Скалярная функция*
```postgresql
CREATE OR REPLACE FUNCTION get_total_number_of_goods() RETURNS bigint AS $$
BEGIN
	RETURN sum(units_in_stock)
	FROM products;
END;
$$ LANGUAGE plpgsql

SELECT get_total_number_of_goods();
```

_Функция, возвращающая значения_
```postgresql
CREATE OR REPLACE FUNCTION get_price_bound(OUT min_price real, OUT max_price real) AS $$
	BEGIN
		--min_price := min(unit_price) FROM products;
		--max_price := max(unit_price) FROM products;
		SELECT MAX(unit_price), MIN(unit_price)
		INTO min_price, max_price
		FROM products;
	END;
$$ LANGUAGE plpgsql

SELECT get_price_bound();
```

```postgresql
CREATE OR REPLACE FUNCTION summer(number_first int, number_second int, OUT summ int) AS $$
	BEGIN
		summ := number_first + number_second;
	END;
	$$ LANGUAGE plpgsql
	
	SELECT summer(1,2)
```
_Функци использующая в качестве возвращаемого значения **QUERY**_
```postgresql
CREATE OR REPLACE FUNCTION get_customers_by_country(customer_country varchar) RETURNS SETOF customers AS $$
	BEGIN
		RETURN QUERY 
		SELECT * FROM customers
		WHERE country = customer_country;
	END;
$$ LANGUAGE plpgsql 

SELECT * FROM get_customers_by_country('Brazil')
```

**ОБЪЯВЛЕНИЕ ПЕРЕМЕННЫХ**
```postgresql
CREATE FUNCTION func_name([arg1, arg2]) RETURNS data_type AS $$
DECLARE
	variable type;
BEGIN
--logic
END;
$$ LANGUAGE plogsql
```

_Пример расчёта площади треугольника_
```postgresql
CREATE OR REPLACE FUNCTION get_square(ab real, ac real, ad real) RETURNS real AS $$
DECLARE 
perimetr real;
BEGIN
	perimetr = (ab + ac + ad)/2;
	RETURN sqrt(perimetr*(perimetr - ac)*(perimetr - ab)*(perimetr - ad));
END;
$$ LANGUAGE plpgsql 

SELECT get_square(6,6,6);
```

_Пример №2_
```postgresql
CREATE OR REPLACE FUNCTION  calc_middle_price() RETURNS SETOF products AS $$
DECLARE
avg_price real;
low_price real;
high_price real;
BEGIN
	SELECT AVG(unit_price)
	INTO avg_price
	FROM products;
	
	low_price = avg_price * 0.75;
	high_price = avg_price * 1.25;
	
	RETURN QUERY
	SELECT * FROM products
	WHERE unit_price BETWEEN low_price AND high_price;
END;

$$LANGUAGE plpgsql


SELECT * FROM calc_middle_price();
```

**IF ELSE**
```postgresql
IF expression THEN
--logic
ELSIF expression THEN
--logic
ELSIF expression THEN
--logic
ELSE
--logic
END IF;
```

_Example:_
```postgresql
 CREATE OR REPLACE FUNCTION what_season(number_month int) RETURNS varchar AS $$
	DECLARE
		season varchar;
	BEGIN
		IF number_month BETWEEN 9 AND 11 THEN
			season = 'winter';
		ELSEIF	number_month BETWEEN 3 AND 5 THEN
			season = 'spring';
		ELSEIF number_month BETWEEN 6 AND 8 THEN
			season = 'summer';
		ELSE
			season = 'winter';
		END IF;
		
		RETURN season;
		
	END;
	$$ LANGUAGE plpgsql;
	
	SELECT what_season(1);
```

**ЦИКЛЫ**

- _While_
```postgresql
WHILE
LOOP
	--logic
END LOOP;
```

- _Бесконечный цикл выходит кога срабатывает epression в EXIT WHEN (аналог break)_
```postgresql
LOOP
	EXIT WHEN expression
	--logic
END LOOP;
```
- _Цикл for_
```postgresql
	FOR counter IN a..b[BY x]
	LOOP
		--logic
	END LOOP
```
- _CONTINUE WHEN_
```postgresql
CONTINUE WHEN expression
```

_Пример вычисления числа Фибоначи_
```postgresql
CREATE OR REPLACE FUNCTION func_fib(number_target int) RETURNS int AS $$
	DECLARE
		counter int = 0;
		i int = 0;
		i2 int = 1;
	BEGIN
		IF number_target < 1 THEN
			RETURN 0;
		END IF;
		WHILE counter <= number_target
		LOOP
			counter = counter + 1;
			SELECT i2, i + i2 INTO i, i2;
END LOOP;
	RETURN i;
	END;
$$ LANGUAGE plpgsql

SELECT func_fib(4);
```

_Пример цикла for_
```postgresql
DO $$
	BEGIN
		FOR counter IN 1..5
			LOOP
				RAISE NOTICE 'counter: %', counter;
			END LOOP;
END $$
```

**RETURN NEXT**
Из процедурщины ещё можно выделить ситуации, когда нам нужно выполнить построчный процессинг - например, когда мы делаем какой-то SELECT -> обрабатываем -> запихиваем в какой-то результирующий набор
```postgresql
RETURN NEXT expression;
```

```postgresql
CREATE OR REPLACE FUNCTION next_int() RETURNS SETOF int AS $$
	BEGIN
		
		RETURN NEXT 1;
		RETURN NEXT 2;
		RETURN NEXT 3;
		
	END;
$$ LANGUAGE plpgsql

SELECT * FROM next_int();
```

```postgresql
CREATE OR REPLACE FUNCTION christmas_sale() RETURNS SETOF products AS $$

DECLARE
	product record;
BEGIN
	FOR product IN SELECT * FROM products
		LOOP
		
			IF product.category_id IN (1,4,8) THEN
				product.unit_price = product.unit_price * 0.8;
				
			ELSEIF product.category_id IN (2,3,7) THEN
				product.unit_price = product.unit_price * 1.5;
				
			ELSE 
				product.unit_price = product.unit_price * 1.1;
				
			END IF;
			RETURN NEXT product;
		END LOOP;
END;
$$ LANGUAGE plpgsql
```
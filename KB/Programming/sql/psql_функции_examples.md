---
tags: postgresql
---

_1. Создайте функцию, которая делает бэкап таблицы customers (копирует все данные в другую таблицу), предварительно стирая таблицу для бэкапа, если такая уже существует (чтобы в случае многократного запуска таблица для бэкапа перезатиралась)._
```sql
CREATE OR REPLACE FUNCTION backup_customers()RETURNS void AS $$
		DROP TABLE IF EXISTS backup_customers;
		CREATE TABLE backup_customers AS
		SELECT * FROM customers
		--SELECT * INTO backup_customers
		--FROM customers		
$$ LANGUAGE SQL

SELECT backup_customers()
```

_2. Создать функцию, которая возвращает средний фрахт (freight) по всем заказам_
```sql
CREATE OR REPLACE FUNCTION avg_freight() RETURNS float8 AS $$
	SELECT AVG(freight)
	FROM orders
$$ LANGUAGE SQL

SELECT avg_freight();

```

_3. Написать функцию, которая принимает два целочисленных параметра, используемых как нижняя и верхняя границы для генерации случайного числа в пределах этой границы (включая сами граничные значения)._
```sql
CREATE OR REPLACE FUNCTION random_vlaue_creater (min_val int, max_val int) RETURNS int AS $$
		SELECT floor((max_val - min_val) * random() + min_val) 
$$ LANGUAGE SQL
```

_4. Создать функцию, которая возвращает самые низкую и высокую зарплаты среди сотрудников заданного города_
```sql
CREATE OR REPLACE FUNCTION get_salary_bounds_by_city(emp_city varchar, out min_salary numeric, out max_salary numeric) AS $$
	SELECT MIN(salary), MAX(salary)
	FROM employees
	WHERE city = emp_city
$$ LANGUAGE SQL;

SELECT * FROM get_salary_bounds_by_city('London')

```

_5. Создать функцию, которая корректирует зарплату на заданный процент,  но не корректирует зарплату, если её уровень превышает заданный уровень при этом верхний уровень зарплаты по умолчанию равен 70, а процент коррекции равен 15%._
```sql
CREATE OR REPLACE FUNCTION correct_salary(upper_boundary numeric DEFAULT 70, correction_rate numeric DEFAULT 0.15) 
RETURNS void AS $$
	UPDATE employees
	SET salary = salary + (salary*correction_rate)
	WHERE salary >= upper_boundary;

$$ LANGUAGE SQL
SELECT correct_salary()
```

_6. Модифицировать функцию, корректирующую зарплату таким образом, чтобы в результате коррекции, она так же выводила бы изменённые записи._
```sql
CREATE OR REPLACE FUNCTION correct_salary(upper_boundary numeric DEFAULT 70, correction_rate numeric DEFAULT 0.15) 
RETURNS emploees AS $$
	UPDATE employees
	SET salary = salary + (salary*correction_rate)
	WHERE salary >= upper_boundary;
RETURNING *;
$$ LANGUAGE SQL
SELECT correct_salary()

```

_7. Модифицировать предыдущую функцию так, чтобы она возвращала только колонки last_name, first_name, title, salary_
```sql
CREATE OR REPLACE FUNCTION correct_salary(upper_boundary numeric DEFAULT 70, correction_rate numeric DEFAULT 0.15) 
RETURNS TABLE (last_name text, first_name text, title text, salary numeric) AS $$
	UPDATE employees
	SET salary = salary + (salary*correction_rate)
	WHERE salary >= upper_boundary;
RETURNING last_name, first_name, title, salary;
$$ LANGUAGE SQL
SELECT correct_salary()
```
_8. Написать функцию, которая принимает метод доставки и возвращает записи из таблицы orders в которых freight меньше значения, определяемого по следующему алгоритму:
- _ищем максимум фрахта (freight) среди заказов по заданному методу доставки
- _корректируем найденный максимум на 30% в сторону понижения
- _вычисляем среднее значение фрахта среди заказов по заданному метдому доставки
- _вычисляем среднее значение между средним найденным на предыдущем шаге и скорректированным максимумом_
- _возвращаем все заказы в которых значение фрахта меньше найденного на предыдущем шаге среднего_
```postgresql
CREATE OR REPLACE FUNCTION info_freight_by_ship1(ship_via_resp int) RETURNS SETOF orders AS $$
	DECLARE
	max_freight numeric;
	avg_freight numeric;
	avg_avg numeric;
	BEGIN
		SELECT MAX(freight) * 0.7 INTO max_freight
		FROM orders
		WHERE ship_via = ship_via_resp;
	
		SELECT AVG(freight) INTO avg_freight
		FROM orders
		WHERE ship_via = ship_via_resp;
		
		avg_avg = (max_freight + avg_freight) / 2; 
	
		RETURN QUERY
		SELECT * FROM orders
		WHERE freight < avg_avg;
	END;
	
	
$$ LANGUAGE plpgsql
```

*Написать функцию, которая принимает:
уровень зарплаты, максимальную зарплату (по умолчанию 80) минимальную зарплату (по умолчанию 30), коээфициет роста зарплаты (по умолчанию 20%)
Если зарплата выше минимальной, то возвращает false
Если зарплата ниже минимальной, то увеличивает зарплату на коэффициент роста и проверяет не станет ли зарплата после повышения превышать максимальную.
Если превысит - возвращает false, в противном случае true.
Проверить реализацию, передавая следующие параметры
(где c - уровень з/п, max - макс. уровень з/п, min - минимальный уровень з/п, r - коэффициент):
c = 40, max = 80, min = 30, r = 0.2 - должна вернуть false
c = 79, max = 81, min = 80, r = 0.2 - должна вернуть false
c = 79, max = 95, min = 80, r = 0.2 - должна вернуть true_
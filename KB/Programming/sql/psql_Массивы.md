---
tags: postgresql
---
**Массив** - коллекция данных одного типа

- Столбцы и переменные могут объявляться как массив
- Массивы могут быть многомерными

**SQL-стандарт**:
```sql
temp int ARRAY
temp int ARRAY[4]
```
Postgres:
```postgresql
temp int[]
temp int[8]
```

Инициализация массивов
- '{"a", "a", "a"}'
- '{1,2,3}'
- '{{"a", "a", "a"},{"a", "a", "a"},{"a", "a", "a"}}'
- ARRAY['a','b','v']

Обращения к массивам
- tmp[index] - взяти элемента по индексу (от 1)
- Слайсинг (срезы):
	- tmp[1:3]
	- tmp[:4]
- array_dims(arr_name) - возвращает размерность массива (не путать с количеством)
- array_length(arr_name, dim) - возвращает длину массива

```postgresql
CREATE TABLE chese_game (

	white_player text,
	black_player text,
	moves text[],
	final_stats text[][]
	
);

INSERT INTO chese_game
VALUES ('Cauana', 'Nakamura','{"d4", "d5", "c4", "c6"}', 	
				'{{"Ra8", "Qe8", "x","x","x","x","x","x"},
					{"a7", "x", "x","x","x","x","x","x"},
					{"Kb5", "Bc5", "d5","x","x","x","x","x"}}');
				
```

_Поиск по массиву SELECT-ом_
```postgresql
**SELECT * 
FROM chese_game
WHERE 'g6' = ANY (moves)
```

**Операторы, которые мы используем при работе с массивами**
**Операторы сравнения:**
- = true если совпадают значения и последовательность
- > true если в первой неравной паре, элемент слева больше
- <true если в первой неравной паре, элемент слева меньше

**Сontainment-операторы:**
- @> true если левый массив включает все элементы правого
- @<  true если правый массив включает все элементы левого

**Оператор пересечения**
- && true если в массивах есть хотя бы один одинаковый элемент

_Пример с выдёргивание номера по коду_
```postgresql
CREATE OR REPLACE FUNCTION filter_phones(code int, VARIADIC numbers text []) RETURNS SETOF text AS $$
	
	DECLARE
	number1 text;
	
	BEGIN
		FOREACH number1 IN ARRAY numbers
		LOOP
			CONTINUE WHEN number1 NOT LIKE CONCAT('%(', code, ')%');
			RETURN NEXT number1;
		END LOOP;
	END;

$$ LANGUAGE plpgsql


SELECT filter_phones(903, '+7(903)1901235', '+7(926)8567589', '+7(903)1532476')
```
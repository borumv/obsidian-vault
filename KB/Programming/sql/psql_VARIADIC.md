---
tags: postgresql
---
 **VARIADIC** - массив входящих параметров
Что-бы передавать какое-то количество параметров в функцию , нужно объявить аргумент как **VARIADIC**
```postgresql
VARIADIC arg_name data_type[]
```

_Пример_
```postgresql
CREATE OR REPLACE FUNCTION chet_or_nechet(VARIADIC numbers int[]) RETURNS SETOF int AS $$
DECLARE 
counter int;
BEGIN
	--FOR counter IN 1..array_upper(numbers, 1)
	FOREACH counter IN ARRAY numbers
	LOOP
		CONTINUE WHEN counter % 2 != 0;
		RETURN NEXT counter;
	END LOOP;
END;


$$ LANGUAGE plpgsql

SELECT * FROM chet_or_nechet(1,2,4,5,6,7,3,4,32,3,4,4,6,78)
```

 
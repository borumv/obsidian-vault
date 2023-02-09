_Редактирование массива_
```postgresql
UPDATE raw_recipes SET ingredients[1] = substring(ingredients[1]  from '[^\"\[].*');
```

_Заполнение базы данных (не очень)_
```postgresql
			
CREATE OR REPLACE FUNCTION set_ingrid()RETURNS VOID AS $$
	DECLARE
	list_of_ingridients text[];
	ingridient text;
	
	BEGIN
		FOR list_of_ingridients IN SELECT ingredients FROM raw_recipes
		LOOP
		RAISE INFO 'list = %', list_of_ingridients;
					
					FOREACH ingridient IN ARRAY list_of_ingridients
						LOOP
							RAISE INFO 'product = %', ingridient;
								BEGIN
									IF ingridient IN (SELECT name FROM products_food_com_transit) THEN
										RAISE INFO 'nooo';
									ELSE
										INSERT INTO products_food_com_transit (name) VALUES (ingridient);
									END IF;
								END;													
						END LOOP;
						
		END LOOP;
	END;

$$ LANGUAGE plpgsql
```
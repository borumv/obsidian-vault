
## Этапы создания
1.Рецепты агрегированны на следующих ресурсах -
- food.com
- allrecipes.com
*Дополнительно:*
- [http://www.tarladalal.com](http://www.tarladalal.com)
- https://www.thespruceeats.com/
- https://www.epicurious.com/
- https://www.foodnetwork.com/
- https://www.taste.com.au/

2.Каждый рецепт можно разделить на 2 структуры - 1)Сам рецепт, 2)Ингридиенты 

3.Каждый ингридиент может иметь следующие состояния:
- Имя
- Состояние (*напр. молотый*)
- Единица измерения (грамм, чашка)
- Количество, которое связано с единицами измерения (*напр. 1 чайная лошка, 1 грамм*)
_Редактирование массива_
- Ингридиент сухой/свежий
- Температура применяемая перед приготовлением (*горячая/холодная*)
- ?*Размер порции (маленький, большой)*


Всё, что из статьи:
Эта статья о том, как были собраны данные о ингредиентах для создания датасета рецептов. Авторы использовали два источника рецептов, GeniusKitchen и AllRecipes, и выбрали их из-за единообразия структуры, доступности геокультурного маппинга и количества рецептов. Каждый рецепт был разделен на две части: раздел с ингредиентами и раздел с инструкциями для приготовления. Для сбора данных об ингредиентах авторы использовали семь атрибутов: название, состояние, единица измерения, количество, размер порции, температура и сухость / свежесть. Для обработки данных авторы использовали кластеризацию, модель именованной сущности (NER) и маркеры частей речи (POS). Было создано три датасета с разделением на обучающую и тестовую выборку, и были обучены три модели NER. Результаты показали, что модели показывают хорошие результаты в извлечении информации об ингредиентах из рецептов.


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
---
tags: postgresql
---
- Позволяет **обрабатывать группы строк без образования группировок** (_можно сказать, что позволяет сделать GROUP BY без GROUP BY_)
- Оконные функции делятся на:
	- Агрегатные (AVG, SUM)
	- [Ранжирования](psql_Оконные%20функции%20ранжирования.md) (_позволяют добавить ранг, т.е. как-то упорядочить_)
- Отрабатывают **после** JOIN, WHERE, GROUP BY, HAVING, но **перед** ORDER BY
> There was SQL before window functions and SQL after window functions

```postgresql
function OVER (expression) 
function OVER ([PARTITION BY expression], [ORDER BY expression])
```

_Пример_
```postgresql

Высчитываем среднюю стоимость по категориям продукта

SELECT category_name, AVG(unit_price)
FROM products
JOIN categories USING (category_id)
GROUP BY category_name

А что если мы хотим сравнивать цену продукта со средней по его категории 

SELECT category_id, category_name, product_name, unit_price, AVG(unit_price) OVER(PARTITION BY category_id)
FROM products
JOIN categories USING (category_id)

А что если мы хотим сделать группировку по order_id и посчитать нарастающий итог по product_id


SELECT order_id, order_date, product_id, unit_price, SUM(unit_price) OVER (PARTITION BY order_id ORDER BY product_id)
FROM order_details
JOIN orders USING (order_id)


Посчитать нарастающий итог по всем order-ам вообще

SELECT order_id, order_date, product_id, unit_price, row_id, SUM(unit_price) OVER (ORDER BY row_id)
FROM 
(
	SELECT order_id, order_date, product_id, unit_price, row_number() OVER () AS row_id
	FROM order_details
	JOIN orders USING (order_id)
) subquery
```

Т.е. **Партиция (Partition BY)** - это GROUP BY без свёртывания. А, если нам нужен наростающий итог, то мы добавляем **ORDER BY**
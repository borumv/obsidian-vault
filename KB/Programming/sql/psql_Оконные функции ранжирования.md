---
tags: postgresql
---
Тип [оконной функции](psql_Оконные%20функции.md)
- **ROW_NUMBER()** - присвоение уникального значения строкам
- **RANK** - присвоение ранга (веса) строкам с пропусками 
	```postgresql
	SELECT product_name, units_in_stock, unit_price,
		RANK() OVER(ORDER BY unit_price)
	FROM products
	```
![[Pasted image 20220808142627.png]]
- **DENSE_RANK** - присвоение ранга (веса) строкам без пропусков
```postgresql
SELECT product_name, units_in_stock, unit_price,
		DENSE_RANK() OVER(ORDER BY units_in_stock)
FROM products
```
![[Pasted image 20220808142736.png]]
_Пример, где в ORDER BY мы запихиваем определённую логику_
```postgresql
SELECT product_name, unit_price, 
	DENSE_RANK() OVER (
		ORDER BY
			CASE
				WHEN unit_price > 80 THEN 1
				WHEN unit_price > 30 AND unit_price <80 THEN 2
				ELSE 3
			END
		) AS ranking
FROM products
ORDER BY unit_price DESC
```

- **LAG** - присвоение значения текущей строке, основанное на значении в предыдущей
_Отличие текущей цены от предыдущей_
```postgresql
SELECT product_name, unit_price, 
	LAG(unit_price) OVER (ORDER BY unit_price DESC) - unit_price AS price_lag
FROM products
```
![[Pasted image 20220808150354.png]]
- **LEAD** - LAG наоброт: присвение значения текущей строке, основанное на значении в следующей
```postgresql
SELECT product_name, unit_price, 
	LAG(unit_price) OVER (ORDER BY unit_price DESC) - unit_price AS price_lag
FROM products
```
![[Pasted image 20220808150612.png]]
- В **LEAD** и **LAG** можно передавать смещение (_offset_)


**ВЫБОРКА n-го количества строк**
```postgresql
SELECT *
FROM products
WHERE product_id = ANY (
SELECT product_id 
FROM (
	SELECT product_id, unit_price,
			ROW_NUMBER() OVER (ORDER BY unit_price DESC) AS nth
		FROM products) sorted_prices
	WHERE nth < 4
	) 
```
![[Pasted image 20220808151906.png]] 
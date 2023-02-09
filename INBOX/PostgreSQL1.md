**WHERE EXISTS**
Возвращает **true** если условия подзапроса соотвествуют

```sql
SELECT company_name, contact_name FROM customers
WHERE  EXISTS (SELECT customer_id FROM orders
								WHERE customers.customer_id = orders.customer_id
								AND freight BETWEEN 50 AND 100)
```

**Выбрать компании и имена заказчиков, которые делали заказы между 1.02.1995 и 15.02.1995

```sql
SELECT company_name, contact_name FROM customers
WHERE EXISTS (SELECT customer_id FROM orders
								WHERE customers.customer_id = orders.customer_id
								AND order_date BETWEEN '1995-02-01' AND '1995-02-15')


```

**ANY/ALL**
**Выбрать все уникальные компании заказчиков которые делали заказы на более чем 40 единиц товаров**

```sql
SELECT DISTINCT company_name
FROM customers
WHERE customer_id = ANY (
	SELECT customer_id
	FROM orders
	JOIN order_details USING(order_id)
	WHERE quantity > 40
)
```

**Выбрать такие продукты, количество которых больше среднего по заказам**
```sql
SELECT DISTINCT product_name, quantity
FROM products
JOIN order_details USING(product_id)
WHERE quantity > (SELECT AVG(quantity)
									FROM order_details)
ORDER BY quantity DESC
```

**Необходимо найти все продукты, количество которых  больше среднего значения количества заказанных товаров из групп, полученных группированием по product_id

```sql
SELECT DISTINCT product_name, quantity
FROM products
JOIN order_details USING(product_id)
WHERE quantity > ALL (SELECT AVG(quantity)
									FROM order_details
									GROUP BY product_id)
```

[Примеры использования](psql_функции_examples.md)
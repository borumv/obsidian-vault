## COALESCE & NULLIF

**COALESCE** - принмает переменное количество аргументов и возвращает первый аргумент, который не **null**

```postgresql
	COALESCE (arg1,arg2)
```

```postgresql
SELECT order_id, customer_id, COALESCE(ship_region, 'unknow')
FROM orders
LIMIT(10)
```
**NULLIF** - принимает 2 аргумента, если они равны -> возвращает NULL
```postgresql
	NULLIF (arg1, arg2)
```
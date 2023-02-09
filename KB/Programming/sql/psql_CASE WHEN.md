## CASE WHEN


```postgresql
	CASE 
		WHEN condition_1 THEN result_1
		WHEN condition_1 THEN result_1
		[WHEN...]
		[ELSE result_n]
	END
```

```postgresql
SELECT product_name, units_in_stock, 
CASE WHEN units_in_stock > 50 THEN 'MORE'
	WHEN units_in_stock = 50 THEN 'AVERAGE'
	WHEN units_in_stock < 50 THEN 'LOW'
	ELSE 'N'
END
FROM products
```

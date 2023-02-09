- Набор столбцов в GROUP BY - это GROUPING SET
```postgresql
GROUP BY GROUPING SET ((col_a), (col_a, col_b)) -- вернёт группировку по (col_a) и по (col_a, col_b)

```
_Пример_
```postgresql
SELECT supplier_id, category_id, SUM(units_in_stock)
FROM products
GROUP BY GROUPING SETS ((supplier_id), (supplier_id, category_id))
ORDER BY supplier_id, category_id NULLS FIRST;
```
- ROLLUP - сокращённый вариант GROUPING SET
```postgresql
ROLLUP (col_a, col_b)
```
_Пример_
```postgresql
SELECT supplier_id, category_id, SUM(units_in_stock)
FROM products
GROUP BY ROLLUP(supplier_id, category_id) 
ORDER BY supplier_id

```
- CUBE генерирует агрегированный набор **для всех комбинаций** значений в столбцах указанных в скобках (порядок следования неважен)
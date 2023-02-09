---
tags: postgresql
---
**ANALYZE**
- Собирает статистику по данным таблицы
- Планировщик смотрит на статистику при построении плана
```postgresql
ANALYZE [table_name[(column1, column2...)]]
```
- Запускать как минимум один раз в день
- **[autovacuum](psql_VACUUM.md)** (если включён) в том числе запускает ANALYZE 

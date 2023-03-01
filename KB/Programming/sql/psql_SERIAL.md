tags: sql_operation
---
Правильный способ создания serial  в [[MOC-PostgreSql]]:
```sql
book_id int GENERATED ALWAYS AS IDENTITY
```

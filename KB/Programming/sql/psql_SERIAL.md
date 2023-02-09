tags: sql_operation
---
Правильный способ создания serial  в [[PostgreSql]]:
```sql
book_id int GENERATED ALWAYS AS IDENTITY
```

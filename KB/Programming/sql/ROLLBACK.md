---
tags: [sql, pgsql]
---

**ROLLBACK** - прервать текущую транзакцию. Можно *откатывать* к [[SAVEPOINT]]

```sql
SAVEPOINT savepoint_name
....
ROLLBACK TO savepoint_name
```
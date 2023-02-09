---
tags: [sql, pgsql]
date: 7.04.2022
---

**Транзакция** - это законченная [атомарная](атомарность_транзакции.md) операция над базой данных.
See also:

Чтобы посмотреть уровень изоляции:
```sql
SHOW default_transaction_isolation;
```
Указать уровень тразнзакции:
```sql
SET TRANSACTION ISOLATION LEVEL
```
Чтобы начать транзакцию:
```sql
BEGIN TRANSACTION / START TRANSACTION -- Postgresql
```
Для того чтобы закончить её:
```sql
END [TRANSACTION] / COMMIT -- Postgresql
```

В транзакциях можно делать [save-point](SAVEPOINT.md) и потом [откатить](ROLLBACK.md)
[fff](Транзакции+в+PSQL)

---
reference:
[[свойства транзакции (ACID)]]
[[уровни изоляции транзакции]]
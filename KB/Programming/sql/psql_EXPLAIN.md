---
tags: postgresql
---

**EXPLAIN** _query_ позволяет посмотреть на **план выполнения запроса**, в котором мы можем посмотреть каким [методом](psql_Методы%20сканирования%20Данных.md) прошло сканирование данных. А также **cast**, так называемые накладные расходы, которые возникают.
**Cast** - это догадка планироващика о том, как будет выполняться statement (сумма затрат на input-output + cpu )

Чтобы узнать план и реальность, вместе с **EXPLAIN** используется параметр [ANALYSE](psql_ANALYSE.md)
```postgresql
EXPLAIN ANALYSE SELECT * FROM orders;
```
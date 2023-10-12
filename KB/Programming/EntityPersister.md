---
created: Thursday 12th October 2023 11:53
Last modified: Thursday 12th October 2023 11:52
Aliases: hibernate
Tags: programming
---

📌 Сущность, которая хранится в метамодели [[SessionFactory]], которая занимается маппингом [[ООП]] модель в **Реляционную**.
По-сути EntityPersister - это класс который отвечает за [[Crud]] операции над нашими сущностями

Для каждой [[Hibernate entity]] мапится свой `EntityPersister`


```java
private EntityPersister locateEntityPersister(Class entityClass)
```

Т.е. класс нашей сущности является *ключом*, по которому мы получаем наш *EntityPersister*, в котором по *id* мы уже можем получить нашу сущность

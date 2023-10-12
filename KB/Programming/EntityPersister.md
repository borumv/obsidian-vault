---
created: Thursday 12th October 2023 11:53
Last modified: Thursday 12th October 2023 11:52
Aliases: hibernate
Tags: programming
---

📌 Сущность, которая хранится в метамодели [[SessionFactory]], которая занимается маппингом [[ORM]] на [[ООП]] модель.

Для каждой [[Hibernate entity]] мапится свой `EntityPersister`


```java
private EntityPersister locateEntityPersister(Class entityClass)
```



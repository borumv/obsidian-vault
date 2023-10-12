---
created: Tuesday 16th May 2023 13:34
Last modified: Tuesday 16th May 2023 13:34
Aliases: first level cache
Tags: programming
---

**FirstLevel Cache** - это кэш, который есть в Hibernate, он у нас по-умолчанию и его никогда *не отключить*. Он хранится в объекте нашей [[Session class Hibernate|сессии]] в поле **`persistenceContext`**. 
Изменение сущности, которая находится в кэше может привести к [[Dirty Session]]

Чтобы удалить сущность из кэша можно вызвать **`session.evict(user)`**, а чтобы удалить все сущности - **`session.clear()`** или просто закрыть нашу сессию - **`session.close()`**

```java
private HashMap<EntityKey, Object> entitiesByKey;
```
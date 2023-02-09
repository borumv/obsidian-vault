---
tags: [java, hibernate]
---
**Оптимистик локи** следует использовать когда мы _читаем часто, а пишем редко_. Это связано с тем, что мы ловим эксепшн при параллельной транзакции
@Version
```java
@OptimisticLocking (type = OptimisticLockType.VERSION)
public class OptEx{
@Version
Long id;
}
```

Если во время update произошёл ещё какой-то update, то обновится согласно первой транзакции, а вторая выкинет OptimisticLockException, который можно обработать (например сделать session.rollback())
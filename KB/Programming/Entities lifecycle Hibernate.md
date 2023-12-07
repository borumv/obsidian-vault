---
created: Tuesday 16th May 2023 13:40
Last modified: Tuesday 16th May 2023 13:40
Aliases: entities lifecycle in Hibernate, жизненный цикл сущностей в hibernate
Tags: programming
---
У каждой сущности в [[📙Hibernate]] может быть 4 основных состояния:
1. Transient. Любой _новый_ объект первоначально находится во _временном_ состоянии. 
2. Persistent. Если мы вызываем метод *`save()`* -> объекты помещаются в [[First level cache Hibernate (Persistent context)|кэш]] 
3. Detached
4. Removed

![[Pasted image 20230516134733.png|1000]]
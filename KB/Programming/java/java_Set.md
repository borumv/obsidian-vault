---
tags: java, javadoc
---

Интерфейс **Set** заботится об уникальности хранимых объектов
Уникальность определяется реализацией метода **[equals()](java_Equals.md)**




**Иерархия**
Интерфейс-наследник - [SortedSet](java_SortedSet), [NavigableSet](java_NavigableSet)
Классы-реализации - [HashSet](java_HashSet.md), [LinkedHashSet](java_LinkedHashSet.md) [TreeSet](java_TreeSet.md)

![[Pasted image 20220820173549.png]]

[NavigableSet](java_NavigableSet) реализует метод **ceiling()** - возвращает наименьший элемент в множестве, который **больше** чем указанный элемент. 
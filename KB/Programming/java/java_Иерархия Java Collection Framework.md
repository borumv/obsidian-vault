---
tags: java, javadoc
---
Во главе иерархи стоит интерфейс [Iterable](java_Iterable.md) (появился с версии **1.5**), в котором есть единственный метод **iterator()**, который создаёт объект [итератора](java_Iterator.md). 
> На самом в **Iterable** есть также два дефолтных метода, которые появились с java 1.8 - **forEach()** и **spliterator()**

Но интерфейс **Iterable** появился после интерфейса **[Collection](java_Collection.md)** (появился с версии **1.2**), хоть по иерархии он стоит **выше**
От **Collection** наследуются 3 интерфейса - **[List](java_List.md)** (Обычный список, разрешена индексация), **[Set](java_Set.md)** и **[Queue](java_Queue.md)** 
Отдельно от интерфейса Collection стоит  интерфейс **[Map](java_Map.md)**


**Set** наследует интерфейсы **[SortedSet](java_SortedSet)** (сортирует по природному правило сортировки, либо можно передать [компоратор](java_Comparator.md)) , а его наследует **[NavigableSet](java_NavigableSet)** 

**Queue**[(FIFO](FIFO)) наследует интерфейс **[Deque](java_Deque.md)**(появился с версии **1.6**, [LIFO](LIFO.md))

**Map** наследуют [SortedMap](java_SortedMap), а его наследует **[NavigableMap](java_NavigableMap)** (также как в **Set**)


**Реализации интерфейсов коллекции**
1) List -> [ArrayList](java_ArrayList.md), [LinkedList](java_LinkedList.md), [Stack](java_Stack)(**deprecated**, на замену пришёл [Deque](java_Deque.md)) [Vector](java_Vector) (**deprecated**, потому что методы в нём были синхронизированы)
2) Set -> **[HashSet](java_HashSet.md)**, [LinkedHashSet](java_LinkedHashSet.md), [TreeSet](java_TreeSet.md)(двоичное дерево) (он реализует **SortedSet**)
3) Queue -> **LinkedList** (вместе с **List**), [PriorityQueue](java_PriorityQueue.md), [ArrayDeque](java_ArrayDeque), 
4) Map -> **[HashMap](java_HashMap)**, **[HashLinkedMap](java_HashLinkedMap)**(и много других)



![[Pasted image 20230808160408.png|400]]


**Иерархия**
>[!INFO]
>**Методы**
---
created: Sunday 30th April 2023 09:38
Last modified: Sunday 30th April 2023 09:38
Aliases: куча
Tags: programming
---

Не путать с [[Heap - структура данных]]

Один из участков [[Java Memory Model|модели памяти в Java]]. Это общее пространство для всех потоков приложения. Размер этой области настраивается с помощью параметра `-Xms` (минимальный размер) и `-Xmx` (максимальный размер)

**ЧТО ХРАНИТСЯ?**
- Объекты (ссылочные типы данных)

Для оптимизации, память в куче разделена ещё на 4 области, в которые объекты помещаются в зависимости от их "возраста"
1. *Young Generation* (молодое поколение). Здесь создаются *новые объекты*. 
Она разделена на 3 части:
- Eden (Эдем) - в этом пространстве выделяется память для объекта при создании используя ключевое слово *new*. Большинство из новых объектов помещаются в Эдеме. Когда эта область заполняется объектами, включается [[Сборщик мусора в Java]]
Survivor Spaces - это пространство, в котором находятся объекты, которые выжили после работы [[Сборщик мусора в Java|сборщика мусора]]. 
- S0
- S1
`–Xmn` – устанавливает размер young generation.
2. *Old Generation* (старое поколение). Здесь хранятся давно живущие объекты, которые прошли все этапы сборки мусора в *young generation*
![[Pasted image 20230429140516.png]]

Для очистки от более неиспользуемых объектов (те объекты, на которые никто больше не ссылается), используется [[Сборщик мусора в Java]] 
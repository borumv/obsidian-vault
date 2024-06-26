---
tags: algorithms, решение_задачи
---

**Деревья (Tree)** - это нелинейная, иерархическая структура данных, которая состоит из узлов, соединённым ребрами
Типы деревьев
- [[Бинарное Дерево - структура данных|бинарное дерево]]

[[Менеджер памяти с помощью Tree Data Structure]]

**НЕ БИНАРНЫЕ ДЕРЕВЬЯ**
- У узлов дерева может быть и больше двух сыновей, тогда их нужно хранить **списком**
- **Примеры** -  дерево каталогов и файлов, html-документы (DOM- дерево), дерево классов в программе и т.д.
- Обходим так же как бинарное, просто запуская рекурсивную функцию для всех детей

**СЕРИАЛИЗАЦИЯ ДЕРЕВА ХАФФМАНА**
- Алгоритм Хаффмана позволаяет сопоставить **более часто встречающимся** символам более **короткий код**
- Каждый раз берём два самых редко встречающихся символа и объединяем их в один узел
- Строим бинарное дерево, кладем буквы в листья. Переход в левого сына кодируется числом 0, в правого, а код символа - это все ребра на пути от корня до листа
- В притмере буква"а" встречается 4 раза, "б" - 3 раза, а "в" и "г" по одному разу

![[Pasted image 20220830101546.png]]

**КАК СОХРАНИТЬ СТРУКТУРУ ДЕРЕВА В ВИДЕ СТРОКИ?**
- **L** - в левого ребенка, **R** - в правого, **U** - в предка
	- **LURLLURUURUU**
- **D** - в наиболее левого непосещенного ребенка (детей всегда либо два, либо ноль)
	- **DUDDDUDUUDUU**
- Теперь **U** означает, что мы поднимаемся вверх до тех пор, пока приходим из правого ребенка. Если пришли в вершину из левого ребенка - сразу пойдем в правого
	- **DUDDUU**

>[INFO]
>**Восстановление дерева по записи**
>**D** - в наиболее левого непосещенного ребенка (детей всегда либо два, либо ноль)
>**U** - поднимаемся вверх до тех пор, пока приходим из правого ребенка. Если пришли в вершину из левого ребенка -  сразу пойдем в правого
>**DDUUDU**
>![[Pasted image 20220830103413.png]]
>
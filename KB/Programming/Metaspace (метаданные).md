---
created: Sunday 30th April 2023 09:45
Last modified: Sunday 30th April 2023 09:45
Aliases: метапространство в java memory model
Tags: programming
---

Общее пространство в [[Java Memory Model]] для всех потоков. Это часть *native memory*. В отличии от *PermGen* (который был до Java 8) она расширяется автоматически

**ЧТО ХРАНИТСЯ?**
- Метаданные классов
- Статические переменные


В метаспэйсе есть несколько областей:
- Method area
- Run-Time Constant Pool

Метапространство также очищается **[[Сборщик мусора в Java|сборщиком мусора]]**, после того как достигается пороговое значение (aka *High water mark*). Есть две JVM-опции `-MeaspaceSize` и `MaxMetaspaceSize`.
Верхний предел объём метаданных можно настроить с помощью параметра `MaxMetaspaceSize`.
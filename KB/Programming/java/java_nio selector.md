---
created: Tuesday 20th December 2022 11:05
Last modified: Tuesday 20th December 2022 11:05
Aliases: селектор в nio, селекторы
Tags: java
---

# [[java_nio selector]]


Сущности в пакете [java nio](java_NIO.md) которые связывают несколько [каналов](java_chanell).

>Чтобы лучше понять концепцию и выгоду от применения селекторов, давайте абстрагируемся от программирования и представим себе железнодорожный вокзал. Вариант без селектора: есть три железнодорожных пути (каналы), на каждый из них в любой момент времени может прибыть поезд (данные из буфера), на каждом пути постоянно ожидает сотрудник вокзала (поток выполнения), задача которого – обслуживание прибывшего поезда. В результате трое сотрудников постоянно находятся на вокзале даже если там вообще нет поездов. Вариант с селектором: ситуация та же, но для каждой платформы есть индикатор, сигнализирующий сотруднику вокзала (поток выполнения) о прибытии поезда. Таким образом на вокзале достаточно присутствия одного сотрудника.

![[Pasted image 20221128142415.png]]
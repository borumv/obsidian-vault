---
created: Sunday 30th April 2023 09:47
Last modified: Sunday 30th April 2023 09:47
Aliases: кэш кода в памяти java
Tags: programming
---


Область в [[Java Memory Model]]. [[JIT-компилятор]] компилирует часто исполняемый код и преобразует его в нативный машинный код и *кеширует* для быстрого использования. 

**ЧТО ХРАНИТСЯ?**
- Закэшированный нативный код, который часто используется
- Весь cкомпилированный код [[JIT-компилятор|jit-компилятора]]

`-XX:InitialCodeCacheSize`
`-XX:ReservedCodeCacheSIze` 
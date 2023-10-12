---
created: Tuesday 16th May 2023 10:29
Last modified: Tuesday 16th May 2023 10:29
Aliases: session
Tags: programming
---

Session является *обёрткой* вокруг *Connection*, которая работает с сущностями. Это всего лишь *интерфейс*, в котором есть основные методы для работы с сущностями баз данных. 
Именно благодаря Session мы контролируем [[Entities lifecycle Hibernate]]

У каждой сессии есть свой **`PersistenceContext`** - это является [[First level cache Hibernate|кэшом]]

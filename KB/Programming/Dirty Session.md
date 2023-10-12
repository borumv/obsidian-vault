---
created: Tuesday 16th May 2023 13:36
Last modified: Tuesday 16th May 2023 13:36
Aliases: грязное чтение 
Tags: programming
---

**Dirty Session** - Важно понимать, что все изменения с нашей сущностью, которая уже находится в **`persistenceContext`** (в [[First level cache Hibernate (Persistent context)|кэше]], который хранится в [[Session class Hibernate|session]]) отобразятся и на ce в базе данных. Т.е. если мы изменим какое-то поле, то это поле также обновится в базе данных.
Чтобы проверить, была ли сессия грязной, для этого есть специальный метод - **`session.isDirty()`** 


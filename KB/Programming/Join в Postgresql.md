---
created: Wednesday 24th May 2023 10:34
Last modified: Wednesday 24th May 2023 10:33
Aliases: join
Tags: programming
---

В [[MOC-PostgreSql|postgresql]] есть следующие типы соединений:
- **INNER JOIN**
При проведении внутреннего соединения, в итоговое отображение попадут только те записи из первой таблицы, которым *есть соотвествие по ключу* во второй таблице. Все остальные строки просто отсекаются
- **LEFT/RIGHT JOIN**
При проведении внешнего правого/левого соединения, в итоговый набор наберут весь набор данных из правой/левой таблицы

- **CROSS JOIN** - [[декартово произведение множеств]]
- **SELF JOIN**


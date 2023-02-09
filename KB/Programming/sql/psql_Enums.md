---
tags: postgresql
---

**Перечисления(Enums)** - это [пользовательский тип](psql_Пользовательские%20типы.md) 
- Служит **заменой** элементарной **справочной таблицы** (_цвета светофора_)
- Между собой enum **нельзя сравнивать** (в Postgresql)
- **Накладывает ограничения** на **добавление** в колонку типа перечисления, которое отсутствует в перечислении. В этом, собственно, и есть смысл енамов
- Значения **регистрозависимы**
```postgresql
CREATE TYPE type_name AS ENUM ('value1', 'value2', ...)
```
_Пример_
```postgresql
CREATE TYPE chess_title AS ENUM
('Candidate Master','FIDE Master','International Master')
SELECT enum_range (null::chess_title) -- Чтобы посмотреть все значения enuma
--добавление нового значения
ALTER TYPE chess_title
ADD VALUE 'Grand Master' AFTER 'International Master'; -- можно указать после какого значения ставить
```
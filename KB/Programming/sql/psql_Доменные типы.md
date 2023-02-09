---
tags: postgresql
---

**Домен**  - [пользовательский типы](psql_Пользовательские%20типы.md) с ограничениями
_Создание_
```postgresql
CREATE DOMAIN domain_name AS data_type CONSTRAINTS
```
```postgresql
CREATE DOMAIN text_no_space_null AS TEXT NOT NULL CHECK (value !¬'\s`)
```
_Изменение домена_
```postgresql
ALTER DOMAIN domain_name ADD CONSTRAINT new_constraint [NOT VALID]
```
```postgresql
ALTER DOMAIN domain_name VALIDATE CONSTRAINT new_constraint
```

_Пример создания домена, с ограничением пробела и пустоты_
```postgresql
CREATE DOMAIN text_no_space_null AS TEXT NOT NULL CHECK (value ~ '^(?!\s*$).+');

CREATE TABLE agent (
	first_name text_no_space_null,
	last_name text_no_space_null
);

INSERT INTO agent
VALUES ('bob', 'taylor');

```

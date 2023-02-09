**Создание триггера:**
```postgresql
CREATE TRIGGER trigger_name() condition ON table_name
FOR EACH ROW EXECUTE PROCEDURE function_name()
```

**Condition:**
*[BEFORE, AFTER]* ,  *[INSERT, UPDATE, DELETE]*
**Например:**
BEFORE INSERT
AFTER UPDATE
BEFORE INSERT OR UPDATE


**Функции на построчные триггеры**

```postgresql
CREATE FUNCTION func_name() RETURNS trigger AS $$
BEGIN
-----
END;
$$ LANGUAGE plpgsql;
```

- Через аргумент NEW есть доступ к вставленным и модифицированным строкам (INSERT/UPDATE триггеры)
- Через аргумент OLD есть доступ к вставленным и удалённым строкам (UPDATE/DELETE триггеры)

*Практика по возврату триггеров:*
- Должна возвращать NULL или запись, соотствующую структуре таблицы, на которую будет вешаться триггер!
- Если BEFORE-триггер возвращает NULL, то сама операция и AFTER-триггеры будут отменены
- BEFORE-триггер может изменить строку (INSERT/UPDATE) через NEW и тогда операция и AFTER-триггеры будут работать с изменённой строкой
- Если BEFORE-триггер не "хочет" изменять строку, то надо просту вернуть NEW
- В случае BEFORE-триггера реагирующего на DELETE, возврат не имеет значение (кроме NULL: отменит DELETE)
- NEW = null при DELETE, так что если BEFORE-триггер хочет дать ход DELETE, надо вернуть OLD
- Возвращаемое значения из построчного AFTER-триггера (или из BEFORE и из AFTER триггеров на утверждения) игноируется -> можно возвращать NULL
- Если построчный AFTER-тригге или триггер на утверждение хочет отменить операцию -> raise exception
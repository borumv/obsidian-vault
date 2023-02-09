```postgresql
RAISE [level] 'message (%)', org_name;
```
**level** - уровень серьёзности ошибки:
	- _DEBUG_ - отладка
	- _LOG_ - лог
	- _INFO_ - информация
	- _NOTICE_ - замечание
	- WARNING - потенциальная опасность
	- _EXCEPTION_ - исключение/ошибка (абортирует текущую [транзакцию](psql_транзакции%20в%20PSQL.md), т.е. будет сделан [[ROLLBACK]])

Ошибки, которые мы выбрасываем исключением могут логироваться. То, какие ошбики будут записываться, регулируются параметром:
**log_min_messages** - регулирует уровень сообщений, которые будут писаться в лог сервера (WARNING - по умолчанию)
**client_min_messages** - регулирует уровень сообщений, которые будут передаваться вызывающей стороне (NOTICE - по умолчанию)

**HINT** (_подсказка_) и **ERRORCODE** (_номер ошибки_):
- Параметры присоединяются с помощью USING:
	```postgresql
	RAISE 'invalid billing number=%', number USING HINT = 'Chteck out the 
         billing number' ERRORCODE='12881'
```

Чтобы **поймать исключение** нужен блок **EXCEPTION WHEN**:
```postgresql 
EXCEPTION WHEN condition [others] THEN handling_logic
```

**ПРИМЕРЫ**
```postgresql
CREATE OR REPLACE FUNCTION get_season(number_month int)
  RETURNS text AS $$
	DECLARE
		season text;
	BEGIN
		IF number_month NOT BETWEEN 1 AND 12 THEN
		RAISE EXCEPTION 'INVALID month, u typed %', number_month USING HINT = 'You can to type month in between 1 and 12', ERRCODE = 32333;
		END IF;
		IF number_month BETWEEN 9 AND 11 THEN
			season = 'winter';
		ELSEIF	number_month BETWEEN 3 AND 5 THEN
			season = 'spring';
		ELSEIF number_month BETWEEN 6 AND 8 THEN
			season = 'summer';
		ELSE
			season = 'winter';
		END IF;
		
		RETURN season;
		
	END;
	$$
  LANGUAGE plpgsql 

SELECT get_season(15)
```

_Обработка ошибки_
```postgresql
CREATE OR REPLACE FUNCTION get_season_caller(number_month int)  RETURNS text AS $$
	DECLARE
	
		err_ctx text;
		err_msg text;
		err_details text;
		err_code text;
		
	BEGIN
		RETURN get_season(number_month);
	EXCEPTION WHEN SQLSTATE '32333' THEN
		GET STACKED DIAGNOSTICS
			err_ctx = PG_EXCEPTION_CONTEXT,
			err_msg = MESSAGE_TEXT,
			err_details = PG_EXCEPTION_DETAIL,
			err_code = RETURNED_SQLSTATE;
		
		RAISE INFO 'My custom handler';
		RAISE INFO 'err_ctx = %', err_ctx;
		RAISE INFO 'err_msg  = %', err_msg;
		RAISE INFO 'err_details = %', err_details;
		RAISE INFO 'err_code = %', err_code;
		
		RAISE INFO 'Nothing special. Dont worry';
		RETURN NULL;
	END;

$$ LANGUAGE plpgsql
```
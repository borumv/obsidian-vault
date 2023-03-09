**DDL** - Data Definition Language.

**CREATE TABLE** *table_name*
**ALTER TABLE** *table_name*
	**ADD COLUMN** *column_name* ***data_type*** // добавляет колонку
	**RENAME TO** *new_table_name* //переименовать таблицу
	**RENAME** *oled_column_name* **TO** *new_column_name* // переименовать столбец
	**ALTER COLUMN** *column_name* **SET DATA TYPE** ***datat_type*** //задать новый тип данных для столбца
**DROP TABLE** *table_name*
**TRUNCATE TABLE** *table_name* //удаляет все данные из таблицы, но не может удалить данные на которые есть ссылка по внешнему ключу
**DROP COLUMN** *column_name*
 
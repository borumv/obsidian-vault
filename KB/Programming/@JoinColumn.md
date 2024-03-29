---
created: Monday 27th March 2023 14:28
Last modified: Monday 27th March 2023 14:28
Aliases: аннотация joinColumn в Hibernate
Tags: programming
---

Аннотация @JoinColumn в [[📙Hibernate]] используется для настройки связи между двумя сущностями, когда одна сущность имеет ссылку на другую. Это наиболее часто используется в следующих случаях:+
1. Связь многие-к-одному ([[@OneToMany и @ManyToOne|@OneToMany]]) и один-к-одному ([[@OneToOne]]): в этом случае аннотация *@JoinColumn* используется *для определения колонки в таблице*, *которая будет хранить внешний ключ*. Например, при связи многие-к-одному, каждый элемент коллекции будет иметь ссылку на одну сущность, и внешний ключ будет храниться в таблице, соответствующей элементу коллекции.
    
2. Связь один-к-многим ([[@OneToMany и @ManyToOne|@ManyToOne]]) и многие-к-многим ([[@ManyToMany]]): в этом случае аннотация @JoinColumn используется для определения колонки в таблице, которая будет хранить внешний ключ, указывающий на родительскую сущность. Например, при связи один-к-многим, каждый элемент коллекции будет иметь ссылку на одну сущность-родителя, и внешний ключ будет храниться в таблице, соответствующей элементу коллекции.
    
3. Связь OneToOne с использованием общей первичной ключевой колонки (Shared Primary Key): в этом случае аннотация @JoinColumn используется для указания имени колонки, которая будет использоваться в качестве общей первичной ключевой колонки для двух связанных таблиц.

Параметры аннотации @JoinColumn:

- name (обязательный) - имя колонки в таблице базы данных, которая будет хранить внешний ключ для связи между двумя таблицами.
    
- referencedColumnName (опциональный) - имя колонки в таблице, на которую ссылается внешний ключ. По умолчанию, значение параметра равно идентификатору связанной сущности.
    
-   nullable (опциональный) - указывает, могут ли значения внешнего ключа быть пустыми (NULL) или нет. По умолчанию значение параметра равно true, что означает, что внешний ключ может быть пустым.
    
-   unique (опциональный) - указывает, должны ли значения в колонке быть уникальными или нет. По умолчанию значение параметра равно false.
    
-   insertable (опциональный) - указывает, должно ли значение колонки быть включено в SQL-запрос для вставки новых строк в таблицу. По умолчанию значение параметра равно true.
    
-   updatable (опциональный) - указывает, должно ли значение колонки быть включено в SQL-запрос для обновления строк в таблице. По умолчанию значение параметра равно true.
    

Например, для определения связи ManyToOne между сущностями "Товар" и "Категория" можно использовать аннотацию @JoinColumn следующим образом:

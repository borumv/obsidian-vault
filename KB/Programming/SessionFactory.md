---
created: Tuesday 16th May 2023 12:44
Last modified: Tuesday 16th May 2023 12:44
Aliases: sessionFactory в Hibernate
Tags: programming
---

**SessionFactory (org.hibernate.SessionFactory)** — неизменяемый потокобезопасный объект с компилированным маппингом для одной базы данных. Необходимо инициализировать SessionFactory всего один раз. Экземпляр SessionFactory используется для получения объектов [[Session class Hibernate|session]], которые используются для операций с базами данных.

![[Pasted image 20230516124656.png]]

В `SessionFactory` есть метамодель, которая строится на основании тех [[Hibernate entity|сущностей]], которые мы туда добавили + все типы, которые мы добавили сами или добавил Hibernate по-умолчанию.
Для каждой сущности маппится свой *`EntityPersister`*, который знает как выполнять **CRUD** запросы для наших сущностей. Т.е. именно **EntityPersister** занимается реализацией [[ORM]]. 


### Создание объекта SessionFactory

```java
Configuration configuration = new Configuration();
configuration.configure();
SessionFacotry sessionFactory = configure.buildSessionFactory();
```


see: [[Cache Hibernate|Кэширование в Hibernate]]



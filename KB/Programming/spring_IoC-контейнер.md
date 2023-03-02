
---
created: Saturday 11th February 2023 13:02
Last modified: Monday 18th July 2022 13:42
Aliases: IoC
Tags: spring, java
---

# [[spring_IoC-контейнер]]

📌**IoC-контейнер** - это объект, который занимается созданием других объектов и внедрением в них зависимостей ([[spring_Dependency Injection|DI]]). Он реализует интерфейсы `org.springframework.beans.factory.BeanFactory` и `org.springframework.context.ApplicationContext`. Поэтому, когда мы говорим об **IoC-контейнере**, мы также говорим об [[spring_Context|контексте спринга]]

[[📙Spring|Спринг]] строится на реализации [IoC-контейнера](IoC.md)

**Как работает?**
- Сначала читаются [[spring_Bean Definitions|метаданные]](**Bean definitions**) (xml, java-классы)
- По метаданным считываются все необходимые POJO-объекты
- Создаются [[spring_Beans|бины]]

![[Pasted image 20230302153330.png|300]]

- Проставляются зависимости


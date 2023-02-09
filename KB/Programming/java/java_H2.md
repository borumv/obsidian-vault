---
created: Tuesday 7th February 2023 13:14
Last modified: Tuesday 7th February 2023 13:14
Aliases: база данных H2
Tags: java
---

# [[java_H2]]

📌 H2 - это база данных, которая находится в оперативной памяти. 

pom:
```xml
<dependency>  
   <groupId>com.h2database</groupId>  
   <artifactId>h2</artifactId>  
   <scope>runtime</scope>  
</dependency>
```
Чтобы был визуальный интерфейс в application.properties:
```java
spring.h2.console.enabled=true
```
Работает по адресу `MY_HOST:MY_PORT/h2-console`
В **JDBC URL** следует указать - `jdbc:h2:mem:testdb`
---
created: Monday 10th April 2023 12:31
Last modified: Monday 10th April 2023 12:30
Aliases: как подключить junit к spring boot
Tags: programming
---

Чтобы подключить к [[JUnit|junit]] версиии 5 в [[spring_Boot|spring boot]] необходимо сделать следующие шаги:
1. Подключить модуль API `unit-jupiter-api` (интерфейсы и аннотации для написания тестов)
```xml
<dependency>  
    <groupId>org.junit.jupiter</groupId>  
    <artifactId>junit-jupiter-api</artifactId>  
    <scope>test</scope>  
</dependency>
```
2. Подключить движок `unit-jupiter-engine` (чтобы запускать тесты) 
```xml
<dependency>  
    <groupId>org.junit.jupiter</groupId>  
    <artifactId>junit-jupiter-engine</artifactId>  
    <version>5.9.2</version>  
    <scope>test</scope>  
</dependency>
```
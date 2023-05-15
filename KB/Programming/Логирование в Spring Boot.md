---
created: Monday 15th May 2023 09:09
Last modified: Monday 15th May 2023 09:09
Aliases: logs
Tags: programming
---

Уровни логирования:
1. **TRACE** 
2. **DEBUG**
3. **INFO**
4. **WARN**
5. **ERROR**
6. **FATAL**

Стоит понимать, что один уровень покрывает другой если мы идём от *FATAL* (самого локализованного) до *TRACE*

Указать уровень логирования в `application.properties`:
```java
logging.level.root=WARN
```
Указать место для логирование (если это файл):
```java
logging.file.name=application.log  
logging.file.path=/
```

Чтобы посмотреть логику нашего логера мы можем зайти в spring-boot по адресу `.m2\repository\org\springframework\boot\spring-boot\3.0.6\spring-boot-3.0.6.jar!\org\springframework\boot\logging\logback\base.xml` где находится *xml файл-конфигурация* того, как выглядит наш логер и куда выгружает информацию (appender-ы):
```xml
<?xml version="1.0" encoding="UTF-8"?>  
  
<included>  
	   <include resource="org/springframework/boot/logging/logback/defaults.xml" />  
	   <property name="LOG_FILE" value="${LOG_FILE:-${LOG_PATH:-${LOG_TEMP:-${java.io.tmpdir:-/tmp}}}/spring.log}"/>  
	   <include resource="org/springframework/boot/logging/logback/console-appender.xml" />  
	   <include resource="org/springframework/boot/logging/logback/file-appender.xml" />  
	   <root level="INFO">  
	      <appender-ref ref="CONSOLE" />  
	      <appender-ref ref="FILE" />  
	   </root>
   </included>
```

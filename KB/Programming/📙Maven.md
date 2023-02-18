---
Aliases: мавен, maven, мок
Tags: Maven moc
---
## MOC

**Maven** - сам по себе, это программа, которая парсит XML и передаёт дальше управление **[[Maven plugins|плагинам мавена]]**
- [[Команды командной строки Maven]]
- [[Maven Lifecycle|Жизненный цикл Maven]]

## POM
Это основной файл, где мы прописываем все [[📙Maven|maven]] - зависимости. Он наследуется от **супер-poma** который подкачивает для нас сразу же маст-хэв [[Maven plugins|плагины]] и устанавливает адреса [[maven repositories|репозиториев]]. В итоге формируется ***effective pom***, который является *смесью* нашего pom и super-pom. 
***Чтобы посмотреть effective pom:***
```java
mvn help:effective-pom
```


Maven координаты, которые облегчают доступ к репозиторию, в случае, если мы захотим выложить наш код куда-нибудь. 
```xml
  <groupId>com.boris</groupId> //url компании
  <artifactId>lessons</artifactId> //имя проекта
  <version>1.0-SNAPSHOT</version> //версия проекта
```
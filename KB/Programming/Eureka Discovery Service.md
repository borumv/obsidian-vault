---
created: Saturday 3rd June 2023 09:51
Last modified: Saturday 3rd June 2023 09:50
Aliases: spring cloud eureka
Tags: programming
---

*Eureka* - это своего рода распределитель, который знает по каким портам находятся наши [[Microservices|микросервисы]]. Т.е. нам не нужно хардкодить в нашем приложении, указывая все адреса api внутри какого то контроллера. Eureka берёт на себя всю эту работу.
Если у нас больше микросервисов чем нам нужно, мы можем остановить некоторые из них и Eureka удалить их у себя *автоматически*

**[[API Gateway]]** - это лоад балансер.

![[Pasted image 20230603095946.png]]

### Подключение
maven:
```xml
<dependency>
  <groupId>org.springframework.cloud</groupId>
  <artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
</dependency>
```
application.properties:
```json
spring.application.name=eureka-server  
server.port=8761  
eureka.client.register-with-eureka=false  
eureka.client.fetch-registry=false
```
- `spring.application.name` — уникальное имя для вашего приложения.
- `server.port` — порт, на котором будет запущено ваше приложение, мы будем использовать порт по умолчанию (8761).
- `eureka.client.register-with-eureka` — определяет, регистрируется ли сервис как клиент на Eureka Server.
- `eureka.client.fetch-registry` — получать или нет информацию о зарегистрированных клиентах.
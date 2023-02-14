
---
created: Tuesday 14th February 2023 09:37
Last modified: Tuesday 14th February 2023 09:37
Aliases: profile в спринге
Tags: spring, java
---

# [[spring_Profile|Profile]]

📌Используется, когда у нас есть несколько реализаций одного и того же контроллера в зависимости от внешних факторов (например - языка).

Суть:
- аннотацией **Qualifire** мы отмечаем тот интерфес, который мы инджектим в контроллер
```java 
GreetingService greetingService;  
  
public InternalizationController(@Qualifier("internalizationService") GreetingService greetingService) {  
    this.greetingService = greetingService;  
}
```
- Используем это имя (то, что указывали в qualifire в атрибутах аннотации **Service**)
```java
@Service("internalizationService")  
@Profile("EN")  
public class GreetingServiceInternalizationEn implements GreetingService{  
    @Override  
    public String hello() {  
        return "Hello - EN";  
    }  
}

@Service("internalizationService")  
@Profile("ESP")  
public class GreetingServiceInternalizationEsp implements GreetingService{  
    @Override  
    public String hello() {  
        return "Hello - ESP";  
    }  
}
```
- В зависимости от того, какой нам нужен язык, мы меняем проперти в `application.properties`:
```java
spring.profiles.active = EN
```


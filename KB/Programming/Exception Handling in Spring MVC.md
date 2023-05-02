---
created: Tuesday 2nd May 2023 09:11
Last modified: Tuesday 2nd May 2023 09:11
Aliases: отлов ошибок в Spring MVC
Tags: programming, spring, java
---

**`@ExceptionHandler`** - c помощью этой аннотации можно заниматься отлов ошибок на уровне *контроллера* 
```java
@RestController
public class Example1Controller {

    @GetMapping(value = "/testExceptionHandler", produces = APPLICATION_JSON_VALUE)
    public Response testExceptionHandler(@RequestParam(required = false, defaultValue = "false") boolean exception)
            throws BusinessException {
        if (exception) {
            throw new BusinessException("BusinessException in testExceptionHandler");
        }
        return new Response("OK");
    }

    @ExceptionHandler(BusinessException.class)
    public Response handleException(BusinessException e) {
        return new Response(e.getMessage());
    }

}
```

**`HandlerExceptionResolver`** - интерфейс, который мы можем реализовать для свои кастомных ошибок. Это также является общим интерфейсом, т.е. *все* выброшенные исключения будут обработаны одним из подклассов *HandlerExceptionResonver*. 


Внутри [[spring_MVC|spring mvc]] есть 3 имплементации **`Handler ExceptionResolver`**:
- *`ExceptionHandlerExceptionResolver`* -  этот резолвер является частью механизмов аннотации `@ExceptionHandler`
- *`ResponseStatusExceptionResolver`* - ищет неперехваченные исключения, соотвествующие *`@ResponseStatus`*. Позволяет настроить код ответа для любого исключения.
- *`DefaultHandlerExceptionResolver`* - используется для стандартных исключений Spring  в зависимости от типа исключения

*`SimpleMappingExceptionResolver`* - Сопоставление между именами классов исключений и именами представлений ошибок. Используется для визуализации страниц ошибок в приложении браузера.



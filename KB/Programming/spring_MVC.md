---
created: Tuesday 7th February 2023 13:28
Last modified: Tuesday 7th February 2023 13:25
Aliases: mvc
Tags: spring, java
---

# [[spring_MVC]]

📌 Реализация паттерна [[pattern_MVC|mvc]] 

![[Pasted image 20230207133054.png|500]]

## Как Спринг определяет какое View нам отправлять?

Spring MVC понимает какое view отдавать по типу возвращаемого объекта. В зависимости от этого возвращаются разные реализации интерфейса `ViewResolver`. Например для отображения JSP и HTML - `InternalResourceViewResolver`, а для отображения JSON данных - `JsonViewResolver`


Например, вот метод контроллера, который возвращает объект `ResponseEntity` с JSON данными:

```java
@GetMapping("/books/{id}")
public ResponseEntity<Book> getBookById(@PathVariable Long id) {
    Book book = bookService.getBookById(id);
    if (book == null) {
        return ResponseEntity.notFound().build();
    }
    return ResponseEntity.ok(book);
}
```

В этом методе мы используем класс `ResponseEntity` для возврата JSON данных в ответ на запрос. Если книга с заданным идентификатором не найдена, мы возвращаем объект `ResponseEntity` со статусом 404.

Spring MVC автоматически использует `JsonViewResolver`, чтобы отобразить JSON данные, поскольку это объект `ResponseEntity`. Если бы мы возвращали объект `ModelAndView` вместо `ResponseEntity`, то Spring MVC использовал бы `InternalResourceViewResolver` для отображения JSP или HTML страницы.



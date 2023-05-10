---
created: Wednesday 10th May 2023 13:20
Last modified: Wednesday 10th May 2023 13:20
Aliases: аннотация InitBinder
Tags: programming, spring mvc
---

Аннотация `@InitBinder` указывает на место в коде где происходит донастройка привязчика данных [[WebDataBinder]].
1. В этом месте мы можем указать, какие данные не будут подвергнуты валидации:
```java
@InitBinder
public void initBinder(WebDataBinder dataBinder) {
    dataBinder.setDisallowedFields("age"); // Исключаем поле "age" из привязки данных и валидации
}
```
2. Задать специальный формат для своих данных:
```java
@InitBinder
public void initBinder(WebDataBinder dataBinder) {
    dataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
}
```
3. Регистрация специфических валидаторов:
```java
@InitBinder
public void initBinder(WebDataBinder dataBinder) {
    dataBinder.addValidators(new CustomValidator());
}
```


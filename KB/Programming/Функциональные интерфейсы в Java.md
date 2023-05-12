---
created: Friday 12th May 2023 09:00
Last modified: Friday 12th May 2023 09:00
Aliases: function interfaces
Tags: programming
---

- *Function<T,R>* - обычная функция, принимающая на вход одно значение и возвращающая другое 
```java
R apply(T t)
```
- *Predicate<T,>* - возвращает *булевое* значение, часто используется для фильтрации
```java
boolean test(T t)
```
- *Consumer<T,>* - использует наш объект и ничего не возвращает
```java
void accept(T t)
```
- *Supplier<T,>* - ничего не потребляет, но что-то возвращает
```java
T get()
```
- *BiFunction<T,U,R>* - примером реализации это
```java
R apply(T t, U u)
```

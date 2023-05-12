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

*Stream примитивных типов*
Напрямую с [[примитивные типы|примитивными типами]] stream не может работать. Но для этого существует *функции преобразователи*. Нам дают несколько новых функций
`max()`, `average()`, `min()`, `summaryStatistics()`
```java
List<String> list = List.of("1", "2", "3", "4", "6", "22");  
var intSummaryStatistics = list.stream()  
        .map(Integer::valueOf)  
        .mapToInt(Integer::intValue)  
        .summaryStatistics();  
System.out.println(intSummaryStatistics);
```



Мы можем обратно преобразовать стрим примитивных типов в стрим [[class Object|объектов]] с помощью функции `mapToObj`
```java
List<String> strings = List.of("1", "2", "3", "4","11", "22", "33", "44");  
strings.stream()  
        .map(Integer::valueOf)  
        .mapToInt(Integer::intValue)  
        .mapToObj(Integer::valueOf);
```

Класс **`IntStream`**
1. `of` - создать стрим примитивных объектов 
```java
IntStream.of(1,2,3,4)
```
2. `range` - создание цикла for
```java
IntStream.range(0, 10)
	.forEach(System::out::println)
```
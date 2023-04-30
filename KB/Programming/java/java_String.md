---
created: Friday 20th January 2023 19:25
Last modified: Friday 20th January 2023 19:25
Aliases: строки в java
Tags: java
---

# [[java_String]]

## Где это всё хранится?
Строки в [[📙MOC-JAVA|java]] могут храниться в [[java_String pool|пуле]] или в [[Heap java|куче]] 
В String pool, когда мы напрямую записываем в переменную значение:
```java
String value = "Hello";
```
В куче, когда мы инициализируем через оператор **new**:
```java
String value = new String("Hello")
```

Результаты сравнений:
```java
String value = "Hello";
String value2 = "Hello";

String value3 = new String("Hello")
String value4 = new String("Hello")

value==value2 //true
value==value3 //false, потому что value хранится в String pool, а value3 - в обычном хипе
value3==value4//false, потому что они занимают разное пространство в хипе, следовательно ссылаются на разные ячейки в памяти
```

Пул строк является примером паттерна _«[[pattern_FlyWeight|Приспособленец]]» (Flyweight)_.
see: [[Java Memory Model]]

## Compact String

String сжимается при конструировании:
- Основная беда: конструктор `String(char[] value)`
- Сразу жмём в 1-байтовое кодирование
- Не получилось в 1-байт? Копируем как 2-байтовое
- substring от сжатой строки, тоже сжат
- Для оптимизации Стринга есть coder, который является отдельным полем и указывает на то, наш String - это массив char или массив byte (а также позволяет быстро сравнвиать)
---
created: Friday 20th January 2023 19:43
Last modified: Friday 20th January 2023 19:43
Aliases: пул констант, целые числа в Java
Tags: java
---

# [[java_Integer]]

📌tp.file.cursor(1)

В [[Java Memory Model]] в отличии от [[java_String|стрингом]], позволяет сравнивать значения в диапазоне одного байта (*от -128 до 127*):

```java
	Integer a = 1;
	Integer b = 1;
	Integer c = 128;
	Integer d = 128;
	a==b //true
	c==d //false
```


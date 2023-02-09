---
created: Wednesday 25th January 2023 20:43
Last modified: Wednesday 25th January 2023 20:43
Aliases: как получить аннотацию, getting annotation
Tags: java
---

# [[java_Getting annotation|Получение аннотации]]
parent: [[java_Annotation]]

📌Используя рефлексию, мы получаем аннотацию MyAnno, ассоциированную с методом myMethod()

```java
Class cl = obj.getClass(); 
Method meth = cl.getMethod("myMethod"); 
MyAnno anno = meth.getAnnotation(MyAnno.class);

```


see: [[java_own Annotation|создание собственной аннотации в java]]
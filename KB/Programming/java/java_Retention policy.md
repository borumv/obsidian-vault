---
created: Wednesday 25th January 2023 20:02
Last modified: Wednesday 25th January 2023 20:02
Aliases: политика удержания
Tags: java
---

# [[java_Retention policy]]

📌Настраивается с помощью [[java_integrated Annotation|встроенной аннотации]] ***@Retention***

```java
@Retention (RetentionPolicy.SOURCE,
		   RetentionPolicy.CLASS,
		   RetentionPolicy.RUNTIME,)
```

Существует 3 политики удержания аннотации. 
Политика удержания определяет, в какой точке аннотация сбрасывается: 
• RetentionPolicy.SOURCE – аннотация используется на этапе компиляции и должна отбрасываться [[java_compilator|компилятором]]; • RetentionPolicy.CLASS – аннотация будет записана в class-файл компилятором, но не должна быть доступна во время выполнения (runtime). По умолчанию у всех аннотаций.class. 
• RetentionPolicy.RUNTIME – аннотация будет записана в class-файл и доступна во время выполнения через [[java_Reflection|рефлексию]]

---
created: Wednesday 25th January 2023 19:45
Last modified: Wednesday 25th January 2023 19:45
Aliases: varargs
Tags: java
---

# [[java_Varargs]]

📌Varargs (Variable argument List) - это список с переменным числом параметров в [[📙MOC-JAVA|java]]

```java
public int sum(int... args){  
    int sum = 0;  
    for (int arg : args) {  
        sum += arg;  
    }  
    return sum;  
}
```

Правила:
1) Varargs всегда должен находится **последним** в списке аргументов
```java
public int sum(int ... args, int i) //тут будет ошибка
```
2) Нельзя применять больше 1-го varargs в качестве параметра у метода

---
created: Wednesday 25th January 2023 20:19
Last modified: Wednesday 25th January 2023 20:19
Aliases: создание собственной аннотации в java
Tags: java
---

# [[java_own Annotation]]

📌[[java_Annotation|Аннотации]] создаются с использование механизма, основанного на интерфейсе. 

Пример объявление аннотации: 
```java
@interface MyAnno { 
String str() default "N/A";  // ко всеим полям аннотации неявно дописывается public abstract
int val(); 
}
```


Символ @ – указывает [[java_compilator|компилятору]], что объявлена аннотация. 
Методы, объявленные в аннотации ведут себя скорее как поля. 
Аннотирование метода: 
```java
@MyAnno (str = "Example", val = 123) 
public static void myMethod() { ... }
```


- Default значения должны быть константами но не Object
- Object (в т.о. классы-обёртки) нельзя использовать в аннотациях
- Если мы используем метод `value()`, то мы можем записывать в аннотацию значение без указания названия
```java
@MyAnno ("Example") 
public static void myMethod() { ... }
```
- Аннотация @Target(ElementType....) используется для того, на что именно (метод, поля..) устанавливается аннотация
- [[java_Getting annotation|Как получить аннотацию]]

**Пример аннотации с подсчётом суммы:**
```java

@Documented  
@Retention(RetentionPolicy.RUNTIME)  
public @interface Sum {  
    int value1() default 0;  
    int value2() default 0;  
 }

public class Summing {  
  
    @Sum(value1 = 10, value2 = 20)  
    public void summarize(int i, int b){  
        System.out.println("Sum - "  + (i + b));  
    }  
}
public class TestAnno {  
public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {  
        Class<?> cl = Summing.class;  
        Summing summing = new Summing();  
        Method method = cl.getDeclaredMethod("summarize", int.class, int.class);  
        Sum s = method.getAnnotation(Sum.class);  
        summing.summarize(s.value1(), s.value2());  
    }  
}
```
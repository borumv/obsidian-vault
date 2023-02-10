---
Aliases: kotlin, мок

Tags: kotlin moc
---




## 📙MOC-Kotlin

## Переменные
1) Объявление переменных идёт по формату `val/var имя переменной: тип = значение`
`val` - аналог ***final*** в Java
2) Все переменные в [[📙MOC-Kotlin|kotlin]] - ссылочные, в отличии от [[📙MOC-JAVA|java]] у него **нет** примитивных типов

Абсолютно любой объект в [[📙MOC-Kotlin|kotlin]] не может хранить  в себе null, если мы **явно это не укажем**

Вот такое присвоение **запрещенно**
```kotlin
val i:String = null;  
println(i)
```
Чтобы это исправить, нужно использовать оператор `?`:

```kotlin
val i?:String = null;  
println(i)
```

Также, оператор `?` является проверкой на null
запись
```kotlin
val i:String = null;  
println(i?.length)
```
эквивалентна java-коду
```java
if (i.length !=null){
	System.out.println(i)
}else{
	System.out.println("null")
}
```

Опреаторы `!!` означают, что ***я знаю, что в этом значении может быть null, но я уверен, что его там нет***. Если null всё таки будет, то выкинет `KotlinNullPointerException`:

```kotlin
val i:String? = null;  
println(i!!.length)
```

У нас 3 нулабельные строки  
В переменую result вывести сумму длин всех строк.  
Если null, то длина = 0:
```kotlin
val i:String? = null;  
val i2:String? = "hello";  
val i3:String? = "world";  
  
val result = (i?.length?:0) + (i2?.length?:0) + (i3?.length?:0)  
println(result)
```
%% Hub MOCs: Don’t edit below  %%

%% Hub MOCs: Don’t edit above  %%

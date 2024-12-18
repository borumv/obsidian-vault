---
tags: java, javadoc
---
**Description**
**Map** - интерфейс, реализация хранения пары ключ-значение
Уникальность объектов-ключей должна обеспечиваться переопределением методов **hashCode()** и **equals()** пользовательским классом
f
**Иерархия**
![[5.Map.png]]
>[!INFO]
>**Методы**

>В интерефейсе **Map** есть **вложенный** инсмстерфейс **Entry**
>Он используется для **перебора значений.**
>В нём есть следующие методы:
>**K getKey();** - возвращает ключ текущей пары
>**V getValue();** - возвращает значение текущей пары
>**V setValue(V value);** - устанавливает значение объекта **obj** в текущей паре
>```java
>for(Map.Entry<String, String> map: simpleMap.entrySet()){  
System.out.println(map.getKey());  
System.out.println(map.getValue());  
}


**Интересности**
Чтобы **синхронизовать коллекцию**(не только мапу) можно возпользоваться
методом:
```java
Collections.synchronizedMap(new HashMap<>());
```
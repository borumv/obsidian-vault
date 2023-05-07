---
created: Sunday 7th May 2023 10:54
Last modified: Sunday 7th May 2023 10:54
Aliases: input stream, входящие потоки в Java io 
Tags: programming
---

*InputStream* - абстрактный класс [[Java IO|пакета]] `java.io`, являющийся родительских для все реализации *входящих потоков байтов*. Большинство методов данного класса не возвращает ниченго конкретного, а *требуют* реализации в классов-детей.

*Методы:*
- `available` - возвращает количество доступных байт которые нам доступны для чтения
- Куча перегруженных методо `read()` - позволяют считывать информацию по байтам

*Основные наследники*:
- `ObjectInputStream` - позволяет считывать Java-объекты. Часто используется для [[java_Serialization|сериализации и десериализации]]
- `ByteArrayInputStream` - для работы с массивом байтов
- `FileInputStream` - для работы с файлами на нашем жёстком диске
- `FilterInputStream` - для потокв ввода-вывода часто применяют [[Паттерн Декоратор|паттерн декоратор]].

**Пример реализации**
1. Считывая сразу все байты:
```java
 try (InputStream is = new FileInputStream(file)){
            byte[]bytes = is.readAllBytes();  
            System.out.println(new String(bytes));  
       }
```
2. Побайтовое считывание
```java
try (InputStream is = new FileInputStream(file)){  
    byte[] bytes = new byte[is.available()];  
    int counter = 0;  
    byte currentByte;  
    while ((currentByte = (byte)is.read()) != -1){  
        bytes[counter++] = currentByte;  
    }  
    System.out.println(new String(bytes));  
}
```

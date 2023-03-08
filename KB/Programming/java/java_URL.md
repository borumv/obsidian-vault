---
created: Wednesday 8th March 2023 10:18
Last modified: Wednesday 8th March 2023 10:18
Aliases: URL класс в java
Tags: java
---

# [[java_URL|URL]]

📌**URL** - класс, реализующий общение по [[HTTP|http протоколу]]

## Создание get-запроса
1. Создаём инстанс класса **`URL`** в который указываем адрес, на который мы будет отправлять *request*. При этом, URL поддерживает не только **HTTP-протокол**, но и *https, file и jar*
2. **Открываем коннекшн** через метод **`openConnection()`** 
3. Вызываем метод **`getContent`** или **`getInputStream()`** (они являются одинаковыми, просто в теле *getContent* идёт вызов *getInputStream*)

```java
public static void main(String[] args) throws IOException {  
    URL url = new URL("http://localhost:8080/");  
    var connection = url.openConnection();  
    System.out.println(new String(connection.getInputStream().readAllBytes()));  
}
```

## Создание post-запроса
1. Устанавливаем флаг *doOutput* в *True* через метод **`setToOutput()`
2. Создаём аутпутстрим через вызов метода **getOutputStream()** из connection 
3. Через метод **`write()`** записываем массив байти и передаём
```java
URL url = new URL("http://localhost:8080/");  
var connection = url.openConnection();  
connection.setDoOutput(true);  
try (var outputStream = connection.getOutputStream()) {  
    outputStream.write("Hello!".getBytes());  
}
```

see: [[Сети в Java]]

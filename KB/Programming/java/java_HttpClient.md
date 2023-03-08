---
created: Wednesday 8th March 2023 12:28
Last modified: Wednesday 8th March 2023 12:28
Aliases: httpclient
Tags: java
---

# [[java_HttpClient|HttpClient]]

📌Клиент для работы по [[HTTP|http протоколу]] с **сервером**. Пришёл на смену [[java_URL|URL]] и позволяет работать **асинхронно**

## Как создаётся?
1. Для реализации используется [[pattern_Builder|паттерн билдер]]. Через который мы инстацируем **HttpClient**:
- C настройками:
```java
var httpClient = HttpClient.newBuilder()  
        .version(HttpClient.Version.HTTP_1_1)  
        .build();
```
- C **деволтными** настройками:
```java
var httpClient = HttpClient.newHttpClient();
```
2. **Создаём** наш **request** 
Если нужен **GET**:
 ```java
 var request = HttpRequest.newBuilder(new URI("http://localhost:8080/"))  
        .GET()  
        .build();
```
Если нужен **POST**:
```java
var request_with_post = HttpRequest.newBuilder(URI.create("https://localhost:8080"))  
        .POST(HttpRequest.BodyPublishers.ofString("Hello!"));
```

3. Теперь можно отправить наш request двумя способами - синхронно (*send()*) и асинхронно (*sendAsync()*), который вернёт нам [[CompletableFuture]]. 
В аргументах метода, нужно также указать *BodyHandlers* - то, как мы будем обрабатывать наш **response** от клиента.
```java
var response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
```
4. Из **response** мы уже можем вытягивать, всё, что захотим (боди, хэдер)
```java
System.out.println(response.headers());  
System.out.println(response.body());
```


see: [[Сети в Java]]
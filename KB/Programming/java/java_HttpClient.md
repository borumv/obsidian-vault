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

2. Теперь можно отправить наш request двумя способами - синхронно (*send()*) и асинхронно (*sendAsync()*), который вернёт нам [[CompletableFuture]]. 
3. 

---
created: Saturday 6th May 2023 14:50
Last modified: Saturday 6th May 2023 14:50
Aliases: кукпи в Java
Tags: programming
---

*HTTP-сервер* может вместе с ответом прислать [[Cookies]], и тебе нужно будет с ними работать. Или наоборот, http-сервер ждет, что клиент пришлет ему Cookie и тебе нужно добавить их в твой http-запрос. Конечно, можно сделать это прямо через заголовки (handlers), но [[java_HttpClient|httpclient]] предлагает тебе более удобный механизм – класс `CookieHandler`. Получить его можно с помощью метода `cookieHandler()`. Пример:

```java
HttpClient client = HttpClient.newBuilder( URI.create("https://javarush.com")).build();
CookieHandler handler = client.cookieHandler();
```

*CookieHandler* – это абстрактный класс, так что принято работать с его имплементацией CookieManager. У которого в свою очередь всего пара методов, через которые можно получить объект CookieStore. С ним можно в дальнейшем работать:

```java
HttpClient client = HttpClient.newBuilder( URI.create("https://javarush.com")).build();
CookieHandler handler = client.cookieHandler();
CookieManager manager = (CookieManager) handler;
CookieStore store = manager.getCookieStore();
```

CookieStore – это интерфейс, у которого есть такие методы:

-   `add()`
-   `get()`
-   `getCookies()`
-   `remove()`
-   `removeAll()`



---
created: Sunday 7th May 2023 09:36
Last modified: Sunday 7th May 2023 09:36
Aliases: контейнер сервлетов Каталина
Tags: programming
---

Catalina (servlet container)- контейнер  [[Сервлеты в Java|сервлетов]] в [[Apache Tomcat]]
Если абстрагироваться, это всего лишь _ассоциативный массив_, т.е. коллекция с набором наших сервлетов. Ключом каждого сервлета является _url_. Существует только один экземпляр ([[pattern_Singleton|синглтон]]) класса **`HttpServlet`**.  
    **`HttpServlet`**  
    **`HttpServletRequest`** - интерфейс-обёртка каталины над `ServletRequest`  
    **`HttpServletResponse`** - интерфейс-обёртка каталины над `ServletResponse`
```java
//servletMap - это и есть контейнер сервлетов
HttpServlet servlet = servletMap.computeIfAbsent(url, this:load);

//Это обёртки, которые использует
HttpServletRequest request = buildRequest(coyoteRequest)
HttpServletResponse response = buildResponse(coyoteResponse)
```


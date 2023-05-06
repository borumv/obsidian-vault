---
created: Saturday 18th March 2023 18:29
Last modified: Saturday 18th March 2023 18:29
Aliases: сервлет, Servlet, servlets
Tags: java, programming
---
**Cервлет** — это такой **Java-плагин**, который встраивался в `Java веб-сервер` и позволял ему выполнять Java-код при запросе на определенные страницы. А уже этот Java-код, представленный классом, унаследованным от класса Servlet, делал то, что задумали его разработчики.

И как ты уже знаешь, самый популярный Java веб-сервер — это [[Apache Tomcat|tomcat]]. Названный, кстати, в честь кота Тома из мультфильма “Том и Джери”.
Как же Tomcat взаимодействует с сервлетами? На самом деле этот процесс стандартизирован и называется жизненным циклом сервлета. В нем сервлет — это загружаемый объект, а веб-сервер — это **контейнер** сервлетов.

📌Сервлет в Apache Tomcat, это класс который наследуется от **`HttpServlet`** 
```java
@WebServlet("/first")  
public class FirstServlet extends HttpServlet {  
  
    @Override  
    public void init(ServletConfig config) throws ServletException {  
        super.init(config);  
    }  
      @Override  
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {  
        resp.setContentType("text/html");  
        try (var writer = resp.getWriter()) {  
            writer.write("<h1>Hello from first servlet!</h1>");  
        }  
          super.service(req, resp);  
    }  
      @Override  
    public void destroy() {  
        super.destroy();  
    }  
}
```


## Жизненный цикл сервлета в [[Apache Tomcat]]

1. **Инициализация сервлета** - функция **`load`**
	- Загрузка в [[Java Virtual Machine|JVM]]
	- Создание объекта нашего класса
	- Вызываем метод `init()`
2. **Создание метода `service()`**
3. Когда завершаем **undeploy** нашего приложения - реализация метода **`destroy()`**  
![[Pasted image 20230318183543.png]]



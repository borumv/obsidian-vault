---
created: Saturday 18th March 2023 18:29
Last modified: Saturday 18th March 2023 18:29
Aliases: сервлет, Servlet, servlets
Tags: java, programming
---


📌


## Жизненный цикл сервлета в [[Apache Tomcat]]

1. **Инициализация сервлета** - функция load
	- Загрузка в [[Java Virtual Machine|JVM]]
	- Создание объекта нашего класса
	- Вызываем метод `init()`
2. **Создание метода `service()`**
3. Когда завершаем **undeploy** нашего приложения - реализация метода **`destroy()`**  


![[Pasted image 20230318183543.png]]
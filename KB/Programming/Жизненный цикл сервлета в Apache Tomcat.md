---
created: Sunday 7th May 2023 09:40
Last modified: Sunday 7th May 2023 09:40
Aliases: жизненный цикл сервлетов в tomcat
Tags: programming
---

1. **Инициализация сервлета** - данный этап проходит только один раз при инициализации. Происходит вызов функции **`load`**, который инициализирует наш сервлет и включает в себя три шага:
	- Загрузка в [[Java Virtual Machine|JVM]](все наши сервлеты - это обычные классы, которые мы пакуем в [[WAR-файл]] и пакуем в `WEB-apps` папку) c помощью [[java_ClassLoader|classloader]] 
	- Создание объекта нашего класса (с помощью [[java_Reflection|рефлексии]] вызов *конструктора без параметров*)
	- Вызываем метод `init()`
```java
//Загрузка в JVM
Class<?> servletClass = classLoader.loadClass(className);

//Создание объекта нашего класса
Constructor<HttpServlet> constructor = servletClass.getConstructor();
HttpServlet servlet = constructor.newInstance();

//Вызов метода init
servlet.init()
```
2. **Вызов метода `service()`**, который вызывается каждый раз при каждом запросе.
3. **Вызов метод `destroy`**, когда совершаем **undeploy**(удаляем из папки `webapps`) нашего приложения
![[Pasted image 20230507094217.png]]


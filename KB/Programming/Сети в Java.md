---
created: Monday 13th March 2023 10:41
Last modified: Monday 13th March 2023 10:41
Aliases: сети в java
Tags: programming
---

# [[Сети в Java]]

📌Для реализации на уровне *TCP/UPD*:
*Блокирующий* ввод-вывод, пакет `java.net.*`:
1. [[java_Socket]] - [[TCP протокол]]
2. [[java_Server Socket]] - [[TCP протокол]]
3. [[java_DatagramSocket]] - [[UPD протокол]]

*Неблокирующий ввод-вывод*, пакет `java.nio.*`
1. [[SocketChannel]] - [[TCP протокол]]
2. [[ServerSocketChannel]] - [[TCP протокол]]
3. [[DatagramChannel]]- [[UPD протокол]]

Для реализации на уровен [[HTTP]]:
1. [[java_URL|URL]] - с ним удобно, только когда нам нужен HTTP-метод **GET**, когда нам нужен **POST**, то это выглядит очень некрасиво и нам приходится работать с байтами
2. [[java_HttpClient|HttpClient]] - пришёл с *Java 11* с удобным интерфейсом, *потокобезопасным* и позволяющим работать *асинхронно*
 

Но никто с нуля свои серверы не пишет. Для этого есть уже готовые решения, например, [[Apache Tomcat]]
---
created: Tuesday 7th March 2023 18:59
Last modified: Tuesday 7th March 2023 18:59
Aliases: Server socket в java
Tags: java
---

# [[java_Server Socket|Server Socket]]

📌**ServerSocket** -  класс, который обеспечивает блокирующий доступ к серверу по [[TCP протокол|tcp протоколу]] 
`ServerSocket(int port, int backlog)`
*Параметр **backlog*** - означает, как много коннекшенов ([[java_Socket|сокетов]]) мы можем держать в очереди

Порядок создания *ServerSocket*:
1. Инициализируем *`ServerSocket(port)`*, помимо порта можно указать бэклог
2. Вызываем метод `accept()`, который является блокирующим и ожидает request от клиента
3. Создаём **`inputStream()`** и **`outputStream()`** можно через обёртку *DataOutputStream()*, чтобы не мучаться с сериализацией/десериализацией байтов
4. Прочитать сообщение - inpustream + метод с префиксом *read*
5. Отправить сообщение клиенту - outputstream + метод с префиксом *write*

```java
try (var serverSocket = new ServerSocket(8098);  
     var socket = serverSocket.accept();  
     var inputStream = new DataInputStream(socket.getInputStream());  
     var outputStream = new DataOutputStream(socket.getOutputStream());  
     Scanner scanner = new Scanner(System.in);) {  
    var req = inputStream.readUTF();  
    while (!"stop".equals(req)) {  
        System.out.println("Request from client: " + req);  
        var response = scanner.nextLine();  
        outputStream.writeUTF(response);  
        req = inputStream.readUTF();  
    }  
}
```

see: [[Сети в Java]] 
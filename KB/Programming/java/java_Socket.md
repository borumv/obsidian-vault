---
created: Tuesday 7th March 2023 18:48
Last modified: Tuesday 7th March 2023 18:48
Aliases: класс Socket в java
Tags: java
---

# [[java_Socket|Socket]]

📌Socket - класс, который создаёт **клиента** обеспечивает блокирующий доступ к **серверу** по [[TCP протокол|tcp протоколу]] 

Порядок создания *Socket*:
1. Инициализируем *Socket(adress, port)*, порт нужного нам [[java_Server Socket|сервера]]
2. Создаём **`inputStream()`** и **`outputStream()`** можно через обёртку *DataOutputStream()*, чтобы не мучаться с сериализацией/десериализацией байтов
4. Прочитать сообщение с сервера - inpustream + метод с префиксом *read*
5. Отправить сообщение серверу - outputstream + метод с префиксом *write*

```java
var inetAdress = InetAddress.getAllByName("localhost");  
try (Socket socket = new Socket(inetAdress[0], 8098);  
     var outputStreem = new DataOutputStream(socket.getOutputStream());  
     var inputStream = new DataInputStream(socket.getInputStream());  
     var scanner = new Scanner(System.in)) {  
    while (scanner.hasNextLine()){  
        String req = scanner.nextLine();  
        outputStreem.writeUTF(req);  
        var resp = inputStream.readUTF();  
        System.out.println("Response from server:" + resp);  
    }
```

see: [[Сети в Java]]

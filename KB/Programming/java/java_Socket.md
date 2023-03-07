---
created: Tuesday 7th March 2023 18:48
Last modified: Tuesday 7th March 2023 18:48
Aliases: класс Socket в java
Tags: java
---

# [[java_Socket|Socket]]

📌Socket - класс, который создаёт **клиента** обеспечивает блокирующий доступ к **серверу** по [[TCP протокол|tcp протоколу]] 

```java
var inetAdress = InetAddress.getAllByName("localhost");
try(Socket socket = new Socket("169.254.170.226", 8095);  
    var outputStreem = new DataOutputStream(socket.getOutputStream());  
    var inputStream = new DataInputStream(socket.getInputStream())){  
     outputStreem.writeUTF("Hello");  
    System.out.println(Arrays.toString(inputStream.readAllBytes()));  
}
```

see: [[Сети в Java]]

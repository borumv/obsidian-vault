---
created: Wednesday 8th March 2023 08:24
Last modified: Wednesday 8th March 2023 08:24
Aliases: datagram socket в java
Tags: java
---

# [[java_DatagramSocket|DatagramSocket]]

📌Класс в [[📙MOC-JAVA|java]], обеспечивающий работу между сервером и клиентом по [[UPD протокол|udp протоколу]] 
Инстанс класс может работать, как *клиент* так и как *сервер* в отличии от классов, работающих по [[TCP протокол|tcp протоколу]] (*[[java_Socket|Socket]] и [[java_Server Socket|ServerSocket]]*)

## Как создать клиента

1. Создаём инстанс класса **`DatagramSocket()`** 
2. Создаём инстанс класса **`DatagramPacket(byte[] buf, int length, inetAdress, port)`** 
3. Вызываем метод **`send(DatagramPacket packet)`** у сокета, передав е му пакет
В отличии от работы по [[TCP протокол|tcp протоколу]] нам не нужно создавать *input* и *output* стримы. Один сокет-клиент **может отправлять** запросы **на разные сервера**, благодаря тому, что мы можем создавать **разные пакеты**.

```java
try (var datagramSocket = new DatagramSocket()) {  
    var buf = "Hello from server!".getBytes();  
    var inetAdress = InetAddress.getByName("localhost");  
    var packet = new DatagramPacket(buf, buf.length, inetAdress, 8080);  
    datagramSocket.send(packet);  
}
```

## Как создать сервер
1. Создаём  инстанс **`DatagramSocket(int port)`** с указанием *порта*, на котором будет наш сервер
2. Создаём инстанс **`DatagramPacket(byt[] buf, int length)`**, в случае с сервером *пакет является хранилищем* в который *запишется информации от клиента*
3. Вызываем метод **`recieve(packet)`** у сокета, *передав в аргументы пакет*
4. **Чтобы прочитать данные**, можно просто посмотреть во *внутрь нашего буффера*

```java
try (var socket = new DatagramSocket(8080)) {  
    var buf = new byte[512];  
    var packet = new DatagramPacket(buf, buf.length);  
    socket.receive(packet);  
    System.out.println(new String(buf));  
}
```
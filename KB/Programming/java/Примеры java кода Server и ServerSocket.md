---
created: Sunday 12th March 2023 13:14
Last modified: Sunday 12th March 2023 13:14
Aliases: 
Tags: java
---

## Single threaded server

- **Server**:
```java
public class HttpServer {  
    private final int port;  
    public HttpServer(int port) {  
        this.port = port;  
    }  
  
    void run(){  
        try {  
            ServerSocket serverSocket = new ServerSocket(port);  
            var request = serverSocket.accept();  
            serverProcess(request);  
        } catch (IOException e) {  
            throw new RuntimeException(e);  
        }  
    }    private void serverProcess(Socket request) {  
        try (request;  
             var inputStream = new DataInputStream(request.getInputStream());  
             var outputStream = new DataOutputStream(request.getOutputStream())) {  
            //Handle request  
            System.out.println("In SERVER. Read request: " + new String(inputStream.readNBytes(55)));  
  
            //Handle response  
            var body = Files.readAllBytes(Path.of("src", "main\\resources\\new.html"));  
            var header = """  
                    HTTP/1.1 200 OK                    content-type: text/html                    content-length: %s                    """.formatted(body.length).getBytes();  
            outputStream.write(header);  
            outputStream.write(System.lineSeparator().getBytes());  
            outputStream.write(body);  
  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }}
```

- **Client:**
```java
public class HttpClientRunner {  
  
    public static void main(String[] args) throws FileNotFoundException, URISyntaxException {  
        var httpClient = HttpClient.newBuilder()  
                .version(HttpClient.Version.HTTP_1_1)  
                .build();  
  
        var request = HttpRequest.newBuilder()  
                .uri(URI.create("http://localhost:9000"))  
                .header("content-type", "application/json")  
                .POST(ofFile(Path.of("src/main/resources/simple.json")))  
                .build();  
  
        try {  
            System.out.println(request.headers() + request.bodyPublisher().toString());  
            var response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());  
            System.out.println("Headers:" + response.headers());  
            System.out.println("Body:" + response.body());  
        } catch (IOException | InterruptedException e) {  
            e.printStackTrace();  
        }  
  
    }}
```


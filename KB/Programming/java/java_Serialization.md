---
created: Thursday 2nd February 2023 18:54
Last modified: Thursday 2nd February 2023 18:53
Aliases: Serializable
Tags: java
---

# [[java_Serialization|Serialization]]

📌Интерфейс **Serialization** является маркером и никакие методы в себе не несёт. Самый простой способ сериализации и последующей десериализации объектов сводится через Objectoutputstream и Objectinputstream:
```java
File file = new File("C:\\Users\\Admin\\Documents\\Власевский\\Учёба\\Algorithms\\AlgorithmsYa\\src\\main\\java\\IDTV\\javaprofessional\\unit9\\test.txt");  
try (  
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(file));  
        ObjectInputStream is = new ObjectInputStream(new FileInputStream(file));  
        ){  
    Student student = new Student(1,"boris");  
    os.writeObject(student);  
    is.readObject();  
    System.out.println(student);  
  
} catch (IOException | ClassNotFoundException e) {  
    throw new RuntimeException(e);  
}
```

`transient` - ключевое слово, которое используется, если мы не хотим, чтобы поле было сериализованно
**static** поля тоже НЕ подвергаются сериализации


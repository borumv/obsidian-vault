Добрый день!
Я только начал изучать Kafka и прошу Вас помочь разобраться с KafkaStreams.
есть код, который делает обычный groupBy():

```java
public static void createGroupByStream(final StreamsBuilder builder) {   
    KStream<String, Person> stream = builder.stream("kafka-stream-input", Consumed.with(Serdes.String(), CustomSerdes.PersonSerde()));  
      stream  
            .groupByKey()  
            .reduce((item, second) -> {  
                item.setCount(item.getCount() + second.getCount());  
                return item;  
            } )  
            .toStream()  
            .to("kafka-stream-output", Produced.with(Serdes.String(), CustomSerdes.PersonSerde()));  
}
```
Класс Person:
```java  
public class Person extends GroupingEntity {  
    private String name;  
    private int count;
    }
```

Класс CustomSerdes:
```java
public final class CustomSerdes {  
 
    public static Serde<Person> PersonSerde() {  
        JsonSerializer<Person> serializer = new JsonSerializer<>();  
        JsonDeserializer<Person> deserializer = new JsonDeserializer<>(Person.class);  
        return Serdes.serdeFrom(serializer, deserializer);  
    }
```

На данный момент данные обновляются в потоке, т.е. в топике "kafka-stream-output" хранится вся история обновления поля count для каждого Person.
Мне нужно, чтобы в выходном топике (в примере - это "kafka-stream-output"), информация появилась только тогда, когда все сообщения из топика "kafka-stream-input" были обработаны. Т.е. был только финальный groupBy. Можете подсказать, как это сделать?

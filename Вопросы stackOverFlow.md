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

Данные передаются из csv файла, где каждая строчка - это одно сообщение. Их может быть большое количество (несколько миллионов)

Т.е. в теории, я смогу изначально посчитать количество строк(count) и ждать пока не обработается count сообщений в топике. Но как програмно это сделать?


Please help me understand KafkaStreams. there is a code that does a normal groupBy(): ```java public static void createGroupByStream(final StreamsBuilder builder) { KStream<String, Person> stream = builder.stream("kafka-stream-input", Consumed.with(Serdes.String(), CustomSerdes.PersonSerde())); stream .groupByKey() .reduce((item, second) -> { item.setCount(item.getCount() + second.getCount()); return item; } ) .toStream() .to("kafka-stream-output", Produced.with(Serdes.String(), CustomSerdes.PersonSerde())); } ``` class Person: ```java public class Person extends GroupingEntity { private String name; private int count; } ``` class CustomSerdes: ```java public final class CustomSerdes { public static Serde<Person> PersonSerde() { JsonSerializer<Person> serializer = new JsonSerializer<>(); JsonDeserializer<Person> deserializer = new JsonDeserializer<>(Person.class); return Serdes.serdeFrom(serializer, deserializer); } ``` At the moment, the data is updated in a stream, i.e. the "kafka-stream-output" topic stores the entire history of updating the count field for each Person. I want the output topic (in the example it is "kafka-stream-output") to show information only when all messages from the "kafka-stream-input" topic have been processed. Those. there was only the final groupBy. Can you suggest how to do this? The data is transferred from a csv file, where each line is one message. There may be a large number (several millions) [enter image description here](https://i.stack.imgur.com/X3xhb.png) Those. in theory, I can initially count the number of rows (*count*) and wait until the *count *messages in the topic are processed. But how to do it programmatically?
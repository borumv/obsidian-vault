---
created: Sunday 25th December 2022 19:48
Last modified: Sunday 25th December 2022 19:48
Aliases: настройка кафки в Java
Tags: java, kafka
---

# [[Настройка Kafka в java]]

Настройка [[kafka_producer|продьюсера]]
1) Создание properies для Producer
```java
Properties properties = new Properties();  
properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");  
properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());  
properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
```

2) Создание самого продьюсера
```java
KafkaProducer<String, String> kafkaProducer = new KafkaProducer<String, String>(properties);
```

3) Создание данных для отправки
```java
ProducerRecord<String, String> record = new ProducerRecord<String, String>("first_topic", "HELLLLOOOOO!");
```

4) Отправка данных 
```java
//async operation  
kafkaProducer.send(record);  
kafkaProducer.flush();  
kafkaProducer.close();
```

Настройка [[kafka_Consumer|консьюмера]]

1) Создание properties для Consumer
	```java
String bootstrapSevers = "127.0.0.0:9092";  
String groupId = "my_fourth-application";  
  
Properties properties = new Properties();  
properties.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapSevers);  
properties.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());  
properties.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());  
properties.setProperty(ConsumerConfig.GROUP_ID_CONFIG, groupId);  
properties.setProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
	```

2) Создание самого консьюмера
```java
KafkaConsumer<String, String > consumer = new KafkaConsumer<>(properties);
```
3) Подписка на [[kafka_topics|топик]]
```java
consumer.subscribe(Collections.singleton("first_topic"));
```
4) "Опрос" топика консьюмером
```java
while (true){  
    ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(500));  
    for (ConsumerRecord record: records){  
        System.out.println("Key: " + record.key());  
        System.out.println("Partition: " + record.partition());  
        System.out.println("Topic: " + record.topic());  
    }  
}
```

# Конфигурационный файлы
- [[Kafka broker settings|Настройка брокера в Kafka]]

see:[[📙MOC-Kafka|Кафка]]


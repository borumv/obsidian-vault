---
created: Sunday 25th December 2022 15:10
Last modified: Sunday 25th December 2022 15:09
Aliases: round-robin
Tags: kafka
---

# [[kafka_RoundRobin]]

Способ распределения [[kafka_message|сообщений]] без ключей в [[📙MOC-Kafka|кафке]] где каждое сообщение распределяется равномерно между [[kafka_partition|партициями]] в [[kafka_topics|топике]]

С обновлением кафки, по умолчанию используется [[kafka_Sticky partitioning strategy]] 
Чтобы изменить в файле properties, необходимо прописать `partitioner.class=org.apache.kafka.clients.producer.RoundRobinPartitioner`

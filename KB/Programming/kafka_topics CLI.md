---
created: Saturday 24th December 2022 17:30
Last modified: Saturday 24th December 2022 17:30
Aliases: команды командной строки для топиков
Tags: kafka
---

# [[kafka_topics CLI]]

🔸`kafka-topics` - получить всю документацию/команды, которые можно использовать с [[kafka_topics|топиками]]
🔸`kafka-topics --bootstrap-server localhost:9092 --topic first_topic --create --partitions 3 --replication-factor 1` - создание топика, с названием *first_topic* с 3-мя [[kafka_partition|партициями]] и [[kafka_replication|фактором репликации]] 1 (нельзя сделать больше, чем есть [[kafka_brokers|брокеров]])
🔸`kafka-topics --bootstrap-server localhost:9092 --list` - посмотреть список топиков
🔸`kafka-topics --bootstrap-server localhost:9092 --topic first_topic --describe` - посмотреть подробную информацию о топике
![[Pasted image 20221225084959.png]]
🔸`kafka-topics --bootstrap-server localhost:9092 --topic second_topic --delete` - удаление (в Винде нельзя удалить, нужно в ручную - [тикет](https://issues.apache.org/jira/browse/KAFKA-1194))

[[kafka_KAFKA CLI|команды консоли в кафке]]
---
created: Wednesday 21st December 2022 20:29
Last modified: Sunday 20th November 2022 09:38
Aliases: kafka producer, продьюсер в кафка
Tags: java, kafka
---

# [[kafka_producer]]

**Producer** является источником данных, который пишет [[kafka_message|сообщения]] в [[kafka_topics|топики]]
- Prodcuer в [[📙MOC-Kafka|кафке]] автоматически знает, какому [[kafka_brokers|брокеру]] и в какую [[kafka_partition|партицию]] писать
- Если брокер падает, producer **автоматически восстанавливается**

![[Pasted image 20221221203716.png|500]]


Подтверждение отправки в Producer
	- **acks=0**  - не ждать подтверждения (возможна потеря данных)
	- **acks=1** - ждать подтверждения [[kafka_лидер в партиции|лидера]] (ограниченная потеря данных)
	- **acks=all** - ждать подтверждения всех лидеров и реплик

С недавнего времени, продьюсер в кафке отправляет сообщения по новой схеме - 
[[kafka_Sticky partitioning strategy]] 
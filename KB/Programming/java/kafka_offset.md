---
created: Wednesday 21st December 2022 21:10
Last modified: Wednesday 21st December 2022 16:48
Aliases: оффсет
Tags: java
---

# [[kafka_offset]]
**Offset** - это уникальный адрес смещения у [сообщения](kafka_message.md), который уникален только в конкретной [партиции](kafka_partition.md). Это 64-битное число, которое назначается самим [брокером](kafka_brokers.md)

[[📙MOC-Kafka|кафка]] может **восстановить** оффсет с которого читала [[KB/Programming/kafka_Consumer Group|группа консьюмеров]]

- **offset** для **каждого consumer group** для каждого partition - указатель на то, какое сообщение читать дальше. Он "живёт" в [[kafka_topics|топике]] и называется `__consumer_offsets`

- Если consumer **падает**, то после этого он может продолжить с того сообщения, на котором упал, зная **offset**
 ![[Pasted image 20221110131348.png]]
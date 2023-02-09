---
created: Wednesday 21st December 2022 16:48
Last modified: Wednesday 21st December 2022 16:48
Aliases: брокер кафка, брокер, kafka broker
Tags: java, kafka
---

# [[kafka_brokers]]

Каждый брокер, по своей сути явлется **сервером**. 
Брокер в [[📙MOC-Kafka|кафке]] хранится в [[kafka_klaster|кластере]]. 

- У каждого брокера **есть id** - определённым *числом* 
- Каждый брокер содержит определённую [[kafka_partition|партицию]]
- Если мы подключаемся к одному брокеру, то мы подключаемся ко всему [[kafka_klaster|кластеру]]
- After connecting to any broker, I'll be **connected to the entire cluster**

> 3 брокера - частый выбор для старта кластера

![[Pasted image 20221221170605.png|700]]

Чтобы предостеречь себя от потери данных в топике, существует [[kafka_replication|репликация]]

[[Kafka broker settings]]
---
created: Wednesday 21st December 2022 21:15
Last modified: Wednesday 21st December 2022 21:15
Aliases: группа консьюмеров
Tags: java, kafka
---

# kafka_Consumer Group

**Consumer group** используется **для масштабирования чтения** [[kafka_message|сообщений]]. Каждый consumer из группы читает из своего набора [[kafka_partition|партиции]]. Если мы имеем больше [[kafka_Consumer|консьюмеров]] чем партиций, то они будут **неактивными**

>Консьюмеры **автоматически** знают в какую партицию и как перейти с помощью [[kafka_Координатор группы]] и  [[kafka_Координатор потребителей]]   

See also: [[kafka_Consumer CLI]] 
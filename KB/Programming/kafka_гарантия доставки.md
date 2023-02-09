---
created: Friday 23rd December 2022 19:06
Last modified: Friday 23rd December 2022 19:06
Aliases: гарантия доставки
Tags: java
---

# [[kafka_гарантия доставки]]

Параметр, указывающий на то, **когда консьюмер подтверждает смещение [[kafka_offset|оффсета]]**


**Гарантии доставкии:**
- <mark style="background: #FFF3A3A6;">**At most once**</mark> : комит сразу после получения (если процесс пойдет не так - данные будут **потеряны**)
- <mark style="background: #FFB86CA6;">**At least once**</mark>: комит сразу после обработки (нужен **идемпотентный** consumer)
- <mark style="background: #FF5582A6;">**Exactly once:**</mark> только в [[Kafka Streams API]]
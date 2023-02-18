---
created: Saturday 18th February 2023 09:33
Last modified: Saturday 18th February 2023 09:33
Aliases: почему kafka быстрая
Tags: kafka
---

# [[Почему Kafka такая быстрая]]

Почему [[📙MOC-Kafka|кафка]] такая быстрая?
- Кафка использует [[кеш страниц операционной системы]] вместо [[Java Virtual Machine]]. Благодаря этому, нет длительных пауз в связи со сборкой мусора
 ![[Pasted image 20221228185002.png|500]]
 - Использование своего https://cwiki.apache.org/confluence/display/KAF-KA/A+Guide+To+The+Kafka+Protocol#AGuideToTheKafkaProto-col-SomeCommonPhilosophicalQuestions, вместо привычного для брокеров [[AMQP]]. 

Схема работы Кафки:
![[Pasted image 20221228191904.png|600]]



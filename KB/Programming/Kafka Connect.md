---
created: Wednesday 28th December 2022 19:05
Last modified: Wednesday 28th December 2022 19:05
Aliases: кафка коннект
Tags: kafka
---

# [[Kafka Connect]]

>Для импорта данных в [[📙MOC-Kafka|кафке]] используются так называемые коннекторы-источники. Допустим, чтобы переместить данные из таблиц MySQL® в темы Kafka, нужно использовать Connect для преобразования этих данных в [[kafka_message|сообщения]] Kafka. С другой стороны, имеются также коннекторы-приемники, используемые для экспорта данных из Kafka в другие системы. Например, переместить сообщения из какой-то темы в долговременное хранилище можно с помощью коннектора-приемника, который будет извлекать сообщения из темы и записывать их, скажем, в облачное хранилище.

![[Pasted image 20221228190816.png]]

Основные элементы Kafka-Connect

-   **[[Kafka connect worker|worker]]** — инстанс/сервер Kafka Connect;
-   **[[Kafka Connect connector|connector]]** — Java class + пользовательские настройки;
-   **[[Kafka connect task|task]]** — один процесс connector'a


CLI
```
connect-standalone.sh config/connect-standalone.properties  - запустить Kafka Connect
```



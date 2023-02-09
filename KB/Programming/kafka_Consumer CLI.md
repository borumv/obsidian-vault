---
created: Sunday 25th December 2022 10:01
Last modified: Sunday 25th December 2022 10:01
Aliases: команды для консьюмера
Tags: kafka, cli
---

# [[kafka_Consumer CLI]]

Parent: [[kafka_KAFKA CLI]]

`kafka-console-consumer --bootstrap-server 127.0.0.1:9092 --topic first_topic` - подключитсья к топику и читать сообщения **с момента подключения**
`kafka-console-consumer --bootstrap-server 127.0.0.1:9092 --topic first_topic --from-beginning` - подключитсья к топику и читать сообщения **с самого начала**
`kafka-console-consumer --bootstrap-server 127.0.0.1:9092 --topic first_topic --group my-application` - создать [[kafka_Consumer Group|группу консьюмеров]] и подключиться к топику

`kafka-consumer-groups` - вход для удаления, описания, добавления новых групп консьюмеров
`kafka-consumer-groups --bootstrap-server localhost:9092 --list` - список всех групп консьюмеров
` kafka-consumer-groups --bootstrap-server localhost:9092 --describe --group my_application_group` - описание группы консьюмеров
`kafka-consumer-groups --bootstrap-server localhost:9092 --group my_application_group --reset-offsets --to-earliest --execute --all-topics` - сбросить все [[kafka_offset|оффсеты]]
`kafka-consumer-groups --bootstrap-server localhost:9092 --group my_application_group --reset-offsets --shift-by 3 --execute --topic first_topic` - сдвинуть оффсет на 3 назад
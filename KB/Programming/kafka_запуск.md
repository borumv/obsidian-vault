 1) Запускаем **[zookeeper](kafka_zookeeper)** командой `zookeeper-server-start ../config/zookeeper.properties`
 2) Запускаем [[kafka_brokers|брокер кафка]] командой `kafka-server-start ../config/server.properties`
 3) Для того чтобы начать запись, сначала нужно создать **[топик](kafka_topics.md)** скриптом `kafka-topics --create --topic topic_name --bootstrap-server localhost:9092` . ***topic_name*** - указываем любое имя, в bootstrap-server указываем **порт, который слушает кафка, по умолчанию - 9092**
	 1) Чтобы проверить топик: `kafka-topics --describe --topic topic_name --bootstrap-server localhost:9092`
 4) Чтобы записать сообщение в топик, можно создать **консольного [продьюсера](kafka_producer.md)**  командой `kafka-console-producer --topic topic_name --bootstrap-server localhost:9092`
 5) Чтобы **прочитать** [сообщение](kafka_messages) , можно создать **консольного [консьюмера](kafka_Consumer.md)**  командой `kafka-console-consumer --topic topic_name --bootstrap-server localhost:9092 --consumer-property auto.offset.reset=earliest --group boris`. 
	 1) **auto.offset.reset=earliest** - указывает на то, что мы читаем сообщения с самого **раннего** 
	 2) **--group boris** - помещает консьюмера в группу
6) Чтобы проверить **состояние** группы можно использовать команду: `kafka-consumer-group --bootstrap-server localhost:9092 --group boris --describe` 
7) Чтобы сбросить [оффсет](kafka_offset.md), с которого ведёт чтение консьюмер (он его коммитит и мы читаем с непрочитанных, а не все сообщения): `kafka-consumer-groups --bootstrap-server localhost:9092 --group boris --reset-offsets --to-earliest --topic topic_name --execute`

**Retention (удаление)**
Мы можем установить retention по **времени** или по **размеру партиции**.
В файле настроек (*по умолчанию sever.properties*):
**log.retention.check.interval.ms=______**  - показывает раз в какое время **лог-клинер**(поток, который отвечает за проверку устарели ли данные или нет) проходится и удаляет устаревшиее данные. **Указывается миллисекундах.**

1) Для настройки **retention** команда 


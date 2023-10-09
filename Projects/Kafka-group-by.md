1 БЛОК - Предварительный парсинг
1. В кафку в [[kafka_topics|топик]] *<mark style="background: #ADCCFFA6;">reader-input</mark>* отдаём сообщение формата '*path_to_file/file.csv*' - где 1 - это ссылка на файл, с которым мы работаем
2. ЧереЗ [[Kafka Streams API|kafka-streams]] (?) мы делаем **парсинг** находим **индексы**, по которым будем читать  [[kafka_message|сообщения]] и отдаём сообщения в топик parsing-input
3. Через kafka-streams мы уже читаем файл и делаем групп-бай




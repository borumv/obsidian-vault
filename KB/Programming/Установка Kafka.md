1. Скачиваем с https://kafka.apache.org/downloads
2. Закидываем содержимоё архива в корень диска C
3. В cmd переходим в директорию с кафкой
4. прописываем `C:\kafka_2.13-3.3.1\bin\windows\kafka-topics.bat`
5. Добавляем `C:\kafka_2.13-3.3.1\bin\windows` в переменные пути

Чтобы запустить **kafka** и **zoolkeeper**:
1. Создаём в папке kafka папку **data**, в ней - **zookepeer** и **kafka**
2. Переходим в папку **config/zookeeper.properties** и меняем -  `dataDir=C:/kafka_2.13-3.3.1/data/zookeeper`
3. В cmd прописываем `zookeeper-server-start.bat config\zookeeper.properties`
4. Для запуска **kafka** создаём отдельную cmd
5. изменяем в `config/server/properties` -  `log.dirs=C:/kafka_2.13-3.3.1/data/kafka`
6. прописываем в cmd  `kafka-serverstart config/server.properties`
Работа с топиком:
- `kafka-topics --create --topic registrations --bootstrap-server localhost:9092` - 9092 - порт, по которому слушает кафка
- `kafka-topics --create --topic registrations --bootstrap-server localhost:9092` - посмотреть подробности топика
- `kafka-console-producer --topic registration --bootstrap-server localhost:9092` - консольный продьюсер, для отправки сообщений
- 
	
`kafka-topics --zookeeper 127.0.0.1:2181` - 


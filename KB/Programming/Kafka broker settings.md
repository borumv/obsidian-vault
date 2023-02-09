---
created: Thursday 26th January 2023 13:35
Last modified: Thursday 26th January 2023 13:35
Aliases: настройка брокера кафки
Tags: kafka
---

# [[Kafka broker settings]]



Все настройки брокера хранятся в конфигурационном файле _/etc/kafka/conf/server.properties_.

Основные конфигурации брокера:

-   _broker.id_
-   _log.dirs_
-   _zookeeper.connect_

Далее приведен список настроек с описанием и указанием их типа, значений по умолчанию и действительных, их важностью и режимом обновления.

📌 **zookeeper.connect** – Строка хоста Zookeeper

-   TYPE – string
-   DEFAULT – high
-   DYNAMIC UPDATE MODE – read-only

📌 **advertised.host.name** – Применяется при неустановленном параметре _advertised.listeners_ или _listeners_. Рекомендуется использовать _advertized.listeners_. Обозначает имя хоста для публикации в ZooKeeper для использования клиентами. В средах IaaS может отличаться от интерфейса, к которому привязывается брокер. Если параметр не задан, используется настроенное значение для _host.name_. В противном случае – значение из _java.net.InetAddress.getCanonicalHostName()_

-   TYPE – string
-   DEFAULT – null
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – read-only

📌 **advertised.listeners** – Слушатели для публикации в ZooKeeper для использования клиентами (если есть отличие от свойства _listeners_). В средах IaaS может отличаться от интерфейса, к которому привязывается брокер. Если параметр не задан, используется значение для _listeners_. В отличие от _listeners_ значение “0.0.0.0” недопустимо

-   TYPE – string
-   DEFAULT – null
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – per-broker

📌 **advertised.port** – Применяется при неустановленном параметре _advertised.listeners_ или _listeners_. Рекомендуется использовать _advertized.listeners_. Обозначает имя хоста для публикации в ZooKeeper для использования клиентами. В средах IaaS может отличаться от интерфейса, к которому привязывается брокер. Если параметр не задан, публикуется тот же порт, к которому привязан брокер

-   TYPE – int
-   DEFAULT – null
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – read-only

📌 **auto.create.topics.enable** – Включение автоматического создания топика на сервере

-   TYPE – boolean
-   DEFAULT – true
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – read-only

📌 **auto.leader.rebalance.enable** – Включение автоматической балансировки лидера. Балансировка лидера в фоновом режиме через регулярные промежутки времени

-   TYPE – boolean
-   DEFAULT – true
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – read-only

📌 **background.threads** – Количество потоков для различных задач фоновой обработки

-   TYPE – int
-   DEFAULT – 10
-   VALID VALUES – [1,…]
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – cluster-wide

📌 **broker.id** – Идентификатор брокера для сервера. Если значение не установлено, создается уникальный идентификатор брокера. Чтобы избежать конфликтов между id брокера, созданными с помощью zookeeper, и id брокера, настроенными пользователем, генерация идентификаторов брокера начинается с _reserved.broker.max.id + 1_

-   TYPE – int
-   DEFAULT – - 1
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – read-only

📌 **compression.type** – Конечный тип сжатия для топика. Конфигурация принимает стандартные кодеки сжатия (“gzip”, “snappy”, “lz4”). Так же возможно “uncompressed”, что эквивалентно отсутствию сжатия; и “producer”, что означает сохранение исходного кодека сжатия, установленного поставщиком

-   TYPE – string
-   DEFAULT – producer
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – cluster-wide

📌 **delete.topic.enable** – Включение возможности удаления топика. При отключенном параметре удаление топика через администратора не имеет результата

-   TYPE – boolean
-   DEFAULT – true
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – read-only

📌 **host.name** – Применяется только когда параметр _listeners_ не установлен. Рекомендуется использовать _listeners_. Обозначает имя хоста брокера. Если параметр задан, то привязка выполняется только к данному адресу. Если параметр не задан, привязка выполняется ко всем интерфейсам

-   TYPE – string
-   DEFAULT – “”
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – read-only

📌 **leader.imbalance.check.interval.seconds** – Частота, с которой контроллер запускает проверку балансировки партиции

-   TYPE – long
-   DEFAULT – 300
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – read-only

📌 **leader.imbalance.per.broker.percentage** – Коэффициент дисбаланса лидера, допустимый для каждого брокера. Контроллер запускает балансировку лидера, если он превышает данное значение для брокера. Указывается в процентах

-   TYPE – int
-   DEFAULT – 10
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – read-only

📌 **listeners** – Listener List – Разделенный запятыми список URI, которые прослушиваются, и имена слушателей сети. Если имя слушателя не является протоколом безопасности, необходимо установить _listener.security.protocol.map_. Для привязки ко всем интерфейсам указать имя хоста “0.0.0.0”. Если имя хоста не указано, привязка осуществляется к интерфейсу по умолчанию. Примеры списков слушателей сети: PLAINTEXT://myhost:9092,SSL://:9091,CLIENT://0.0.0.0:9092,REPLICATION://localhost:9093

-   TYPE – string
-   DEFAULT – null
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – per-broker

📌**log.dir** – Каталог хранения данных журнала (дополнительный для свойства log.dirs)

-   TYPE – string
-   DEFAULT – /tmp/kafka-logs
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – read-only

📌**log.dirs** – Каталоги хранения данных журнала. Если параметр не установлен, используется значение свойства _log.dir_

-   TYPE – string
-   DEFAULT – null
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – high

📌**log.flush.interval.messages** – Количество накопленных в партиции журнала данных перед их сбросом на диск

-   TYPE – long
-   DEFAULT – 9223372036854775807
-   VALID VALUES – [1,…]
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – cluster-wide

📌**log.flush.interval.ms** – Максимальное время хранения данных в любом топике в памяти до их сброса на диск. Указывается в миллисекундах. Если параметр не установлен, используется значение _log.flush.scheduler.interval.ms_

-   TYPE – long
-   DEFAULT – null
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – cluster-wide

📌**log.flush.offset.checkpoint.interval.ms** – Частота обновления постоянной записи последнего сброса, который действует как точка восстановления журнала

-   TYPE – int
-   DEFAULT – 60000
-   VALID VALUES – [0,…]
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – read-only

📌**log.flush.scheduler.interval.ms** – Частота log flusher проверки на необходимость сброса какого-либо журнала на диск. Указывается в миллисекундах

-   TYPE – long
-   DEFAULT – 9223372036854775807
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – read-only

📌**log.flush.start.offset.checkpoint.interval.ms** – Частота обновления постоянной записи смещения начала журнала

-   TYPE – int
-   DEFAULT – 60000
-   VALID VALUES – [0,…]
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – read-only

📌**log.retention.bytes** – Максимальный размер журнала перед его удалением

-   TYPE – long
-   DEFAULT – - 1
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – cluster-wide

📌**log.retention.hours** – Количество часов для хранения файла журнала перед его удалением, третично по отношению к свойству _log.retention.ms_. Указывается в часах

-   TYPE – int
-   DEFAULT – 168
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – read-only

📌**log.retention.minutes** – Количество минут для хранения файла журнала перед его удалением, вторично по отношению к свойству _log.retention.hours_. Указывается в минутах

-   TYPE – int
-   DEFAULT – null
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – read-only

📌**log.retention.ms** – Количество миллисекунд для хранения файла журнала перед его удалением. Указывается в миллисекундах. Если параметр не установлен, используется значение _log.retention.minutes_

-   TYPE – long
-   DEFAULT – null
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – cluster-wide

**log.roll.hours** – Максимальное время до развертывания нового сегмента журнала, вторично по отношению к свойству _log.roll.ms_. Указывается в часах

-   TYPE – int
-   DEFAULT – 168
-   VALID VALUES – [1,…]
-   IMPORTANCE – [1,…]
-   DYNAMIC UPDATE MODE – read-only

📌**log.roll.jitter.hours** – Максимально допустимое значение джиттера для вычитания из _logRollTimeMillis_, вторично по отношению к свойству _log.roll.jitter.ms_. Указывается в часах

-   TYPE – int
-   DEFAULT – int
-   VALID VALUES – [0,…]
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – read-only

📌**log.roll.jitter.ms** – Максимально допустимое значение джиттера для вычитания из _logRollTimeMillis_. Указывается в миллисекундах. Если параметр не установлен, используется значение _log.roll.jitter.hours_

-   TYPE – long
-   DEFAULT – long
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – cluster-wide

📌**log.roll.ms** – Максимальное время до развертывания нового сегмента журнала. Указывается в миллисекундах. Если параметр не установлен, используется значение _log.roll.hours_

-   TYPE – long
-   DEFAULT – null
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – cluster-wide

📌**log.segment.bytes** – Максимальный размер одного файла журнала

-   TYPE – int
-   DEFAULT – 1073741824
-   VALID VALUES – [14,…]
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – cluster-wide

📌**log.segment.delete.delay.ms** – Время ожидания перед удалением файла из файловой системы

-   TYPE – long
-   DEFAULT – 60000
-   VALID VALUES – [0,…]
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – cluster-wide

📌**message.max.bytes** – Наибольший размер пакета данных, разрешенный ADS. При увеличении параметра следует также увеличить размер выборки для потребителей с целью обеспечения возможности получения пакета данных установленного размера. Параметр можно настроить для каждого топика с помощью поуровневой конфирурации топика _max.message.bytes_

-   TYPE – int
-   DEFAULT – 1000012
-   VALID VALUES – [0,…]
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – cluster-wide

**min.insync.replicas** – При установленном поставщиком подтверждении acks на “all” или “-1”, _min.insync.replicas_ задается на минимальное количество реплик для подтверждения записи. Если этот минимум не может быть удовлетворен, то поставщик задает исключение (либо _NotEnoughReplicas_, либо _NotEnoughReplicasAfterAppend_). Совместное использование _min.insync.replicas_ и acks обеспечивает более высокую гарантию к устойчивости. Типичным сценарием является создание топика с коэффициентом репликации _3_, параметром _min.insync.replicas_ равным _2_ и acks установленным на “all”. Это гарантирует, что поставщик задает исключение, если большинство реплик не принимает запись

-   TYPE – int
-   DEFAULT – 1
-   VALID VALUES – [1,…]
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – cluster-wide

**num.io.threads** – Число потоков, используемых сервером для обработки запросов, которые могут включать дисковые операции ввода-вывода

-   TYPE – int
-   DEFAULT – 8
-   VALID VALUES – [1,…]
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – cluster-wide

**num.network.threads** – Количество потоков, используемых сервером для получения запросов от сети и отправки ответов в сеть

-   TYPE – int
-   DEFAULT – 3
-   VALID VALUES – [1,…]
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – cluster-wide

**num.recovery.threads.per.data.dir** – Число потоков в каталоге данных, используемых для восстановления журнала при запуске или при сбросе по прекращению работы

-   TYPE – int
-   DEFAULT – 1
-   VALID VALUES – [1,…]
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – cluster-wide

**num.replica.alter.log.dirs.threads** – Число потоков, которые могут перемещать реплики между каталогами журналов, включая дисковые операции ввода-вывода

-   TYPE – int
-   DEFAULT – null
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – read-only

**num.replica.fetchers** – Количество потоков выборки, используемых для репликации данных от исходного брокера. Увеличение этого значения может увеличить степень параллелизма ввода-вывода в брокере-подписчике

-   TYPE – int
-   DEFAULT – 1
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – cluster-wide

**offset.metadata.max.bytes** – Максимальный размер для записи метаданных с учетом фиксации смещения

-   TYPE – int
-   DEFAULT – 4096
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – read-only

**offsets.commit.required.acks** – Принятие необходимых подтверждений acks перед фиксацией данных. Значение по умолчанию “-1” не следует переопределять

-   TYPE – short
-   DEFAULT – - 1
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – read-only

**offsets.commit.timeout.ms** – Фиксация смещения откладывается до тех пор, пока все реплики для топика смещения не получат коммит или данный установленный таймаут не будет достигнут. Аналогично времени ожидания запроса поставщика

-   TYPE – int
-   DEFAULT – 5000
-   VALID VALUES – [1,…]
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – read-only

**offsets.load.buffer.size** – Размер пакета для чтения из сегментов смещений при загрузке смещений в кэш

-   TYPE – int
-   DEFAULT – 5242880
-   VALID VALUES – [1,…]
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – read-only

**offsets.retention.check.interval.ms** – Частота проверки устаревших смещений

-   TYPE – long
-   DEFAULT – 600000
-   VALID VALUES – [1,…]
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – read-only

**offsets.retention.minutes** – Сброс смещений старше установленного срока хранения

-   TYPE – int
-   DEFAULT – 1440
-   VALID VALUES – [1,…]
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – read-only

**offsets.topic.compression.codec** – Кодек сжатия для топика смещения. Сжатие может использоваться для достижения “атомных” коммитов

-   TYPE – int
-   DEFAULT – 0
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – read-only

**offsets.topic.num.partitions** – Количество партиций для коммита топика смещения (не следует изменять после развертывания)

-   TYPE – int
-   DEFAULT – 50
-   VALID VALUES – [1,…]
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – read-only

**offsets.topic.replication.factor** – Коэффициент репликации для топика смещения (устанавливается выше с целью обеспечения доступности). Создание внутреннего топика невозможно, пока размер кластера не соответствует данному требованию коэффициента репликации

-   TYPE – short
-   DEFAULT – 3
-   VALID VALUES – [1,…]
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – read-only

**offsets.topic.segment.bytes** – Размер сегмента топика смещений в байтах. Значение должно быть относительно небольшим с целью ускорения сжатия журнала и загрузку кэша

-   TYPE – int
-   DEFAULT – 104857600
-   VALID VALUES – [1,…]
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – read-only

**port** – Применяется при неустановленном параметре _listeners_. Рекомендуется использовать _listeners_. Обозначает порт для прослушивания и приема подключений

-   TYPE – int
-   DEFAULT – 9092
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – read-only

**queued.max.requests** – Количество запросов в очереди до блокировки сетевых потоков

-   TYPE – int
-   DEFAULT – 500
-   VALID VALUES – [1,…]
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – read-only

**quota.consumer.default** – Применяется при неустановленном параметре динамических квот по умолчанию в Zookeeper. Любой потребитель группы customerId/consumer дросселируется при получении большего количества байтов, чем данное установленное значение в секунду

-   TYPE – long
-   DEFAULT – 9223372036854775807
-   VALID VALUES – [1,…]
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – read-only

**quota.producer.default** – Применяется при неустановленном параметре динамических квот по умолчанию в Zookeeper. Любой поставщик с известным clientId дросселируется при получении большего количества байтов, чем данное установленное значение в секунду

-   TYPE – long
-   DEFAULT – 9223372036854775807
-   VALID VALUES – [1,…]
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – read-only

**replica.fetch.min.bytes** – Минимальное количество байт, ожидаемое для каждого ответа на выборку. При недостаточном объеме срабатывает параметр _replicaMaxWaitTimeMs_

-   TYPE – int
-   DEFAULT – 1
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – read-only

**replica.fetch.wait.max.ms** – Максимальное время ожидания для каждого запроса на выборку с последующей публикацией реплик. Значение всегда должно быть меньше параметра _replica.lag.time.max.ms_ для предотвращения частого сжатия ISR низкопроизводительных топиков

-   TYPE – int
-   DEFAULT – 500
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – read-only

**replica.high.watermark.checkpoint.interval.ms** – Верхний предел частоты сохранения на диск (Частота сохранения высокого водяного знака на диск)

-   TYPE – long
-   DEFAULT – 5000
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – read-only

**replica.lag.time.max.ms** – Удаление подписчика лидером из isr в случае, если подписчик не отправил ни одного запроса на выборку или не считал конечное смещение журнала лидеров

-   TYPE – long
-   DEFAULT – 10000
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – read-only

**replica.socket.receive.buffer.bytes** – Буфер приема сокетов для сетевых запросов

-   TYPE – int
-   DEFAULT – 65536
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – read-only

**replica.socket.timeout.ms** – Время ожидания сокета для сетевых запросов. Значение должно быть не менее установленного параметра _replica.fetch.wait.max.ms_

-   TYPE – int
-   DEFAULT – 30000
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – read-only

**request.timeout.ms** – Максимальное время ожидания клиентом ответа на запрос. Если ответ не получен до истечения установленного значения, клиент повторно отправляет запрос при необходимости

-   TYPE – int
-   DEFAULT – 30000
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – read-only

**socket.receive.buffer.bytes** – Буфер SO_RCVBUF сокета сервера сокетов. При значении параметра “-1” используется ОС по умолчанию

-   TYPE – int
-   DEFAULT – 102400
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – read-only

**socket.request.max.bytes** – Максимальное количество байт в запросе сокета

-   TYPE – int
-   DEFAULT – 104857600
-   VALID VALUES – [1,…]
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – read-only

**socket.send.buffer.bytes** – Буфер SO_SNDBUF сокета сервера сокетов. При значении параметра “-1” используется ОС по умолчанию

-   TYPE – int
-   DEFAULT – 102400
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – read-only

**transaction.max.timeout.ms** – Максимально допустимое время ожидания для транзакций. Если запрошенное клиентом время транзакции превышает установленное значение, тогда брокер выдает ошибку в _InitProducerIdRequest_. Это предотвращает чрезмерное превышение времени ожидания для клиента, которое может тормозить чтение данных потребителями из топиков, включенных в транзакцию

-   TYPE – int
-   DEFAULT – 900000
-   VALID VALUES – [1,…]
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – read-only

**transaction.state.log.load.buffer.size** – Размер пакета для чтения из сегментов журнала транзакций при загрузке в кэш идентификаторов поставщиков и транзакций

-   TYPE – int
-   DEFAULT – 5242880
-   VALID VALUES – [1,…]
-   IMPORTANCE – [1,…]
-   DYNAMIC UPDATE MODE – read-only

**transaction.state.log.min.isr** – Переопределение конфигурации _min.insync.replicas_ для топика транзакции

-   TYPE – int
-   DEFAULT – 2
-   VALID VALUES – [1,…]
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – read-only

**transaction.state.log.num.partitions** – Количество партиций для топика транзакции (после развертывания параметр должен остаться неизменным)

-   TYPE – int
-   DEFAULT – 50
-   VALID VALUES – [1,…]
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – read-only

**transaction.state.log.replication.factor** – Коэффициент репликации для топика транзакции (задается выше для обеспечения доступности). Создание внутреннего топика завершится ошибкой, пока размер кластера не будет соответствовать данному требованию к фактору репликации

-   TYPE – short
-   DEFAULT – 3
-   VALID VALUES – [1,…]
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – read-only

**transaction.state.log.segment.bytes** – Байты сегмента топика транзакции должны быть относительно небольшими для ускорения сжатия журнала и загрузки кэша

-   TYPE – int
-   DEFAULT – 104857600
-   VALID VALUES – [1,…]
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – read-only

**transactional.id.expiration.ms** – Максимальное время ожидания для координатора транзакций прежде, чем предварительно истечет срок действия идентификатора транзакции поставщика без получения обновлений состояния транзакции. Указывается в миллисекундах

-   TYPE – int
-   DEFAULT – 604800000
-   VALID VALUES – [1,…]
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – read-only

**unclean.leader.election.enable** – Указывает, следует ли включить не входящие в набор ISR реплики и установка последнего средства в качестве лидера, даже если это может привести к потере данных

-   TYPE – boolean
-   DEFAULT – false
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – cluster-wide

**zookeeper.connection.timeout.ms** – Максимальное время ожидания клиентом установки соединения с Zookeeper. Если параметр не задан, используется значение для _zookeeper.session.timeout.ms_. Указывается в миллисекундах

-   TYPE – int
-   DEFAULT – null
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – read-only

**zookeeper.max.in.flight.requests** – Максимальное количество неподтвержденных запросов, отправленных клиентом в Zookeeper, перед блокировкой

-   TYPE – int
-   DEFAULT – 10
-   VALID VALUES – [1,…]
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – read-only

**zookeeper.session.timeout.ms** – Тайм-аут сеанса Zookeeper. Указывается в миллисекундах

-   TYPE – int
-   DEFAULT – int
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – read-only

**zookeeper.set.acl** – Настройка клиента для использования безопасных списков управления доступом ACL

-   TYPE – boolean
-   DEFAULT – boolean
-   IMPORTANCE – high
-   DYNAMIC UPDATE MODE – read-only

**broker.id.generation.enable** – Автоматическое создание идентификатора брокера на сервере. При включенном параметре значение, настроенное для _reserved.broker.max.id_, должно быть пересмотрено

-   TYPE – boolean
-   DEFAULT – true
-   IMPORTANCE – medium
-   DYNAMIC UPDATE MODE – read-only

**broker.rack** – Стойка брокера. Используется при назначении репликации в стойке для отказоустойчивости. Примеры: “RACK1”, “us-east-1d”

-   TYPE – string
-   DEFAULT – string
-   IMPORTANCE – medium
-   DYNAMIC UPDATE MODE – read-only

**connections.max.idle.ms** – Время ожидания бездействующих соединений: потоки процессора сокета сервера закрывают соединения, которые простаивают больше установленного значения. Указывается в миллисекундах

-   TYPE – long
-   DEFAULT – 600000
-   IMPORTANCE – medium
-   DYNAMIC UPDATE MODE – read-only

**controlled.shutdown.enable** – Включение контролируемого завершения работы сервера

-   TYPE – boolean
-   DEFAULT – true
-   IMPORTANCE – medium
-   DYNAMIC UPDATE MODE – read-only

**controlled.shutdown.max.retries** – Контролируемое выключение может завершиться ошибкой по нескольким причинам: параметр определяет количество повторных попыток подключения при возникновении таких сбоев

-   TYPE – int
-   DEFAULT – 3
-   IMPORTANCE – medium
-   DYNAMIC UPDATE MODE – read-only

**controlled.shutdown.retry.backoff.ms** – Перед каждой повторной попыткой подключения системе требуется время для восстановления состояния, вызвавшего предыдущий сбой (сбой контроллера, задержка реплики и т.д.). Параметр определяет время ожидания перед повторной попыткой. Указывается в миллисекундах

-   TYPE – long
-   DEFAULT – 5000
-   IMPORTANCE – medium
-   DYNAMIC UPDATE MODE – read-only

**controller.socket.timeout.ms** – Время ожидания сокета для каналов контроллер-брокер. Указывается в миллисекундах

-   TYPE – int
-   DEFAULT – 30000
-   IMPORTANCE – medium
-   DYNAMIC UPDATE MODE – read-only

**default.replication.factor** – Коэффициенты репликации по умолчанию для автоматически создаваемых топиков

-   TYPE – int
-   DEFAULT – 1
-   IMPORTANCE – medium
-   DYNAMIC UPDATE MODE – read-only

**delegation.token.expiry.time.ms** – Время действия токена перед его обновлением. Значение по умолчанию 1 день. Указывается в миллисекундах

-   TYPE – long
-   DEFAULT – 86400000
-   VALID VALUES – [1,…]
-   IMPORTANCE – medium
-   DYNAMIC UPDATE MODE – read-only

**delegation.token.master.key** – Мастер/секретный ключ для создания и проверки делегированных токенов. Один и тот же ключ должен быть настроен для всех брокеров. Если ключ не установлен или задана пустая строка, брокеры отключают поддержку делегированных токенов

-   TYPE – password
-   DEFAULT – null
-   IMPORTANCE – medium
-   DYNAMIC UPDATE MODE – read-only

**delegation.token.max.lifetime.ms** – Максимальный срок действия токена, по истечении которого он больше не может быть обновлен. Значение по умолчанию 7 дней. Указывается в миллисекундах

-   TYPE – long
-   DEFAULT – 604800000
-   VALID VALUES – [1,…]
-   IMPORTANCE – medium
-   DYNAMIC UPDATE MODE – read-only

**delete.records.purgatory.purge.interval.requests** – Интервал очистки записей на удаление. Значение указывается в количестве запросов

-   TYPE – int
-   DEFAULT – 1
-   IMPORTANCE – medium
-   DYNAMIC UPDATE MODE – read-only

**fetch.purgatory.purge.interval.requests** – Интервал очистки запросов выборки. Значение указывается в количестве запросов

-   TYPE – int
-   DEFAULT – 1000
-   IMPORTANCE – medium
-   DYNAMIC UPDATE MODE – read-only

**group.initial.rebalance.delay.ms** – Время, в течение которого координатор группы ожидает присоединения большего числа потребителей к новой группе перед выполнением первой перебалансировки. Более длительная задержка означает потенциально меньшее количество перебалансировок, но увеличивает время до начала обработки. Указывается в миллисекундах

-   TYPE – int
-   DEFAULT – 3000
-   IMPORTANCE – medium
-   DYNAMIC UPDATE MODE – read-only

**group.max.session.timeout.ms** – Максимально допустимое время ожидания сессии для зарегистрированных потребителей. Более длительные тайм-ауты дают потребителям больше времени для обработки данных между heartbeat-сообщениями за счет большего времени для выявления сбоев. Указывается в миллисекундах

-   TYPE – int
-   DEFAULT – 300000
-   IMPORTANCE – medium
-   DYNAMIC UPDATE MODE – read-only

**group.min.session.timeout.ms** – Минимально допустимое время ожидания сессии для зарегистрированных потребителей. Более короткие тайм-ауты приводят к более быстрому обнаружению сбоев за счет более частых heartbeat-сообщений, которые могут перегружать ресурсы брокера. Указывается в миллисекундах

-   TYPE – int
-   DEFAULT – 6000
-   IMPORTANCE – medium
-   DYNAMIC UPDATE MODE – read-only

**inter.broker.listener.name** – Имя слушателя для связи между брокерами. Если параметр не задан, имя слушателя определяется свойством _security.inter.broker.protocol_. Одновременная установка параметров _inter.broker.listener.name_ и _security.inter.broker.protocol_ вызывает ошибку

-   TYPE – string
-   DEFAULT – null
-   IMPORTANCE – medium
-   DYNAMIC UPDATE MODE – read-only

**inter.broker.protocol.version** – Версия межброкерского протокола. Обычно параметр задается после обновления всех брокеров до новой версии. Пример некоторых допустимых значений: “0.8.0”, “0.8.1”, “0.8.1.1”, “0.8.2”, “0.8.2.0”, “0.8.2.1”, “0.9.0.0”, “0.9.0.1”. Необходимо проверить ApiVersion для полного списка

-   TYPE – string
-   DEFAULT – 1.1-IV0
-   IMPORTANCE – medium
-   DYNAMIC UPDATE MODE – read-only

**log.cleaner.backoff.ms** – Время спящего режима при отсутствии журналов для очистки. Указывается в миллисекундах

-   TYPE – long
-   DEFAULT – 15000
-   VALID VALUES – [0,…]
-   IMPORTANCE – medium
-   DYNAMIC UPDATE MODE – cluster-wide

**log.cleaner.dedupe.buffer.size** – Общая память, используемая для дедупликации журнала во всех чистых потоках

-   TYPE – long
-   DEFAULT – 134217728
-   IMPORTANCE – medium
-   DYNAMIC UPDATE MODE – cluster-wide

**log.cleaner.delete.retention.ms** – Длительность хранения удаленных записей. Указывается в миллисекундах

-   TYPE – long
-   DEFAULT – 86400000
-   IMPORTANCE – medium
-   DYNAMIC UPDATE MODE – cluster-wide

**log.cleaner.enable** – Включение процесса очистки журналов для запуска на сервере. Параметр должен быть включен, если используются какие-либо топики с помощью _cleanup.policy=compact_, включая топик внутренних смещений. Если параметр отключен, данные топики не сжимаются и постоянно растут в объеме

-   TYPE – boolean
-   DEFAULT – true
-   IMPORTANCE – medium
-   DYNAMIC UPDATE MODE – read-only

**log.cleaner.io.buffer.load.factor** – Коэффициент загрузки буфера дедуплирования журнала очистки – процент заполнения буфера дедуплирования. Более высокое значение позволит очистить больше журнала, но приведет к большему количеству хэш-конфликтов

-   TYPE – double
-   DEFAULT – 0.9
-   IMPORTANCE – medium
-   DYNAMIC UPDATE MODE – cluster-wide

**log.cleaner.io.buffer.size** – Общая память, используемая для ввода-вывода буферов журнала очистки через все чистые потоки

-   TYPE – int
-   DEFAULT – 524288
-   VALID VALUES – [0,…]
-   IMPORTANCE – medium
-   DYNAMIC UPDATE MODE – cluster-wide

**log.cleaner.io.max.bytes.per.second** – Очистка журнала дросселируется таким образом, чтобы сумма операций чтения и записи была меньше установленного значения

-   TYPE – double
-   DEFAULT – 1.7976931348623157E308
-   IMPORTANCE – medium
-   DYNAMIC UPDATE MODE – cluster-wide

**log.cleaner.min.cleanable.ratio** – Минимальное отношение грязного журнала к общему журналу для журнала, пригодного для очистки

-   TYPE – double
-   DEFAULT – 0.5
-   IMPORTANCE – medium
-   DYNAMIC UPDATE MODE – cluster-wide

**log.cleaner.min.compaction.lag.ms** – Минимальное время, в течение которого сообщение остается несжатым в журнале. Применяется только для журналов с функцией сжатия. Указывается в миллисекундах

-   TYPE – long
-   DEFAULT – 0
-   IMPORTANCE – medium
-   DYNAMIC UPDATE MODE – cluster-wide

**log.cleaner.threads** – Количество фоновых потоков для очистки журнала

-   TYPE – int
-   DEFAULT – 1
-   VALID VALUES – [0,…]
-   IMPORTANCE – medium
-   DYNAMIC UPDATE MODE – cluster-wide

**log.cleanup.policy** – Политика очистки по умолчанию для сегментов, превышающих период хранения. Допустимые политики: “delete” и “compact”

-   TYPE – list
-   DEFAULT – delete
-   VALID VALUES – [compact, delete]
-   IMPORTANCE – medium
-   DYNAMIC UPDATE MODE – cluster-wide

**log.index.interval.bytes** – Интервал добавления записи в индекс смещения

-   TYPE – int
-   DEFAULT – 4096
-   VALID VALUES – [0,…]
-   IMPORTANCE – medium
-   DYNAMIC UPDATE MODE – cluster-wide

**log.index.size.max.bytes** – Максимальный размер индекса смещения. Указывается в байтах

-   TYPE – int
-   DEFAULT – 10485760
-   VALID VALUES – [4,…]
-   IMPORTANCE – medium
-   DYNAMIC UPDATE MODE – cluster-wide

**log.message.format.version** – Версия формата сообщений, которую брокер использует для добавления данных в журналы. Значение должно быть действительным ApiVersion. Некоторые примеры: “0.8.2”, “0.9.0.0”, “0.10.0”. Необходимо проверить ApiVersion для получения более подробной информации. Установив версию формата сообщений, пользователь подтверждает, что все существующие данные на диске меньше или равны указанной версии. Неправильное задание параметра приводит к тому, что потребители с более старыми версиями получают данные в нечитаемом формате

-   TYPE – string
-   DEFAULT – 1.1-IV0
-   IMPORTANCE – medium
-   DYNAMIC UPDATE MODE – read-only

**log.message.timestamp.difference.max.ms** – Максимальное допустимое различие между отметкой времени, когда брокер получает сообщение, и отметкой времени, указанной в сообщении. При _log.message.timestamp.type=CreateTime_ сообщение отклоняется, если разница в отметке времени превышает указанный порог. Конфигурация игнорируется, если _log.message.timestamp.type=LogAppendTime_. Максимально допустимое различие временных отметок должно быть не больше, чем _log.retention.ms_. Указывается в миллисекундах

-   TYPE – long
-   DEFAULT – 9223372036854775807
-   IMPORTANCE – medium
-   DYNAMIC UPDATE MODE – cluster-wide

**log.message.timestamp.type** – Определить, является ли отметка времени в сообщении временем создания сообщения или временем добавления журнала. Параметр может принимать значение “CreateTime” либо “LogAppendTime”

-   TYPE – string
-   DEFAULT – CreateTime
-   VALID VALUES – [CreateTime, LogAppendTime]
-   IMPORTANCE – medium
-   DYNAMIC UPDATE MODE – cluster-wide

**log.preallocate** – Предварительное выделение файла при создании нового сегмента. При испольовании платформы ADS в Windows рекомендуется установить значение “true”

-   TYPE – boolean
-   DEFAULT – false
-   IMPORTANCE – medium
-   DYNAMIC UPDATE MODE – cluster-wide

**log.retention.check.interval.ms** – Частота проверки журналом очистки на наличие какого-либо журнала на удаление. Указывается в миллисекундах

-   TYPE – long
-   DEFAULT – 300000
-   VALID VALUES – [1,…]
-   IMPORTANCE – medium
-   DYNAMIC UPDATE MODE – read-only

**max.connections.per.ip** – Максимальное количество подключений с каждого IP-адреса

-   TYPE – int
-   DEFAULT – 2147483647
-   VALID VALUES – [1,…]
-   IMPORTANCE – medium
-   DYNAMIC UPDATE MODE – read-only

**max.connections.per.ip.overrides** – Ip или hostname переопределяет максимальное количество подключений по умолчанию

-   TYPE – string
-   DEFAULT – “”
-   IMPORTANCE – medium
-   DYNAMIC UPDATE MODE – read-only

**max.incremental.fetch.session.cache.slots** – Максимальное количество сессий инкрементной выборки

-   TYPE – int
-   DEFAULT – 1000
-   VALID VALUES – [0,…]
-   IMPORTANCE – medium
-   DYNAMIC UPDATE MODE – read-only

**num.partitions** – Число партиций по умолчанию для каждого топика

-   TYPE – int
-   DEFAULT – 1
-   VALID VALUES – [1,…]
-   IMPORTANCE – medium
-   DYNAMIC UPDATE MODE – read-only

**password.encoder.old.secret** – Старый секрет для кодирования динамически настроенных паролей. Установка параметра требуется только при обновлении секрета. Если параметр задан, все динамически закодированные пароли декодируются и перекодируются с помощью _password.encoder.secret_ при запуске брокера

-   TYPE – password
-   DEFAULT – null
-   IMPORTANCE – medium
-   DYNAMIC UPDATE MODE – read-only

**password.encoder.secret** – Секрет для кодирования динамически настроенных паролей для данного брокера

-   TYPE – password
-   DEFAULT – null
-   IMPORTANCE – medium
-   DYNAMIC UPDATE MODE – read-only

**principal.builder.class** – Полное имя класса, реализующего интерфейс ADSPrincipalBuilder, который используется для создания объекта ADSPrincipal во время авторизации. Конфигурация также поддерживает устаревший интерфейс PrincipalBuilder, который ранее использовался для аутентификации клиентов по протоколу SSL. Если параметр не задан, действие по умолчанию зависит от используемого протокола безопасности. Для аутентификации SSL имя принципала отличается от имени из сертификата клиента, если он предоставлен; в противном случае, если аутентификация клиента не требуется, имя принципала задается “ANONYMOUS”. Для аутентификации SASL принципал задается на основании правил, определенных в _sasl.kerberos.principal.to.local.rules_ с использованием GSSAPI и идентификатора аутентификации SASL для других механизмов. Для PLAINTEXT имя принципала – “ANONYMOUS”

-   TYPE – class
-   DEFAULT – null
-   IMPORTANCE – medium
-   DYNAMIC UPDATE MODE – per-broker

**producer.purgatory.purge.interval.requests** – Интервал очистки запросов поставщика. Значение указывается в количестве запросов

-   TYPE – int
-   DEFAULT – 1000
-   IMPORTANCE – medium
-   DYNAMIC UPDATE MODE – read-only

**queued.max.request.bytes** – Разрешенное число байтов в очереди до того, как запросы не будут прочитаны
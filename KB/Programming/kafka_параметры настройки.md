
**[Producer](kafka_producer.md)**
*Настройки, определяющие размер того([батча](kafka_batch.md)), что мы передаём*
`batch-size` - сколько [сообщений](kafka_message.md)
`max.request.bytes` - размер в байтах

`linger.ms` - timeout на отправку
`acks` - получение подтверждения, что данные записались
	 **acks=0**  - don't wait for acknowlegment (possible data loss)
	- **acks=1** - wait for **leader** (limited data loss)
	- **acks=all** - wait **leader and replicas** (no data loss)
`max.in.flight.reuests.per.connection` - одновременное количество не посланных [батчей](kafka_batch.md). 

**[Consumer](kafka_Consumer.md)**
`fetch.max.wait` - какое время ждать, чтобы fetch-ить
`fetch.min.bytes` - говорит, что консьюмер не уйдёт, пока не прочитает столько-то количество байтов
`Reset offset: earlies/latest` - c какого момента консьюмеру (*если он, например, отвалился*) читать данные![[Pasted image 20221116201249.png]]
`Auto commit` - говорит кафке, что консьюмер получил сообщения, **без уведомления** об этом кафке. Пораждает много багов, т.к. мы можем не обработать сообщения и, когда у кафки просим их ещё раз, она никак на это не реагирует и не даёт нам больше **ничего**. Решение: 1) комитить **руками**  2) Ставить большие **таймауты** (`session.timeout`) на количество времени на обработку батчей
	`auto.commit.enabled` - включени автокоммит или нет
	`auto.commit.interval.ms` - если **автокоммит включен**, указывает через какое время **кидать автокоммит** 

`partition.assignment.strategy - range/` - стратегия назначения [партишенов](kafka_partition.md) 
	`range` - деление количество партишенов в топиках/количество консьюмеров (*в примере 3 партиции/2 консьюмера*)
	`roundrobin` - раздавать партиции по очереди (*рекомендуется*)
	![[Pasted image 20221116202828.png]]
	
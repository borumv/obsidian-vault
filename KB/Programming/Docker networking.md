---
created: Friday 10th February 2023 20:18
Last modified: Friday 10th February 2023 20:18
Aliases: сети docker
Tags: docker
---

# [[Docker networking]]

📌За управление сетями [[MOC-DOCKER|docker]] отвечает библиотека, которая называется [[Libnetwork]]
![[Pasted image 20230210202144.png|300]]

## Типы сетевых драйверов
- [[драйвер Bridge|bridge]] - изолированная сеть между контейнерами
- host - удаление изоляции контенера
- overlay - docker swarm
- macvlan - уникальныйц MAC адрес для контейнера
- null - без сети

Команды:
`connect` - подключить контенейр к сети
`create` - создать сеть
`disconnect` - отключение контенера от сети
`inspect` - параметры сети
---
created: Sunday 4th June 2023 10:24
Last modified: Sunday 4th June 2023 10:24
Aliases: saga design pattern
Tags: programming
---

**SAGA** - дизайн паттерн в [[Microservices|микросервисной архитектуре]], который обеспечивает управление [[согласованность_транзакции|согласованностью]] в распределённой между микросервисами транзакцией.

- [[Choreography Based]]
Заключается в том, что каждый микросервис общается через [[Брокер сообщений]] обмениваясь *событиями*
![[Pasted image 20230604103222.png|400]]

Если один из микросервисов в рамках одной транзакции будет *failed*, то согласно паттерну идёт *компенсационная транзакция*, которая возврщает значение в изначальное состояние (по-сути это rollback) 
![[Pasted image 20230604103638.png|400]]

- [[Orchestration Based]]
Заключается в том, что в каждом микросервисе есть **SAGA-класс** который управляет порядком формирования транзакции. Начинается всё с какого-то события (*event*), SAGA подхватывает его и отправляет какую-то *команду*, которую подхватывает необходимый сервис и в ответ (если всё ок), отправляет свой *event* который подхватывает SAGA и т.д.

![[Pasted image 20230604104305.png|300]]

Если же происходит какая-то ошибка, то в ответ уже идёт event-ошибки и SAGA возвращает по порядку, точно таким же способом (только с другими коммандами и eventa-ми) состояние нашей транзакции в исходную (начальную форму)

![[Pasted image 20230604104904.png|300]]


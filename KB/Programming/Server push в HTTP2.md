---
created: Monday 13th March 2023 10:24
Last modified: Monday 13th March 2023 10:24
Aliases: server push
Tags: programming
---


📌Алгоритм, обеспечивающий более высокую производительность взаимодействия сервера и клиента, введённый в [[HTTP версия 2|HTTP/2]].Сервер, зная, что клиент *может запросить* определённые ресурс, может *отправть его сам*, не дожидаясь запроса.


>Для этого сервер отправляет специальный *[[Frames в HTTP2|фрэйм]]* PUSH_PROMISE, c таким же id, что и запрос клиента
>![[Pasted image 20230312203928.png]]


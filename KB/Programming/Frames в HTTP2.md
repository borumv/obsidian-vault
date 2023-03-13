---
created: Monday 13th March 2023 09:57
Last modified: Monday 13th March 2023 09:56
Aliases: фрэймы в http/2
Tags: programming
---

Понятие, введённое в протоколе HTTP [[HTTP версия 2|версии 2]]. Теперь *все HTTP-сообщения* делятся на фреймы  (*HEADERS, DATA, RST_STRIME, PUSH_PROMISE, PRIORITY, etc*)
![[Pasted image 20230312134147.png]]
т.е. в отличии от http/1 сейчас происходит разбиения не на **логические** части, а **физические(*фреймы*)**.
Коллекция таких фреймов - это двунаправленный *[[Streams в HTTP2|поток (Stream)]]*. 


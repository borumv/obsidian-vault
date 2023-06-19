---
created: Tuesday 13th June 2023 09:23
Last modified: Tuesday 13th June 2023 09:23
Aliases: gateway
Tags: programming
---

**Маршруты (Routes)** - основной строительный блока gateway. Он определяется *идентификатором (id)*, *uri*, набором *предикатов (Predicate)* и *фильтров(Filter)*  
**Predicate** - это предикат функции Java 8. Тип ввода — `Spring Framework ServerWebExchange`. Это позволяет вам сопоставлять что-либо из HTTP-запроса, например заголовки или параметры.
**Filter** - Это экземпляры `Spring Framework GatewayFilter`, созданные с использованием определенной фабрики. Здесь вы можете изменять запросы и ответы до или после отправки нисходящего запроса.
![[Pasted image 20230619094503.png|300]]

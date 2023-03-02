
---
created: Sunday 26th February 2023 19:41
Last modified: Sunday 26th February 2023 19:40
Aliases: spring bean scope
Tags: spring, java
---

# [[spring_Bean Scopes|Bean Scopes]]

Для определения скоупа можно использовать аннотацию **@Scope**

***Common***
📌Singleton - один [[spring_Beans|бин]] создаётся в [[spring_IoC-контейнер|IoC-контейнере]]. - **default**
📌Prototype - при каждом запросе создаётся **новый бин**
***Web***
📌Request - один инстанс/http-запрос. Валиден в web-aware Spring ApplicationContext
📌Session - один инстанс/http-запрос. Валиден в web-aware Spring ApplicationContext
📌Global-session - один инстанс/глобальную сессию. Обычно только используется в [[Portlet context]].Валиден в web-aware Spring ApplicationContext - почти **не используется**
📌Application - бин ограничен жизненным циклом [[ServletContext]]. Валиден в контексте web aware
📌Websocket - скоуп одного бина в жизненном цикле [[WebSocket]]. Валиден в web-aware Spring ApplicationContext

📌Custom Scope- имплементируя **Scope**-интерфейс


![[Pasted image 20230302133637.png]]
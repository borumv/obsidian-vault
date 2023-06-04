---
created: Sunday 4th June 2023 10:56
Last modified: Sunday 4th June 2023 10:56
Aliases: Command Query Responsobility Segregation
Tags: programming
---

# [[CQRS]]

**Command-Query Responsobility Segregation** - дизайн паттерн суть которого заключается в разделении нашего микросервиса на 2 блока:
- *Commands* - работа с командами *POST*, *PUT*, *DELETE*, *PATCH*. Т.е. которые изменяют наши данные
- *Query* - работа с командой *GET*, т.е. просто *чтение*

Иногда микросервис можно разделить на отдельные микросервисы - QUERY API, COMMAND API.
Общение между ними может происходить через [[Брокер сообщений]], т.е. когда происходит, например *UPDATE*, то мы закидываем событие в очередь и **QUERY API**. 
![[Pasted image 20230604113311.png|400]]


Типы сообщений в CQRS:
- **Command** - выражает намерение изменить состояние нашего приложения. Например
*CreateProductCommand*, *UpdateProductCommand*, *DeleteProductCommand*
- **Query** - выражает намерение получения информации. Например 
*FindProductQuery*, *GetUserQuery*
- **Event** - означает уведомление, что что-то значимое произошло. Например
*ProductCreatedEvent*, *ProductUpdatedEvent*

**Event sourcing** 
В отличии от традиционного подхода работы с базой данных, когда мы, используя методы *изменения состояния* лишь меняем или *создаём* новый объект. В event-sourcing парадигме, мы сохраняем *event изменения состояния*
![[Pasted image 20230604114648.png|300]]
Т.е. в паттерне **CQRS** в *Command API* будет взаимодействовать с Event-store, а *Query API* - c обычной базой данных
![[Pasted image 20230604114932.png|300]]

see:[[Axon Framework]]
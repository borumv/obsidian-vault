---
created: Wednesday 7th June 2023 12:48
Last modified: Wednesday 7th June 2023 12:48
Aliases: маппинг в ElasticSearch
Tags: programming
---

Маппинг описывает структуру [[Документы в ElasticSearch|документа]] (их филды и типы данных). Также используется для настройки как данные будут индексированы 
Похож на таблицу в [[SQL]] (ddl)
![[Pasted image 20230607125112.png]]

Существует два типа маппинга:
- *Explicit mapping*
Мы описываем наш маппинг ручками-сам
- *Dynamic mapping*
[[ElasticSearch]] генерирует наш маппинг для нас.





### Elastic Common Schema
Спецификация наиболее распространённых fileds и как они должны быть смаплены. До этого не было единство между названиями филдов. 


---
created: Wednesday 7th June 2023 12:37
Last modified: Wednesday 7th June 2023 12:37
Aliases: инвертирование индексов в ElasticSearch
Tags: programming
---

Инвертирование индексов - это отображение/сопоставление терминов(токенов)(используем термин *terms*, когда речь идёт о чём-то вне контекста [[Analize API ElasticSearch|анализатора]]) и [[Документы в ElasticSearch|документов]], в которых они содержатся.

![[Pasted image 20230607124329.png]]

Каждый тип тип нашего филда использует *разные структуры данных*, например *numeric*, *date*, *geospatial* - [[BDK Trees ]].


---
created: Friday 2nd June 2023 10:13
Last modified: Friday 2nd June 2023 10:13
Aliases: elasticsearch
Tags: programming
---


**Elasticsearch** это движок *полнотекстового поиска*, но часто используется как документоориентированная база данных 
Поиск осуществляется за счёт *полнотекстового индекса*, который можно сравнить с методом глоссария. 
![[Pasted image 20230604120509.png|300]]


**Shard** в **Elasticsearch** — это логическая единица хранения данных на уровне базы, которая является отдельным экземпляром Lucene.

**Index** — это одновременно и распределенная база и механизм управления и организации данных, это именно логическое пространство. Индекс содержит один или более шардов, их совокупность и является хранилищем.  
  
Классическое сравнение индекса с другими базами выглядит примерно так.

| **Elasticsearch** | **SQL**  | **MongoDB**  |
| ----------------- | -------- | ------------ |
| Index             | Database | Database     |
| Mapping/Type      | Table    | Collection   |
| Field             | Column   | Field        |
| Object(JSON)      | Tuple    | Object(BSON) |
|                   |          |              |

Кластер Elasticsearch может содержать несколько 
- *Index* (баз данных), которые, в свою очередь, 
- содержат несколько *Type* (таблиц). 
- Эти типы содержат несколько *Document* (строк), 
- и каждый документ имеет *Properties* (столбцы). 

Таким образом, в вашем сценарии производства автомобилей у вас может быть индекс SubaruFactory. В этом индексе у вас есть три разных типа: Люди Легковые автомобили Запчасти Затем каждый тип содержит документы, соответствующие этому типу (например, документ Subaru Imprezza находится внутри типа Cars. Этот документ содержит все сведения об этом конкретном автомобиле). Поиск и запросы имеют формат: http://localhost:9200/[индекс]/[тип]/[операция]]


### Команды

**`GET /_cluster/health`** - информация о нашем [[Кластер в ElasticSearch|кластере]]
**`GET /_cat/indices?v`** - посмотреть информацию о наших [[Индексы в ElasticSearch|индексах]]
**`GET /_cat/shards?v`** - посмотреть информацию о [[Шарды в ElasticSearch|шардах]]

Управление [[Индексы в ElasticSearch|индексами]]
**`PUT /pages`** - создать [[Индексы в ElasticSearch|индекс]]
```json
PUT /pages
{
  "settings": {
    "number_of_shards": 2, //количество шардов
    "number_of_replicas": 2 //количество реплик
  }
}
```
**`DELETE /pages`** - удаление *индекса*

Управление [[Документы в ElasticSearch|документами]]
**`POST /pages/_doc`** - создание *документа*
```json
POST /pages/_doc
{
  "name":"Coffee",
  "cost":34,
  "in_stock":41
}
```

**`PUT /pages/_doc/100`** - обновление *документа*
```json
PUT /pages/_doc/100
{
  "name":"Coffee",
  "cost":12333,
  "in_stock":431
}
```
Обновление *документа*, с помощью POST:
```json
POST /pages/_update/100
{
  "doc": {
      "tags":["mocco"]
  } 
}
```

**`GET /pages/_doc/100`** - поиск *документа* по Id

**SCRIPTING**
*Обновление* с параметрами:
```json
POST /pages/_update/100
{
  "script": {
    "source": "ctx._source.in_stock -= params.quantity",
    "params": {"quantity": 1}
  }
}
```
*Обновление*  с условиями
```json
POST /pages/_update/100
{
  "script": {
    "source": """
      if(ctx._source.in_stock==0){
        ctx.op = 'noop';
      }
      ctx._source.in_stock -= 20;
    """
  }
}
```

**UPSERT**


**REPLACE**
Полностью заменяет содержимое документа
```json
PUT /pages/_doc/100
{
	  "name": "Coffee-banan"
}
GET /pages/_doc/100
```

**DELETE**
```json
DELETE /pages/_doc/101
```


## Поиск


[[Архитектура ElasticSearch]]



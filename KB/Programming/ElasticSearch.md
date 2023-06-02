---
created: Friday 2nd June 2023 10:13
Last modified: Friday 2nd June 2023 10:13
Aliases: elasticsearch
Tags: programming
---


**Elasticsearch** это документоориентированная база данных 

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

``
---
tags: postgresql
---

Чтобы узнать, какие типы [индексов](psql_Индексы.md) **доступны на моём сервере** используется команда:
```postgresql
SELECT amname FROM pg_am
```
Эта команда выводит следующий список типов:
1. [B-tree (сбалансированное дерево)](psql_index_Balanced%20Tree.md) - создаётся **по умолчанию**
2. [Хеш-индекс](psql_index%20Hash.md)

_Специализированные индексы:_
3. [GiST](psql_index%20GiST.md) (обобщённое дерево поиска)
4. [GIN](psql_index%20GIN.md) (обобщённый обратный)
5. [SP-GiST](psql_index%20SP-GiST.md) (GiST c двоичным разбиением пространства)
6. [BRIN](psql_index%20BRIN.md) (блочно-диапозонный) 

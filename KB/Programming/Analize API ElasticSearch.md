---
created: Wednesday 7th June 2023 12:32
Last modified: Wednesday 7th June 2023 12:32
Aliases: анализатор
Tags: programming
---

Когда мы создаём какой-то [[Document in ElasticSearch|документ]], он проходит через анализатор, результатом которого является *searchable data structure*.
Анализатор состоит из трёх частей:
- *Character filters*
Получает оригинальный текст и может трансформировать его *удаляя* или *заменяя* characters
Пример *`html_strip`* фильтра:
*Input* - `"I&apos;m in a <em>good</em> mood&nbsp;-&nbsp;and I <string>love> boris"`
*Output* - `I'm in a good mood - and I love boris`
Может быть несколько character filters!
- *Tokenizer*
Анализатор имеет только *один* токенизатор. Он сплитит наше слова на токены, создавая *массив* наши слов
*Input* - "I REALLY like beer!"
*Output* - ["I", "REALLY", "like", "beer"]
- *Token filters*
Токе фильтры принимают наш токенайзер и может *модифицировать* наши токены
Пример *`lowercase`* фильтра:
*Input* - ["I", "REALLY", "like", "beer"]
*Output* - ["i", "really", "like", "beer"]

*Запрос:*
```json
POST /_analyze
{
  "text": "HELLO WORLD MY NAMe is Boris",
  "tokenizer": "standard",
  "char_filter": [],
  "filter": ["lowercase"]
}
```
*Вернёт:*
```json
{
  "tokens": [
    {
      "token": "hello",
      "start_offset": 0,
      "end_offset": 5,
      "type": "<ALPHANUM>",
      "position": 0
    },
    {
      "token": "world",
      "start_offset": 6,
      "end_offset": 11,
      "type": "<ALPHANUM>",
      "position": 1
    },
    {
      "token": "my",
      "start_offset": 12,
      "end_offset": 14,
      "type": "<ALPHANUM>",
      "position": 2
    },
    {
      "token": "name",
      "start_offset": 15,
      "end_offset": 19,
      "type": "<ALPHANUM>",
      "position": 3
    },
    {
      "token": "is",
      "start_offset": 20,
      "end_offset": 22,
      "type": "<ALPHANUM>",
      "position": 4
    },
    {
      "token": "boris",
      "start_offset": 23,
      "end_offset": 28,
      "type": "<ALPHANUM>",
      "position": 5
    }
  ]
}
```


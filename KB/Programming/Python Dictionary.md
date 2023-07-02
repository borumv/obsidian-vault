---
created: Sunday 2nd July 2023 09:28
Last modified: Sunday 2nd July 2023 09:28
Aliases: словарь в Python
Tags: programming
---

### Dictionary in [[📙Python]]

```python
dictionary ={
    'a': [1,2,3],
    'b': 'hello',
    'c': True
}

print(dictionary['a'][0])
```

#### Methods
```python
user = {
	'basket': [1,2,3],
	'greet': 'hello'
}
```
- `user.get('age', 55)` - если нет такого ключа, то он создаётся и ему задаётся значение  55, иначе верни то, что есть
-  `user2 = dict(name='JohnJohn')` - функция которая создаёт словарь
- `'basket' in user` - вернёт True если есть
- `'hello' in user.values()`
- `'age' in user.keys()`
- `'hello' in user.items()` - ищет по всему (ключам и значениям)
- `user.clear()` - чистим
- `user.pop('age')` - удаляет последние добавленные ключ-значения (с питона 3.7)
- `user.update({'age': 55})` - обнjвляет значение, если мы обновляем новый ключ, то он создаётся



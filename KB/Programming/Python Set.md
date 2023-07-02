---
created: Sunday 2nd July 2023 09:32
Last modified: Sunday 2nd July 2023 09:32
Aliases: Set в Python
Tags: programming
---

### Set in [[📙Python]]
```python
my_set = {1,2,3,4,5}
your_set = {4,5,6,7,8,9,10}
```
**Методы**
- my_set.add()
- `.difference()` - что есть в моём сете, чего нет в том, который мы передаём в скобках
```python
my_set = {1,2,3,4,5}
your_set = {4,5,6,7,8,9,10}
print(my_set.difference(your_set))	#{1, 2, 3}
```
- `difference_update` - оставляем в моём сете только то, чего нет в сете, который мы передаём в скобках
```python
print(my_set.difference_update(your_set))
print(my_set) #{1, 2, 3}
```
- `.discard(5)` - удаление элемента из множества
- `.intersection` - возвращает общие значения обоих множеств, , можно использовать синтаксис **`my_set & your_set
```python
print(my_set.intersection(your_set)) #{4, 5}
```
- `isdisjoint` - если один покрывает другой, то вернёт **False**
```python
print(my_set.isdisjoint(your_set)) [[False]]
```
- `.union` - объединяет два подмножества, можно использовать синтаксис **`my_set | your_set`**
```python
print(my_set.union(your_set)) #{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
print(my_set | your_set)
print(my_set) #{1, 2, 3, 4, 5}
``` 
- `.issubset()` - возвращает **true** если множество является подмножеством 
- `.issuperset()` - возвращает **true**, если в множество входит другое множество


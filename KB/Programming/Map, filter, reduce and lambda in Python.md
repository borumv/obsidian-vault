---
created: Sunday 2nd July 2023 09:42
Last modified: Sunday 2nd July 2023 09:41
Aliases: функциональные штуки дрюки в питоне
Tags: programming
---

## **MAP, FILTER, ZIP, REDUCE (*+аналог с применением lambda*)*** в [[📙Python]]:

```python
from functools import reduce  
  
massive = [1, 2, 3]  
second_massive = [123, 3, 55]  
third_massive = [2, 2, 2, 2, 2, 2, 2]  
  
  
def multiply(item):  
    return item * 2  
  
  
def is_odd(item):  
    return item % 2 == 0  
  
  
def accumulate(acc, item):  
    print(f'item = {item} acc = {acc}')  
    return item + acc  
  
print(tuple(map(multiply, massive)))  # (2, 4, 6)  
print(tuple(map(lambda item: item * 2, massive)))  
print(list(filter(is_odd, massive)))  # 2  
print(list(filter(lambda item: item % 2 == 0, massive)))  
print(reduce(accumulate, massive, 0))  
print(reduce(lambda acc, item: acc + item, massive))  
print(list(zip(massive, second_massive, third_massive)))  # [(1, 123, 2), (2, 3, 2), (3, 55, 2)]
```


***Отсортировать массив тьюплов:***
```python
my_list_second = [(0, 2), (4, 3), (9, 9), (-1, 10)]  
my_list_second.sort(key = lambda x: x[1] if x[1] < x[0] else x[0])  
print(my_list_second)

```

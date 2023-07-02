---
created: Sunday 2nd July 2023 09:45
Last modified: Sunday 2nd July 2023 09:45
Aliases: comprehensions in python
Tags: programming
---


## Comprehension
```python
[[List]] comprehensions
my_list = [num for num in 'Hello']  
print(my_list)  # ['H', 'e', 'l', 'l', 'o']  
  
my_list_second = [num * 2 for num in range(1, 5)]  
print(my_list_second)  # [2, 4, 6, 8]  
  
my_list_third = [num for num in range(20, 32) if num % 2 == 0]  
print(my_list_third)  # [20, 22, 24, 26, 28, 30]

[[Set]] coprehensions
my_list_set = {num for num in 'Hello'}  
print(my_list_set)  # {'l', 'e', 'o', 'H'}

[[Dictionary]] comprehensions
simple_dictionary = {  
    'a': 2,  
    'b': 4  
}  
reformat_dict = {key: value * 2 for key, value in simple_dictionary.items()}  
print(reformat_dict)  # {'a': 4, 'b': 8}

dict = {num: num * 2 for num in [1, 2, 3, 4]}  
print(dict) #{1: 2, 2: 4, 3: 6, 4: 8}
```

***Найти дупликаты в массиве:***
```python
some_list = ['a', 'b', 'c', 'c', 'a', 'e']  
duplicates = {char for char in some_list if some_list.count(char) > 1}  
print(duplicates)
```
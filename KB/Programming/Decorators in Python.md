---
created: Sunday 2nd July 2023 09:47
Last modified: Sunday 2nd July 2023 09:47
Aliases: аннотации в питоне
Tags: programming
---


## Decorators in [[📙Python]]
```python
def hello(func):  
    def wrapper_function(*args, **kwargs):  
        print('****')  
        func(*args, **kwargs)  
        print('****')  
  
    return wrapper_function  
  
  
@hello  
def helka(greeting, emoji=':('):  
    print(greeting, emoji)  
  
  
helka('hi-ii')
```

*Другой пример:*
```python
from time import time  
  
  
def performance(func):  
    def wrapper(*args, **kwargs):  
        t1 = time()  
        result = func(*args, **kwargs)  
        t2 = time()  
        print(f'it took {t2 - t1} s')  
        return result  
  
    return wrapper()  
  
  
@performance  
def long_time():  
    for i in range(1, 1000000):  
        print(i * 5)  
  
  
long_time()
```
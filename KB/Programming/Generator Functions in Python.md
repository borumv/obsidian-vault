---
created: Sunday 2nd July 2023 09:49
Last modified: Sunday 2nd July 2023 09:49
Aliases: 
Tags: programming
---

## Generator Functions in [[📙Python]]

```python
def generator_function(num):  
    for i in range(num):  
        yield i  
  
  
for i in generator_function(50):  
    print(i)
```
*Пример реализации цикла for*:
```python
def special_for_loop(iterable):  
    iterate = iter(iterable)  
    while(True):  
        try:  
            print(next(iterate))  
        except StopIteration:  
            print("end")  
            break  
  
special_for_loop(['1','2','3'])
```
*Пример реализации **range**:
```python
class My_range():  
    current = 0  
  
    def __init__(self, start, end):  
        self.current = start  
        self.end = end  
  
    def __iter__(self):  
        return self  
  
    def __next__(self):  
        if self.current < self.end:  
            self.current += 1  
            return self.current  
        else:  
            raise StopIteration  
  
  
gen = My_range(5, 100)  
  
for i in gen:  
    print(i)
```

**Вычисление числа Фиббоначи**:
```python
def fib(num):  
    a = 0  
    b = 1  
    for i in range(num):  
        yield a  
        temp = a  
        a = b  
        b = temp + b  
  
  
for i in fib(100):  
    print(i)
```


---
created: Sunday 2nd July 2023 09:38
Last modified: Sunday 2nd July 2023 09:37
Aliases: kwargs и args в питоне
Tags: programming
---


### Args and kwargs in [[📙Python]]
If we don't need before how arguments will need in our function, we can use to **args**. It's transformed our argument to **tuple of arguments**

```python
def sum_args(*args):
    return sum(args)

print(sum_args(1,2,3,4,5,6))
print(sum_args(1,2,3))
```

**kwargs** grabs any number of keyword arguments  and get a dictionary:

```python
def sum_args(*args, **kwargs):
    total=0
    for items in kwargs.values():
        total+=items
    return sum(args)+ total  

print(sum_args(1,2,3,4,5,6, num1=3333, num2=321))
```


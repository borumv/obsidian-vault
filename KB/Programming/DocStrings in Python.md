---
created: Sunday 2nd July 2023 09:36
Last modified: Sunday 2nd July 2023 09:36
Aliases: docstrings in python
Tags: programming
---


### DocStrings in [[📙Python]]
В *трёх ковычках* мы комментируем то, что наша функция делает, it's named **DocStrings**. It's very useful to documentation our own code. With methoid **__doc__** I can find out, what this operation do.

**'Dart Vaider'** - is a default parametr of this function. It was used when we don't point out parametrs in our function
```python
def sayHello(name = 'Dart Vaider'):
    '''
    This function should print greeting
    '''
    print(f'hello {name}')


sayHello()
sayHello('Boris')
print(sayHello.__doc__)
```
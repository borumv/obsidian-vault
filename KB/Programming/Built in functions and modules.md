---
created: Sunday 2nd July 2023 09:52
Last modified: Sunday 2nd July 2023 09:52
Aliases: 
Tags: programming
---

## Built-in Functions and Modules in [[📙Python]]
*Передача параметров через командную строку:*
```python
import sys  
print(sys)  
name = sys.argv[1]  
last_name = sys.argv[2]  
print(f'helloo! {name} {last_name}')
```

*Угадать рандомное число*
```python
import sys  
from random import randint  
  
start = int(sys.argv[1])  
end = int(sys.argv[2])  
  
random_number = randint(start, end)  
answer = sys.argv[0]  
  
print(random_number)  
  
while True:  
    if answer != random_number:  
        print("не то")  
        answer = int(input("введи число"))  
    else:  
        print("угадал!")  
        break
```

Полезные модули:
`from collections import Counter, defauldict, OrderedDict`
**Counter** - подсчитывает *сколько* элементов в массиве
**DefaultDict** - при вызове несуществующего элемента в словаре, подставляет ему дефолтное значение
```python
simple_dict = defaultdict(lambda : 5, {'a':1, 'b': 3})  
print(simple_dict['h'])
```
**OrderDict** - при сравнении orderdict сравнивается ещё **порядок** элементов
```python
order_dict = OrderedDict()  
  
order_dict['a'] = 1  
order_dict['b'] = 2  
order_dict['c'] = 3  
  
order_dict2 = OrderedDict()  
  
order_dict2['c'] = 3  
order_dict2['a'] = 1  
order_dict2['b'] = 2  
  
  
print(order_dict==order_dict2) //False
```
**array** - тот же лист, только имеет ограниченное количество символов
Со строками модуль **не работает**
![[Pasted image 20221203135152.png]]
```python
import array

example_array = array.array('i', [1, 2, 6, 3, 4]) # превый аргумент указывает на тип элементов. i означает integer
example_array.insert(0, -1)
print('После вставки:', example_array)
example_array.append(-1)
print('После добавления в конец:', example_array)
example_array.extend([5, 6])
print('После объединения со списком:', example_array)
print('Удалён элемент:', example_array.pop(4))
print('После удаления элемента:', example_array)
print('Срез:', example_array[0:4])
# Вывод:
После вставки: array('i', [-1, 1, 2, 6, 3, 4])
После добавления в конец: array('i', [-1, 1, 2, 6, 3, 4, -1])
После объединения со списком: array('i', [-1, 1, 2, 6, 3, 4, -1, 5, 6])
Удалён элемент: 3
После удаления элемента: array('i', [-1, 1, 2, 6, 4, -1, 5, 6])
Срез: array('i', [-1, 1, 2, 6])
```


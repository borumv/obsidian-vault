---
created: Sunday 2nd July 2023 09:27
Last modified: Sunday 2nd July 2023 09:27
Aliases: list в Python
Tags: programming
---

### List in [[📙Python]]
**Methods**
basket = [1,2,35,6,7,8]
#### Adding
- `basket.append(1)` - add to end
- `basket.insert(index, value)` - добавление в лист по индексу элемента
- `basket.extend([5, 10])` - дополняет список элементами из указанного объекта (аналог append, только для нескольких элементов)
#### Removing
- `basket.pop()` - удаляет последний элемент в списке, может принимать индекс, то удаляет элемент по этому индексу. Возвращает элемент, который удалил
- `basket.remove(4)` - удаляет валью с этим значением
- `basket.clear()` - чистит весь лист

- `basket.index(2, start, end)` - какой индекс у значения 2 в массиве? start и end - индексы подмассива, в котором мы ведём поиск
- `2 in basket` - возвращает *bool*  и указывает, есть ли элемент в массиве
- `basket.count(2)` - сколько раз встречается 2 в массиве 
- `basket.sort()` - сортирует исходный массив, есть аналог - `sorted(arr)`, который **возвращает** новый массив
- `basket.copy()` - возвращает новый лист
- `basket.reverse()` - реверсит лист, чтобы создать **копию** листа, можно воспользоваться `basketSecond = basket[::-1]`
- `list(range(1,100)` - создаёт массив и заполняет его цифрами от 1 до 99
- `join` - сцепляет строки. Элемент, у которого вызывают этот метод является разделителем:
	```python
	sentence = ' '
	new_sentence = sentence.join(['hi', 'my', 'name', 'is', 'Boris'])
	print(new_sentence);
	## hi my name is Boris
	new_sentence = ' '.join(['hi', 'my', 'name', 'is', 'Boris'])
	# то же самое
	```
**List unpacking** - это деструктуризация массива
```python
a,b,c,*other, d = [1,2,4,5,6,7,8,9]
print(a) #1
print(b) #2
print(c) #4
print(other) #[5,6,7,8]
print(d) #9
```
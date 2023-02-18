
---
created: Saturday 18th February 2023 09:26
Last modified: Friday 16th December 2022 10:21
Aliases: питон
Tags: python
---

# [[_Python]]


## Data types
### Fundamental Data types
- int
- float
- complex
- bool
- str
- list
- tuple
- set
- dict
+ + None
### Lists

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

### Dictionary

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

### Tuples
*Тип данных как List, только иммутабельный, его, например, можно использовать как ключ у словаря* 
```python
my_touple = (1,2,3,4,5,6)
```
**Методы**
- `my_touple.count(5)` - сколько 5 в тапле
- `my_touple.index(5)` - возврашает индекс элемента

### Set
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

---


## Conditional logic
### Ternary operator
Вот пример:
```python
is_friend = False
print("can message") if is_friend else print("not can message")
##not can message
```


## **FUNCTIONS**
Инициализация:
```python
def say_hello:
	print('hello!')
say_hello()
say_hello()
```

### DocStrings
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

### Args and kwargs
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


## Classes

Пример создания класса:
```python
class PlayerCharacter:  
    def __init__(self, name='anonym', age=9):  
        self.name = name;  
        self.age = age;  
  
    def attack(self):  
        print("attack!")  
        return 'attacked'  
  
  
player1 = PlayerCharacter('Boris', 22)  
player2 = PlayerCharacter('Dima', 43)  
player2.someParametr = '2313123123' // вот это интересно
  
print(player2.age)  
print(player1.name)  
print(player2.attack())
```

**@classmethod** — это обычный метод класса, имеющий доступ ко всем атрибутам класса, через который он был вызван. Следовательно, classmethod — это метод, который привязан к классу, а не к экземпляру класса.

Пример **множественного наследования**:
```python
class User():  
    def sign_in(self):  
        print('sign in')  
  
    def attack(self):  
        print('do nothing')  
  
  
class Wizzard(User):  
    def __init__(self, name, power):  
        self.name = name  
        self.power = power  
  
    def attack(self):  
        print(f'wizzard with name {self.name} was attacked with power of {self.power}')  
  
  
class Archer(User):  
    def __init__(self, name, count_arch):  
  
        self.name = name  
        self.count_arch = count_arch  
  
    def attack(self):  
        print(f'fly {self.count_arch} arches by {self.name}')  
    def run (self):  
        print(f'{self.name} runing really fast')  
  
  
class Hybrid(Wizzard, Archer):  
    def __init__(self, name, power, count_arch):  
        Archer.__init__(self, name, count_arch )  
        Wizzard.__init__(self, name, power )  
  
  
  
hydr = Hybrid('hybi', 55, 53)  
  
hydr.attack();  
hydr.run()
```


(\d*)x(\d*)
## **MAP, FILTER, ZIP, REDUCE (*+аналог с применением lambda*)***:

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
I love (c[ao][tg]s | [lc]ogs)
***Отсортировать массив тьюплов:***
```python
my_list_second = [(0, 2), (4, 3), (9, 9), (-1, 10)]  
my_list_second.sort(key = lambda x: x[1] if x[1] < x[0] else x[0])  
print(my_list_second)

```

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
## Decorators

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
## Errors handle

```python
while (True):  
    try:  
        age = int(input("Please, age - "))  
    except:  
        print("Error")  
    else:  
        break
```
## Generator Functions
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


## Built-in Functions and Modules
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

## **PDB**
Это улчшенный дебагер, позволяющий с помощью консольных команд, понять, что происх
одит в методе во время его выполнения.
```python
import pdb  
  
  
def sum(num1, num2):  
    pdb.set_trace()  
    return num1 + num2  
  
  
sum(4, "432df")
```

## I/O
**Чтение файла**
```python
my_file = open("C:\\Users\\Admin\\Documents\\Власевский\\Учёба\\python_last\\test.txt")  
print(my_file.read())  
my_file.seek(0) ##возвращает курсор на нужное нам место  
print(my_file.read())  
my_file.seek(0) ##возвращает курсор на нужное нам место  
print(my_file.readline()) ##читает строку  
print(my_file.readlines()) ## возвращает массив где каждый элемент - это строка  
  
my_file.close()

##Наиболее распространённый синтаксис  
with open("C:\\Users\\Admin\\Documents\\Власевский\\Учёба\\python_last\\test.txt") as m:  
    print(m.read())  
    m.seek(0) ##возвращает курсор на нужное нам место  
    print(m.read())
```

**Запись**
```python
with open("C:\\Users\\Admin\\Documents\\Власевский\\Учёба\\python_last\\test.txt", mode='a') as m:  
    i = m.write(';)')  
    print(i)
```
*Значения аргумента **mode***
-   `r` - открывает файл только для чтения,
-   `w` - открыт для записи (перед записью файл будет очищен),
-   `x` - эксклюзивное создание, бросается исключение `FileExistsError`, если файл уже существует.
-   `a` - открыт для добавления в конец файла (на некоторых Unix-системах пишет в конец файла вне зависимости от позиции курсора)
-   `+` - символ обновления (чтение + запись).
-   `t` - символ текстового режима.
-   `b` - символ двоичного режима (для операционных систем, которые различают текстовые и двоичные файлы).
 Режим по умолчанию `'r'`, открывает файл только для чтения текста, синоним `'rt'`. Режимы `'r+'` и `'r+b'` открывают файл и устанавливают курсор на начало файла, запись в файл начинается с места остановки курсора при его чтении перед записью. Если файл перед записью не читался то запись осуществляется в начало файла. Режимы `'w'` и `'wb'` создают новый файл или открывают существующий файл только для записи, с последующей его очисткой (стирает все перед записью). У режимов `'w+'` и `'wb+'` поведение такое же как в предыдущем случае, только если не закрывать файл после записи, его еще можно потом прочитать.

Варианты использования режимов:

-   `'r'` - Открывает файл _только для чтения_. Указатель файла помещается в начале файла. Это режим "по умолчанию".
-   `'rb'` - Открывает файл _в бинарном режиме только для чтения_. Указатель файла помещается в начале файла. Это режим "по умолчанию".
-   `'r+'` - Открывает файл для _чтения и записи_. Указатель файла помещается в начало файла.
-   `'rb+'` - Открывает файл _в бинарном режиме для чтения и записи_. Указатель файла помещается в начале файла. Это режим "по умолчанию".
-   `'w'` - Открывает файл только для записи. Перезаписывает файл, если файл существует. Если файл не существует, создает новый файл для записи.
-   `'wb'` - Открывает файл _в бинарном режиме только для записи_. Перезаписывает файл, если файл существует. Если файл не существует, создает новый файл для записи.
-   `'w+'` - Открывает _файл для записи и чтения_. Перезаписывает существующий файл, если файл существует. Если файл не существует, создается новый файл для чтения и записи.
-   `'wb+'` - Открывает файл _в бинарном режиме для записи и чтения_. Перезаписывает существующий файл, если файл существует. Если файл не существует, создается новый файл для чтения и записи.
-   `'a'` - Открывает файл _для добавления_. Указатель файла находится в конце файла, если файл существует. То есть файл находится в режиме добавления. Если файл не существует, он создает новый файл для записи.
-   `'ab'` - Открывает файл _в бинарном режиме для добавления_. Указатель файла находится в конце файла, если файл существует. То есть файл находится в режиме добавления. Если файл не существует, он создает новый файл для записи.
-   `'a+'` - Открывает файл _для добавления и чтения_. Указатель файла находится в конце файла, если файл существует. Файл открывается в режиме добавления. Если файл не существует, он создает новый файл для чтения и записи.
-   `'ab+'` - Открывает файл _в бинарном режиме для добавления и чтения_. Указатель файла находится в конце файла, если файл существует. Файл открывается в режиме добавления. Если файл не существует, он создает новый файл для чтения и записи.
## Regexp in Python

## Testing
*Пример:*
```python
import unittest  
import sum_module  
  
  
class TestSum(unittest.TestCase):  
    def setUp(self):  
        print("let's go!")  
  
    def test_should_return_nine(self):  
        result = sum_module.sum_five(4)  
        self.assertEqual(result, 9)  
  
    def test_should_return_Valueerror(self):  
        result = sum_module.sum_five("dfsifhsdhf")  
        self.assertIsInstance(result, ValueError)  
  
    def test_should_print(self):  
        result = sum_module.sum_five(0)  
        self.assertEqual(result, "please write > 0")  
  
    def tearDown(self):  
        print("clear")  
  
  
if __name__ == '__main__':  
    unittest.main()
    ```
Чтобы запустить **все** тесты из командной строки
**`python3 -m unitest -v`**



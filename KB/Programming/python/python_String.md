
# STRING TYPE
## Formated String

In PY 2 :
```python
name = "boris"
age = 29
print("hello {} age - {}".format(name, age))
```
IN PY добавили способ с выставлением буковки *f*
```python
name = "boris"
age = 50
print(f"hello {name} age - {age}")
```

## String indexes 

[start:stop:stepover]

Способы записи: 
```python
selfish = '01234567'
print(selfish[:1]) ## 0, т.к. не включительно крайний индекс
print(selfish[-1]) ## 7, т.к. при отрицательном индексе 0 начинает отсчёт с конца
print(selfish[::-1]) ## делает ревёрс с шагом в 1

```

## Built In functions in STRING

`str1.find(str2)` - находит подстроку str2 в str1 
`str1.replace('s', 'b')` - заменит все вхождения s на b

```python
name = input('what\'s you name?')
password = input ('what\'s your password?')
password_changed = len(password) * '*'
long = len(password)

print(f'{name}, your password {password_changed} is {long} letters long')

```
---
created: Sunday 2nd July 2023 09:39
Last modified: Sunday 2nd July 2023 09:39
Aliases: классы в python
Tags: programming
---

## Classes in [[📙Python]]

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

**@classmethod** — это обычный метод класса, имеющий доступ ко всем атрибутам класса, через который он был вызван. Следовательно, *classmethod* — это метод, который привязан к классу, а не к экземпляру класса.

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


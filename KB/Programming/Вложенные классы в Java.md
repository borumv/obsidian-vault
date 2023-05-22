---
created: Wednesday 10th May 2023 16:27
Last modified: Wednesday 10th May 2023 16:27
Aliases: inner classes java
Tags: programming
---


Они делятся на 2 вида:

1.  Non-static nested classes — нестатические вложенные классы. По-другому их еще называют inner classes — внутренние классы.
2.  Static nested classes — статические вложенные классы.

В свою очередь, внутренние классы (inner classes) имеют два особых подвида. Помимо того, что внутренний класс может быть просто внутренним классом, он еще бывает:

-   локальным классом (local class)
-   анонимным классом (anonymous class)

Сложновато? :) Ничего страшного, вот тебе схема для наглядности. Возвращайся к ней по ходу лекции, если вдруг почувствуешь, что запутался!

![[Pasted image 20230510162821.png]]

На сегодняшней лекции мы поговорим об *Inner classes* — внутренних классах (они же — non static nested classes, нестатические вложенные классы). 
Они специально выделены на общей схеме, чтобы ты не потерялся :) Начнем с очевидного вопроса: почему эти классы называются «внутренними»? Ответ достаточно прост: потому что они создаются внутри других классов. Вот пример:

```java
public class Bicycle {

   private String model;
   private int weight;

   public Bicycle(String model, int weight) {
       this.model = model;
       this.weight = weight;
   }

   public void start() {
       System.out.println("Поехали!");
   }

   public class HandleBar {
       public void right() {
           System.out.println("Руль вправо!");
       }
       public void left() {
           System.out.println("Руль влево!");
       }
   }
   public class Seat {
       public void up() {
           System.out.println("Сиденье поднято выше!");
       }
       public void down() {
           System.out.println("Сиденье опущено ниже!");
       }
   }
}
```

**Правила:**
1.Объект внутреннего класса *не может существовать без объекта «внешнего» класса*.
Это логично: для того мы и сделали `Seat` и `HandleBar` внутренними классами, чтобы в нашей программе не появлялись то тут, то там бесхозные рули и сиденья.
Этот код не скомпилируется:
```java
public static void main(String[] args) {

   HandleBar handleBar = new HandleBar();
}
```
Из этого вытекает следующая важная особенность:
2. У объекта внутреннего класса *есть доступ к переменным «внешнего» класса*.
Для примера давай добавим в наш класс `Bicycle` переменную `int seatPostDiameter` — диаметр подседельного штыря.
Тогда во внутреннем классе `Seat` мы можем создать метод `getSeatParam()`, который сообщит нам параметр сиденья:
```java
public class Bicycle {

   private String model;
   private int weight;

   private int seatPostDiameter;

   public Bicycle(String model, int weight, int seatPostDiameter) {
       this.model = model;
       this.weight = weight;
       this.seatPostDiameter = seatPostDiameter;

   }

   public void start() {
       System.out.println("Поехали!");
   }

   public class Seat {
       public void up() {
           System.out.println("Сиденье поднято выше!");
       }
       public void down() {
           System.out.println("Сиденье опущено ниже!");
       }
       public void getSeatParam() {
           System.out.println("Параметр сиденья: диаметр подседельного штыря = " + Bicycle.this.seatPostDiameter);
       }
   }
}
```

И теперь мы можем получить эту информацию в нашей программе:

```java
public class Main {

   public static void main(String[] args) {

       Bicycle bicycle = new Bicycle("Peugeot", 120, 40);
       Bicycle.Seat seat = bicycle.new Seat();

       seat.getSeatParam();
   }
}
```

3. Объект внутреннего класса *нельзя создать в статическом методе «внешнего» класса*.
Это объясняется особенностями устройства внутренних классов. У внутреннего класса могут быть конструкторы с параметрами или только конструктор по умолчанию. Но независимо от этого, когда мы создаем объект внутреннего класса, в него незаметно передается ссылка на объект «внешнего» класса. Ведь наличие такого объекта — обязательное условие. Иначе мы не сможем создавать объекты внутреннего класса.

Но если метод внешнего класса статический, значит, объект внешнего класса может вообще не существовать! А значит, логика работы внутреннего класса будет нарушена. В такой ситуации компилятор выбросит ошибку:
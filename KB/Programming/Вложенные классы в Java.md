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

На сегодняшней лекции мы поговорим об Inner classes — внутренних классах (они же — non static nested classes, нестатические вложенные классы). Они специально выделены на общей схеме, чтобы ты не потерялся :) Начнем с очевидного вопроса: почему эти классы называются «внутренними»? Ответ достаточно прост: потому что они создаются внутри других классов. Вот пример:

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


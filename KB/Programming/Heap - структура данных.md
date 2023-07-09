---
created: Sunday 9th July 2023 10:45
Last modified: Sunday 9th July 2023 10:45
Aliases: куча структура данных
Tags: programming
---



**Хип** - это по сути структура данных, которая основана на [[Бинарное Дерево - структура данных|бинарном дереве]]. Основное свойство заключается в том, что <mark style="background: #FFB86CA6;">сыновья каждой вершины должны быть строго больше вершины </mark>
![[Pasted image 20230709105335.png|300]]
Для обеспечения лучшего доступа в случае добавления (*push*) и извлечения (*pop*) мы храним эту структуру данных в **массиве**, где *левый сын вершины* имеете индекс **`parent*2`**, а *правый сын вершины* имеет индекс **`parent*2  + 1`**. 
Поэтому и *ребёнку* очень легко узнать индекс *родителя* путём *целочисленного деления на 2*.


**Реализация**
```java
public class Heap<T extends Comparable<T>> {  
  
    ArrayList<T> heap = new ArrayList<>();  
  
    public Heap() {  
  
        heap.add(null);  
  
    }  
  
    void push(T item) {  
  
        heap.add(item);  
        int index = heap.size() - 1;  
        while (index != 1 && heap.get(index).compareTo(heap.get(index / 2)) < 0) {  
            swap(heap, index, index / 2);  
            index /= 2;  
        }  
    }  
    T pop() {  
        swap(heap, 1, heap.size() - 1);  
        T min = heap.get(heap.size() - 1);  
        heap.remove(min);  
        int size = heap.size();  
        int index = 1;  
        while (index * 2 < size && heap.get(index).compareTo(heap.get(index * 2)) > 0  
                || ( index * 2 + 1 < size && heap.get(index).compareTo(heap.get(index * 2 + 1)) > 0 )) {  
            if (index * 2 + 1 >= size || heap.get(index * 2).compareTo(heap.get(index * 2 + 1)) < 0) {  
                swap(heap, index, index * 2);  
                index *= 2;  
            } else {  
                swap(heap, index, index * 2 + 1);  
                index *= index * 2;  
                index++;  
            }  
        }        return min;  
    }    
}
```


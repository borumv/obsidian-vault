---
created: Saturday 7th October 2023 12:24
Last modified: Saturday 7th October 2023 12:24
Aliases: tree
Tags: programming
---
see: [[Tree Data Structure]]
 **МЕНЕДЖЕР ПАМЯТИ**
- У нас есть заранее **неизвестное** количество структур с двумя ссылками на другие структуры
- Мы знаем заранее, какое **максимальное** количество структур может сущетсвовать одновременно
- Хотим научиться **выделять и освбождать** память

**Что мы сделаем?**
Создадим 3 массива
1) **Ключ** - что будет содержательно хранитсья в элементе
2) **Левый сын** - просто числовой массив (хранит номер **следующей** ячейки памяти), фактически, таким образом, мы организовываем **односвязанный список**
3) **Правый сын** - просто числовой массив

Посмотрим, что произойдёт, когда мы **выделим** какую-то память. По-сути, мы должны сказать в какое место **можно положить** что-то содержательное. Мы, после выделения, должны сделать так, чтобы первый свободный элемент показывал на действительно первый свободный (свободный элемент ищется по **индексу первого свободного элемента**):
![[Pasted image 20220828184508.png]]
![[Pasted image 20220828185104.png]]
А теперь **освободим** элемент  с индексом **0**. В таком случае, мы в левого сына  индекса закидываем индекс **первого свободного** до освобождения. А потом, первым свободным становится элемент с индексом **0**
![[Pasted image 20220828185235.png]]

```java
  
public class Memory {  
  
    int[][] memory;  
    int indexFreeElement;  
  
    public Memory(int sizeMemory) {  
        setMemory(new int[sizeMemory][3]);  
        for (int i = 0; i < sizeMemory; i++) {  
            this.memory[i][0] = 0;  
            this.memory[i][1] = i + 1;  
            this.memory[i][2] = 0;  
        }  
    }  
  
    public int newNode(){  
        setIndexFreeElement(this.memory[indexFreeElement][1]);  
        return this.indexFreeElement;  
    }  
    public void delNode(int index){  
        this.memory[index][1] = getIndexFreeElement();  
        setIndexFreeElement(index);  
    }  
  
  
    public int[][] getMemory() {  
        return memory;  
    }  
  
    public int getIndexFreeElement() {  
        return indexFreeElement;  
    }  
  
    public void setMemory(int[][] memory) {  
        this.memory = memory;  
    }  
  
    public void setIndexFreeElement(int indexFreeElement) {  
        this.indexFreeElement = indexFreeElement;  
    }  
}
```


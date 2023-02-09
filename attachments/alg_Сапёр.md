---
tags: algorithms, решение_задачи
---


>[!INFO]
>**Condition**
>Вам необходимо построить поле для игры "Сапер" по его конфигурации - размерам и координатам расставленных на нем мин
>_Правила сапёра:_
>- Поле состоит из клеток с минами и пустых клеток
>- Клетки с миной обозначаются символом *
>- Пустые клетки содержат число $0<=kij<=8$ - количество мин на соседних клетакахъ. Соседними клетками являются восемь клеток, имеющих смежный угол или сторону


**Solution**
Всё решение сводится к [массиву сдвига](массив%20сдвига). Которые мы используем для определения состояния соседних клеточек 
Зная координаты _i_ и _j_  мы будем прибавлять очередного соседа
**d**_i_ =[1,1,1, 0,0,-1,-1,-1]
**d**_j_ =[-1,0,1,-1,1-1,0,1]

![[Pasted image 20220812101848.png]]
Выходы за предело поля решается созданием **поля с рамкой** 
![[Pasted image 20220812102908.png]]

```java
public class Saper {  
    public static void main(String[] args) {  
        int[][] mines = new int[][]{{2,2},{4,4},{7,3}, {8,6}};  
        createMins(8,8, mines);  
    }  
  
    public static void createMins(int i, int j, int mines[][]){  
        int[]di = new int[]{1,1,1, 0,0,-1,-1,-1};  
        int[]dj = new int[]{-1,0,1,-1,1,-1,0,1};  
        int[][] pole = new int[i + 2][j + 2];  
        for (int k = 0; k <pole.length; k++) {  
            for (int l = 0; l < pole[k].length; l++) {  
                pole[k][l] = 0;  
            }  
        }  
    for(int[] mines1:mines){  
            pole[mines1[0]][mines1[1]] = -1;  
            for (int k = 0; k < 8; k++) {  
                pole[mines1[0] + di[k]][mines1[1] + dj[k]] +=1;  
            }  
        }  
        for (int k = 1; k < i + 1; k++) {  
            System.out.print("|");  
            for (int l = 1; l < j + 1; l++) {  
                if(pole[k][l] == -1){  
                    System.out.print("*");  
                    System.out.print("|");  
                }else {  
                    System.out.print(pole[k][l]);  
                    System.out.print("|");  
                }  
            }  
            System.out.println();  
        }  
    }  
}
```
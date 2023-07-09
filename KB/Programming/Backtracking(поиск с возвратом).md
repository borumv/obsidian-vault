
---
created: Monday 23rd January 2023 18:45
Last modified: Monday 23rd January 2023 18:45
Aliases: поиск с возвратом, бэктрэкинг, backtracking
Tags: python
---

# [[Backtracking(поиск с возвратом)]]

📌Бэктрэкинг используется для решения задач, где необходимо перебрать все возможные случаи или комбинации чего-либо. Суть заключается в увеличении частичного случая, если это возможно.

Типичными задачами бэктрэкинга является задача о ферзе, коне.

**Задача о ферзе**
```java
public static void main(String[] args) {  
  
    for (int i = 1; i < 12; i++) {  
        int[] col = new int[i];  
        int[] diag = new int[i * 2 - 1];  
        int[] diag2 = new int[i * 2 - 1];  
        System.out.println(i + " -> " + queens(0, col, diag, diag2));  
    }  
}  
public static int queens(int row, int[] col, int[] diag, int[] diag2) {  
  
    int n = col.length;  
    if (row == n) {  
        return 1;  
    }  
    int count = 0;  
    for (int column = 0; column < n; column++) {  
        if(col[column] == 0 && diag[row + column] == 0 && diag2[(column - row) + ( n - 1)] == 0){  
            col[column] = diag[row + column] = diag2[(column - row) + ( n - 1)] = 1;  
            count += queens(row + 1, col, diag, diag2);  
            col[column] = diag[row + column] = diag2[(column - row) + ( n - 1)] = 0;  
        }  
    }    return count;  
}
```






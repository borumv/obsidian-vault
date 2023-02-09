---
tags: [algo, sums]
---

Суть заключается в поэтапном сравнивании двух соседних элементов массива, если один больше другого -> мы меняем их местами и так до тех пор, пока не отсортируем весь массив (в примере для этого есть флажок *isSorted*)
Названа так сортировка, потому что при каждой итерации наибольшие элементы *всплывают* в правой части массива, а наименьшие *тонут* в левой части массива

```java
public class BubleSort {  
    public static void main(String[] args) {  
        int[] array = new int[]{5, 213, 54, 67, 8, 1, 3, 6, 990, 3, 1, 434, 4};  
        printArray(array);  
        bubleSorting(array);  
        printArray(array);  
  
    }  
    private static void bubleSorting(int[] arr) {  
        boolean isSorted = false;  
        while (!isSorted) {  
            isSorted = true;  
            for (int i = 1; i < arr.length; i++) {  
                if (arr[i - 1] > arr[i]) {  
                    int var = arr[i];  
                    arr[i] = arr[i - 1];  
                    arr[i - 1] = var;  
                    isSorted = false;}}}}  
    private static void printArray(int[] arr) {  
        System.out.print("[");  
        for (int i = 0; i <= arr.length - 1; i++) {  
            if (i > 0)  
                System.out.print(", ");  
            System.out.print(arr[i]);  
        }        System.out.print("]");  
        System.out.println();  
    }}
```

see: [Algo](📙MOC-ALGORITHMS.md)
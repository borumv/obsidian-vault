---
tags: [sums]
---

**Суть** 

Мы определяем *pivot*  и делим наш массив пополам, слева - меньшие значения, справа - большие. Pivot при это уже остаётся на нужно для нас месте.

![[Pasted image 20230910133723.png]]

1) Определяем pivot, s1 - Область меньше array[pivot] (0, pivot) и s2 - область больше array[pivot] (pivot + 1, array.size)

see: [Algo](📙MOC-ALGORITHMS.md)
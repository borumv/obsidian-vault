---
created: Friday 6th January 2023 18:38
Last modified: Friday 6th January 2023 18:37
Aliases: хэширование строк
Tags: string  algorithms
---

# [[String hashing]]

Parent: [[📙MOC-ALGORITHMS]]
1) **Полиномиальный хэш**
	 Складываем все элементы строки и умножаем на p в степени инкремент и берём это по какому-то модулю
		 ![[Pasted image 20230106184109.png|400]]
		 
	Данный хэш может применяться для хэширования чисел, где **p = 10**
	![[Pasted image 20230106184351.png|400 ]]
2) Вариант похожий, но проще
	![[Pasted image 20230106190100.png|400]]	

>1) Есть строка **S** и мы хотим **вычислить хэш** от **i** до **j**
>2) У нас есть n строк, найти количство строк, которые не повторяются

> [!success] Solution
> Lorem ipsum dolor sit amet

see also:[]

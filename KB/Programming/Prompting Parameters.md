---
created: Thursday 18th July 2024 18:02
Last modified: Thursday 18th July 2024 17:58
Aliases: lmm
Tags: programming
---

# [[Prompting Parameters]]

📌**Temperature** - меньшая температура делает output более сфокусированным и детерминированным
![[Pasted image 20240718181315.png|150]]
📌**Top P** - определяет скоуп рандомизации для языковой модели, т.е. насколько много *случайных* токенов. Более низкое значение Top P приводит к меньшему набору токенов, создавая более сфокусированный и узкий текст

![[Pasted image 20240718181248.png|130]]
📌**Stop Sequences** - Ограничение связанное с тем, насколько мы хотим, чтобы наши токены не повторялись. Если это значение положительное, то мы штрафуем модель за повторение. Отрицательный штраф побуждает модель повторять токены

![[Pasted image 20240718181820.png|150]]
**Presence penalty**- 
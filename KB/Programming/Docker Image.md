---
created: Tuesday 31st January 2023 13:30
Last modified: Tuesday 31st January 2023 13:30
Aliases: образ докера
Tags: docker
---

# [[Docker Image]]

📌**Docker image** - это некий образ приложения. Является основой для [[Docker container]] (c одного образа можно создать много контейнеров). Является статичным элементом, по сути своей - это набор файлов. 
![[Pasted image 20221230203119.png|300]]
Легко сопоставить аналогию, где образ - это диск с установкой, а контейнер - уже установленный экземпляр.
Инструкция по тому, как собирать образы находится в [[Docker file|файле докера]]

Базовый образ — это то, что является исходным слоем (или слоями) создаваемого образа. Базовый образ ещё называют родительским образом.


parent: [[📙MOC-Docker]]

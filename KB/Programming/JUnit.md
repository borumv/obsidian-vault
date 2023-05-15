---
created: Tuesday 4th April 2023 19:34
Last modified: Tuesday 4th April 2023 19:34
Aliases: junit
Tags: java
---

# [[JUnit]]

📌Самый популярный фреймворк в [[📙MOC-JAVA|java]], который предназначен для написания в основном [[Unit testing|unit]] и [[Integration testing|integration]] тестов.

Фреймворк разбит на несколько основных под-проектов:
- **[[JUnit Platform]]**
- **[[Junit jupiter]]**
- **[[JUnit Vintage]]**


Жизненный цикл:
1. Вызывается **@BeforeAll** перед всеми нашими тестами
Далее, происходит вызов всех наших циклов по циклу(порядок *не гарантирован*):  
2. **@BeforeEach** секция
3. **@Test** вызов самого теста

![[Pasted image 20230405163054.png]]
![[Pasted image 20230405163354.png]]
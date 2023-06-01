---
created: Thursday 1st June 2023 09:34
Last modified: Thursday 1st June 2023 09:34
Aliases: security
Tags: programming
---


**Авторизация** - проверка и определение *полномочий*  в соответствии пройденной аутентификации


![[Pasted image 20230601093828.png|400]]

Модель (где мы храним нашего пользователя, который прошёл [[Аутентификация|аутентификацию]]):
- **SecurityContext** - самый главный объект, который является обёрткой **Authentication**
- **Authentication** - объект, который хранит в себе 3 значения:
*Principle* - наш *dto* юзера, который реализует интерфейс **`UserDetails`** и хранит всю информацию о нашем пользователи. Мы сами решаем, что туда поместить, потому что это обычное dto
*Credentials* - это наш пароль, который обычно чистится после успешной [[Аутентификация|аутентификации]]
*Authorities* - роли пользователя, которые реализуют интерфейс **`GrantedAuthorities`**

Чтобы получить доступ к **`SecurityContext`** используется утилитный класс **`SecurityContextHolder`** 

**Логика** **`AuthenticationFilter`** :
```java
Authentication authRequest = buildAutentication(); // тот самый объект, который хранит Principle, Credentials и Authorites
AuthenticationManager authManager = getManager();
authManager.authenticate(authRequest); // Проходит циклом по всем AuthenticationProvider и по очереди пытается провести аутентификацию
```
 
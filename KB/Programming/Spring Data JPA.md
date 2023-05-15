---
created: Monday 15th May 2023 12:39
Last modified: Monday 15th May 2023 12:39
Aliases: spring data jpa
Tags: programming
---

Какие проблемы решает Spring Data JPA, которые нам приходилось делать ручками в [[📙Hibernate]] ?
1. *DAO* -> *Repository*. В hibernate нам приходилось писать DAO слой (для взаимодействия с базами данных) самому. SDJPA предоставляет нам интерфейс **`Repository`** из коробки, реализуя который мы обеспечивая доступ к базе данных. 
2. *@Transactional* -> *TransactionManager*. Более удобная обработка [[Транзакции+в+PSQL|транзакций]]
3. *Configuration* -> *AutoConfiguration*. Мы избавляем себя от различных xml-конфигураций в пользу properties или yaml.
4. 
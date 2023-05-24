---
created: Monday 15th May 2023 10:39
Last modified: Monday 15th May 2023 10:39
Aliases: модель extension
Tags: programming
---

 Механизм, благодаря которому мы можем внедритясь в жизненный цикл наших тестов. У этого механизма есть 5 ключевых мест, где мы можем его использовать:
 1. *Exception handling*. Дополнительно обработать исключения, которые у нас выбросились в тестовых методах
 2. *Test instance post-processing*. 'Доделать' наш тестовый инстанс.
 3. *Conditional test execution*. Добавление каких-то условий (стоит вызвать наш тест или скипнуть его?)
 4. *Parameter resolution*. Механизм [[Dependency Injection]]
 5. *Test life cycle callbacks*. Механизм настрйоки внедрения callbacks в [[Жизненный цикл Junit теста]]

Пример SpringExtention:
```java
public class SpringExtension implements BeforeAllCallback, AfterAllCallback, TestInstancePostProcessor,  
      BeforeEachCallback, AfterEachCallback, BeforeTestExecutionCallback, AfterTestExecutionCallback,  
      ParameterResolver {
      ...
      }
```

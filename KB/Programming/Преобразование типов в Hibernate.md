---
created: Thursday 12th October 2023 09:38
Last modified: Wednesday 11th October 2023 16:43
Aliases: types convertions in hibernate
Tags: programming
---

# [[Преобразование типов в Hibernate]]

📌Процесс преобразования типов - логика предоставленная [[📙Hibernate]], с помощью которой мы преобразуем тип значения в нашей программе в *тип нашей базы данных*.

Список всех типов, которые *поддерживает Hibernate* находится в классе `Configuration` в поле `basicTypes`
```
private List<BasicType> basicTypes = new ArrayList<BasicType>();
```

Самый главный тип для всех типов в Hibernate - это интерфейс `Type` от него, как раз наследуется класс `BasicType` 
 


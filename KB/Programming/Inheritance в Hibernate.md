---
created: Monday 20th March 2023 13:14
Last modified: Monday 20th March 2023 13:14
Aliases: inheritance
Tags: programming
---

# [[Inheritance в Hibernate]]

📌**Inheritance (наследование) в [[📙Hibernate]]** - 

Hibernate поддерживает три типа наследования: Single Table Inheritance, Joined Table Inheritance и Table Per Class Inheritance.

1.*Single Table Inheritance*- это тип наследования, при котором все классы, участвующие в иерархии, сохраняются в одной таблице. Каждый класс имеет уникальный идентификатор, который позволяет Hibernate определить, к какому классу относится каждая запись в таблице. Этот тип наследования удобен для иерархий с небольшим количеством классов, которые имеют много общих свойств.
    
2.*Joined Table Inheritance* - это тип наследования, при котором каждый подкласс имеет отдельную таблицу, но свойства, наследуемые от родительского класса, хранятся в отдельной таблице, которая связана с таблицами подклассов. Этот тип наследования удобен для иерархий, в которых каждый подкласс имеет свои уникальные свойства.
    
3.*Table Per Class Inheritance* - это тип наследования, при котором каждый класс в иерархии имеет свою собственную таблицу. Этот тип наследования удобен для иерархий, в которых каждый подкласс имеет много уникальных свойств.

![[Pasted image 20230320203552.png]]
    
Hibernate предоставляет аннотации для настройки наследования, такие как *@Inheritance*, *@DiscriminatorColumn* и *@DiscriminatorValue*, которые позволяют указать тип наследования, столбец дискриминатора и его значения.

Преимущества использования наследования в Hibernate включают:

-   Уменьшение объема кода за счет использования наследования, что улучшает читаемость и поддерживаемость кода.
-   Возможность создания иерархий классов с различными уровнями наследования, что позволяет легко расширять и изменять поведение объектов.
-   Повышение производительности за счет использования оптимизированных запросов для доступа к данным в зависимости от типа объекта.


Выбор стратегии зависит от конкретных требований и ограничений проекта. Если вы выбираете стратегию Table per subclass, вы должны убедиться, что таблицы имеют одинаковые ключи и схему, чтобы использовать оператор JOIN при запросах.

При использовании наследования в Hibernate необходимо учитывать некоторые особенности, например:

- Hibernate поддерживает только один уровень наследования, т.е. класс может быть наследником только одного класса.
- Если вы используете стратегию Table per subclass, то таблицы классов-наследников будут иметь пустые поля для тех полей, которые не используются в этих классах.
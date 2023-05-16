
---
created: Monday 27th March 2023 14:21
Last modified: Monday 27th March 2023 14:21
Aliases: отношение oneToMany и manyToOne в Hibernate
Tags: programming
---

Отношение *OneToMany* и *ManyToOne* в [[📙Hibernate]] - это [[Маппинг ассоциаций в Hibernate|связь]] между двумя сущностями в объектно-ориентированной модели данных и их представлением в реляционной базе данных.

## Описание
Отношение *OneToMany* означает, что у *одной сущности может быть много связанных с ней сущностей другого типа*. Например, у сущности "Заказ" может быть много связанных с ней сущностей "Товар". В Hibernate, чтобы установить отношение OneToMany, в классе сущности "Заказ" нужно использовать аннотацию @OneToMany над свойством, которое будет представлять собой коллекцию связанных сущностей. Например:
```java
@Entity
public class Order {
   @OneToMany(mappedBy = "order")
   private List<Item> items;
   ...
```

В свою очередь, чтобы указать связь обратного ManyToOne от сущности "Товар" к сущности "Заказ", нужно использовать аннотацию *@ManyToOne*, указав имя поля в классе "Товар", которое будет хранить ссылку на объект "Заказ". Например:

```java
@Entity
public class Item {
   @ManyToOne
   @JoinColumn(name = "order_id")
   private Order order;
   ...
}
```


## Дополнительные параметры
**`@ManyTomOne(optinal = false)`** - делает **INNER JOIN** вместо LEFT/RIGHT

---
created: Wednesday 22nd March 2023 16:01
Last modified: Wednesday 22nd March 2023 16:01
Aliases: many to many
Tags: programming
---


📌 **`@ManyToMany`** - это аннотация, используемая в языке программирования [[📙MOC-JAVA|java]] для указания отношения "многие ко многим" между двумя сущностями в объектно-реляционном отображении ([[ORM]]) при использовании фреймворка [[JPA]] (Java Persistence API).

Для того, чтобы использовать аннотацию **`@ManyToMany`**, нам необходимо указать две важные вещи:

1. **Имя таблицы связи** (join table), которая будет создана для связи двух таблиц.
2. **Имена колонок ([[@JoinColumn]])**, которые будут использоваться для связи таблиц.


```java
@Entity
public class User {
    @Id
    private Long id;

    @ManyToMany
    @JoinTable(
            name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;
}
@Entity
public class Role {
    @Id
    private Long id;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users;
}

```
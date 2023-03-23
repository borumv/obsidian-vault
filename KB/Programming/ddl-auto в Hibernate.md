---
created: Thursday 23rd March 2023 08:51
Last modified: Thursday 23rd March 2023 08:50
Aliases: ddl в Hibernate
Tags: programming
---

# [[ddl-auto в Hibernate]]

📌 **`ddl-auto`** - это свойство [[📙Hibernate]], указывающее на то, как hibernate будет управлять генерацией схемы базы данных и её обновлением.

- `create` - Hibernate создает схему базы данных при запуске приложения и *перезаписывает ее при каждом запуске*. Это может быть полезно во время разработки приложения, когда схема базы данных меняется часто.
- `update` - Hibernate проверяет существующую схему базы данных и *выполняет изменения схемы, чтобы она соответствовала текущей модели данных*. Это позволяет обновлять схему базы данных, не теряя данные.
- `validate` - Hibernate проверяет существующую схему базы данных на соответствие текущей модели данных, но *не выполняет изменения*. Это полезно, если вы хотите проверить, что схема базы данных соответствует вашей модели данных.
- `create-drop` - Hibernate создает схему базы данных при запуске приложения, а затем *удаляет ее при завершении работы приложения*. Это может быть полезно во время разработки и тестирования, когда вы не хотите сохранять данные между запусками приложения.


>Cвойство устанавливается в *конфигурационном файле* (`hibernate.cfg.xml` или `application.properties`) или *програмно* с помощью инстанса класса `Configuration`
>XML:
>```xml
><property name="hibernate.hbm2ddl.auto">update</property>
>```
>application.properties:
>```yaml
 spring.jpa.hibernate.ddl-auto=update
 >```
 >Java:
>```java
>Configuration configuration = new Configuration();
>configuration.setProperty("hibernate.hbm2ddl.auto", "update");
>```





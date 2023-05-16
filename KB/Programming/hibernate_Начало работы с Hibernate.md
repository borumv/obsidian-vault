---
tags: [java, hibernate]
---

**Начало работы с Hibernate**

-   Подключаем зависимости
    
    ```xml
    <depenndency>
    	<groupId> org.hibernate</groupId>
    	<artifactId>hibernate-core</artifactId>
    	<version>5.2.0.Final</version>
    </dependency>
    ```
    
-   В "классическом" Hibernate создаётся конфиг. файл с базовыми настройками hibernate.cfg.xml:
    

```xml
<!DOCTYPE hibernate-configuration PUBLIC
        "-//Hibernate/Hibernate Configuration DTD 3.0//EN"
        "http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd">

<hibernate-configuration>
    <session-factory>
        <property name="connection.driver_class">org.postgresql.Driver</property>
        <property name="connection.url">jdbc:postgresql://localhost:5432/postgres</property>
        <property name="connection.username">postgres</property>
        <property name="connection.password">admin</property>
	    <property name="connection.pool_size">1</property>
        <property name="dialect">org.hibernate.dialect.PostgreSQL94Dialect</property>
        <property name="show_sql">true</property>
        <property name="current_session_context_class">thread</property>

        <!--<property name="hibernate.hbm2ddl.auto">none</property>-->
    </session-factory>
</hibernate-configuration>
```

- В _чистом_ Hibernate-приложении мы создаём **[[SessionFactory]]**:

```java
SessionFactory factory = new Configuration()  
	 .configure("hibernate.cfg.xml")  
	 .addAnnotatedClass(Customer.class)  
	 .addAnnotatedClass(OrderDetails.class)  
	 .addAnnotatedClass(Product.class)  
	 .buildSessionFactory();
```
должен существовать всего лишь один объект типа SessionFactory (как и с ConnectionPool)

- И уже с ней выполняем различные операции c [[Session class Hibernate|Session]]
```java
try{  
 session = factory.getCurrentSession();  
	 session.beginTransaction();  
	 Customer customer = session.get(Customer.class, 1);  
	 System.out.println(customer.getName());  
 session.getTransaction().commit();  
}finally {  
 factory.close();  
 session.close();  
}
```


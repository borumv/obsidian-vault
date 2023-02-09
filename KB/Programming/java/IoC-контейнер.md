**IoC** - базовый принцип, на котором строится Спринг
*«Голливудский принцип» (Hollywood Principle): «Не звоните мне, я сам Вам позвоню.»*

**Конфигурация**
```java
@Configuration
class AppConfig {
@Bean
IPersonDAO personDAO(@Value("${db.url}") String dbUrl) { 
	return new PersonDAO(dbUrl); }
@Bean 
PersonService personService(IPersonDAO dao) {
	return new PersonService(dao);
} 
}
```
Аналог xml конфигурации:
```xml
<bean id="personDAO" class="edu.spring.PersonDAO">
	<constructor-arg name="dbUrl" value="${db.url}" />
</bean>
<bean id="personService" class="edu.spring.PersonService">
	<constructor-arg name="dao" ref="personDAO"/>
</bean
```

Различные подходы разработки зависимостей:
![[Pasted image 20220716191735.png]]

see: [[IoC-контейнер в Spring]]
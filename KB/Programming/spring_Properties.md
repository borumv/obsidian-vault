---
created: Monday 27th February 2023 13:14
Last modified: Sunday 19th February 2023 13:17
Aliases: properties в спринге
Tags: spring, java
---

>• 📌Нужны для конфигурации приложения 
 • 📌Хранятся в ресурсах (как src/main/resources/, так и src/test/resources/) 
 • 📌Иногда фильтруются мейвеном 
 • 📌Пишутся ли в UTF-8 ? (нет) 
 • 📌Но всё равно все пишут их в UTF-8

В [Spring-e](Spring) для подключения property-файла можно использовать аннотацию [@PropertySource](spring_@PropertySource.md).

Чтобы пользоваться пропертями можно воспользоваться [SpEl](Spring%20Expression%20Language.md)

• С помощью плейсходера `${guru.dburl}` можно получать свойство из загруженного файла. 
• Но для этого придётся настроить **PropertyPlaceholderConfigurer** (в Spring Boot он уже есть). 
	
• Одного такого бина достаточно на приложение + не смотрите примеры, где в нём прописываются файлы

По итогу, проперти используются с помощью аннотации [@Value](spring_@Value.md)

\\\\\  
```java
@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig{
	@Value("${guru.user}")
	String user;
	
	@Value("${guru.password}")
	String password
	
	@Value("${guru.dburl}")
	String url;
	
	public FakeDataSource fakeDataSource(){
		FakeDataSource fakeDataSource = new FakeDataSource();
		fakeDataSource.setUser(user);
		fakeDataSource.setPassword(password)
	}
	
	public static PropertySourcePlaceholderConfigurer properties(){
		PropertySourcePlaceholderConfigurer propertySourcePlaceholderConfigurer = new PropertySourcePlaceholderConfigurer();
		return propertySourcePlaceholderConfigurer;
	}
}
```
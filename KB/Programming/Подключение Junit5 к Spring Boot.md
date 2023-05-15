---
created: Monday 10th April 2023 12:31
Last modified: Monday 10th April 2023 12:30
Aliases: как подключить junit к spring boot
Tags: programming
---

Чтобы подключить к [[📙JUnit|junit]] версиии 5 в [[spring_Boot|spring boot]] необходимо сделать следующие шаги:
1. Подключить модуль API `unit-jupiter-api` (интерфейсы и аннотации для написания тестов)
```xml
<dependency>  
    <groupId>org.junit.jupiter</groupId>  
    <artifactId>junit-jupiter-api</artifactId>  
    <scope>test</scope>  
</dependency>
```
2. Подключить движок `unit-jupiter-engine` (чтобы запускать тесты) 
```xml
<dependency>  
    <groupId>org.junit.jupiter</groupId>  
    <artifactId>junit-jupiter-engine</artifactId>  
    <version>5.9.2</version>  
    <scope>test</scope>  
</dependency>
```
3. Чтобы работать вместе с [[📙Maven|maven]] нужно подключить *surfire* плагин:
```xml
<build>  
    <plugins>        
	    <plugin>            
		    <groupId>org.apache.maven.plugins</groupId>  
            <artifactId>maven-surefire-plugin</artifactId>  
            <version>2.22.2</version>  
            <dependencies> 
                <dependency>                   
	                <groupId>org.junit.platform</groupId>  
                    <artifactId>junit-platform-commons</artifactId>  
                    <scope>test</scope>  
                </dependency>           
             </dependencies>       
         </plugin >
     </plugins>
</build>
```
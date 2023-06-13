---
created: Sunday 4th June 2023 10:52
Last modified: Sunday 4th June 2023 10:51
Aliases: axon
Tags: programming
---


Фрэймворк для [[Event Driven]] микросервисов и использующий [[CQRS]] дизайн паттерн.
![[Pasted image 20230612103507.png|300]]

![[Pasted image 20230604115456.png|300]]

### Запуск
**docker-команда:** **`docker run --name axonserver -p 8024:8024 -p 8124:8124 -v "C:\Users\Admin\Documents\Study\Java\instagram\axon-server-docker\data":/data -v "C:\Users\Admin\Documents\Study\Java\instagram\axon-server-docker\eventdata":/eventdata -v "C:\Users\Admin\Documents\Study\Java\instagram\axon-server-docker\config":/config axoniq/axonserver`**


## Работа

Флоу в *axon-framework* строится в таком порядке (на примере **POST** запроса)
1. **Создание модели**. Сначала мы создаём модель, которая является сущностью, которую мы передаём в RequestBody
```java
@Data  
public class CreateProfileRestModel {  
    private Long userId;  
    private String nickName;  
    private String firstName;  
    private String lastName;  
    private String avatarUrl;  
    private String aboutDescription;  
    private LocalDate dateOfRegistry;  
}
```
2. **Создание команды**. Команда *инициирует изменение состояния агрегата*. Для индентификации команды в *агрегационной модели* мы используем аннотацию **`@TargetAggregateIdentifier`**
```java
@Builder  
@Data  
public class CreateProfileCommand {  
    @TargetAggregateIdentifier  
    private Long userId;  
    private String nickName;  
    private String firstName;  
    private String lastName;  
    private String avatarUrl;  
    private String aboutDescription;  
    private LocalDate dateOfRegistry;  
}
```
3. **Создание агрегата.**. В этом слое происходит:
- Бизнес логика. Например валидация.
- Текущее состояние сущности
- Command Handlers
- Event Sourcing Handler Method
![[Pasted image 20230613144754.png|200]]
После обработки команды, мы преобразуем её в **event**.
```java
  
@Aggregate  
public class ProfileAggregate {  
    public ProfileAggregate() {  
    }  
    @CommandHandler  
    public ProfileAggregate(CreateProfileCommand createProfileCommand) {  
        // Validate CreateProfile Command  
        if (createProfileCommand.getUserId() == null) {  
            throw new IllegalArgumentException("User ID cannot be null");  
        }  
        ProfileCreateEvent profileCreateEvent = new ProfileCreateEvent();  
        BeanUtils.copyProperties(createProfileCommand, profileCreateEvent);  
        AggregateLifecycle.apply(profileCreateEvent);  
    }  
}
```
4. **Создание Event**. После того как происходит **`apply`**. Наш event переходит в **`EventSourcingHandler`**.  События сообщают информацию *об изменении агрегата* всем заинтересованным *подписчикам*.
```java
@EventSourcingHandler  
public void on(ProfileCreateEvent profileCreateEvent){  
    this.userId = profileCreateEvent.getUserId();  
    this.aboutDescription = profileCreateEvent.getAboutDescription();  
    this.avatarUrl = profileCreateEvent.getAvatarUrl();  
    this.dateOfRegistry = profileCreateEvent.getDateOfRegistry();  
    this.firstName = profileCreateEvent.getFirstName();  
    this.lastName = profileCreateEvent.getLastName();  
    this.nickName = profileCreateEvent.getNickName();  
}
```










![[Pasted image 20230613140830.png|300]]

![[Pasted image 20230613141412.png|300]]


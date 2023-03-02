
---
created: Tuesday 14th February 2023 10:13
Last modified: Tuesday 14th February 2023 10:12
Aliases: жизненный цикл бина
Tags: spring, java
---

# [[spring_Bean Life Cycle|Bean Life Cycle]]

📌

>1. **Инстанцирование объекта**. Техническое начало жизни бина, работа конструктора его класса
>2. **Установка свойств**. Происходит [[spring_Dependency Injection|внедрение зависимостей]]
>3. **Нотификация [[spring_Aware interfacies]]**. 
> 	1. BeanNameAware (Если бин реализует метод `setBeanName()` из интерфейса NameBeanAware, то ID бина передается в метод)
> 	2. BeanFactoryAware (Если бин реализует BeanFactoryAware, то Spring устанавливает ссылку на bean factory через `setBeanFactory()` из этого интерфейса)
> 	3. ApplicationContextAware (Если бин реализует интерфейс ApplicationContextAware, то Spring устанавливает ссылку на ApplicationContext через `setApplicationContext()`)
>4. **Пре-инициализация** - метода `postProcessBeforeInitialization()` интерфейса **`BeanPostProcessor`**  
>5. **Инициализация** 
>**•** Метод бина с аннотацией `@PostConstruct` из стандарта JSR-250 (рекомендуемый способ);  
 **•** Метод `afterPropertiesSet()` бина под интерфейсом `InitializingBean`;  
 **•** Init-метод. Для отдельного бина его имя устанавливается в параметре определения `initMethod`. В xml-конфигурации можно установить для всех бинов сразу, с помощью `default-init-method`;
>6. **Пост-инициализация** - `postProcessAfterInitialization()` интерфейса `BeanPostProcessor`   
>7. После того как контекст будет закрыт(метод `close()` из ApplicationContext), бин уничтожается.
>8. Если в бине есть метод, аннотированный `@PreDestroy`, то перед уничтожением вызовется этот метод. Если бин имплементирует DisposibleBean, то Spring вызовет метод `destroy()`, чтобы очистить ресурсы или убить процессы в приложении. Если в аннотации `@Bean` определен метод `destroyMethod`, то вызовется и он.


![[Pasted image 20230214101417.png|500]]
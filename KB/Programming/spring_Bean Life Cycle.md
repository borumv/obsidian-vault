
---
created: Tuesday 14th February 2023 10:13
Last modified: Tuesday 14th February 2023 10:12
Aliases: жизненный цикл бина
Tags: spring, java
---

# [[spring_Bean Life Cycle|Bean Life Cycle]]

📌 Весь жизненный цикл проходит внутри [[spring_IoC-контейнер|IoC-контейнера]]
1. Мы прогоняем наши [[spring_Bean Definitions|bean definitions]] через **BeanFactoryPostProcessors**. На этом уровне, например, работатет [[Spring Expression Language]], который парсит наши пропертиес и подстоявляет необходимые бин-дифинишны. Это происходит банально, через [[java_Reflection|рефлексию]], метод `isAssignable()`. Если у нас **несколько** бинов, в реализующих интрфейс **`BeanFactoryPostProcessors`**, то для определённого порядка вызова, можно реализовать интерфейс **`Order`** (где возвращаямая цифра - это **приоритет**) или аннотацию **`@Order`**
2. Проходит **сортировка** [[spring_Bean Definitions|bean definitions]]. Исходя из параметров [[spring_Bean Definitions|метаданных]] (***Bean Definition***). Т.е. строится своего рода граф зависимостей, и инициализируются сначала *простые* бин-дифинишны, а потом *сложные* (с большим количество зависимостей)
***Далее начинается этап инициализации**. В нём мы берём каждый [[spring_Bean Definitions|bean definition]] в **цикле** и проходим следующие этапы:*
3. Работа **конструктора** класса. После конструктора, уже смогут работать **setter-ы**. В конце этого этапа уже у нас есть [[spring_Beans|бин]], а не [[spring_Bean Definitions|bean definition]]
4. **Нотификация [[spring_Aware interfacies]]**. 
	- **BeanNameAware** (Если бин реализует метод `setBeanName()` из интерфейса NameBeanAware, то ID бина передается в метод)
	- **BeanFactoryAware** (Если бин реализует BeanFactoryAware, то Spring устанавливает ссылку на bean factory через `setBeanFactory()` из этого интерфейса)
	- **ApplicationContextAware** (Если бин реализует интерфейс ApplicationContextAware, то Spring устанавливает ссылку на ApplicationContext через `setApplicationContext()`)
5. **Пре-инициализация** - метода `postProcessBeforeInitialization()` интерфейса **`BeanPostProcessor`**  
6. **Initialization callbacks**. После того, как мы вызвали **setter-ы** у нас, благодаря инит-коллбэкам, есть возможность ещё что-то **подкрутить**. Для этого у нас есть 3 варианта:
	**•** **Использование аннотации `@PostConstruct`** из стандарта JSR-250 (рекомендуемый способ);  
	**•** **Реализация интерфейса `InitializingBean`**, который реализует метод `afterPropertiesSet()`.
	**•** **init-method** (через xml)
7. **Пост-инициализация** - `postProcessAfterInitialization()` интерфейса `BeanPostProcessor`
8. **Работа с бином**. Если это **Singletone**, то мы оставляем его в нашем [[spring_IoC-контейнер|IoC-контейнере]], если **Prototype**, то сразу выкидываем его тому, кто попросил.
9. **Destruction callbacks**. Будут вызывать, когда мы закрываем наш [[spring_Context|контекст]]. Есть несколько способов:
	- **Использование аннотации @PreDestroy**
	- **Реализация интерфейса `DisposableBean`** 
	- **destroy-method** (через xml)

![[Pasted image 20230302194936.png]] 



![[Pasted image 20230214101417.png|500]]
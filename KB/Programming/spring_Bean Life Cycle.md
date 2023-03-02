
---
created: Tuesday 14th February 2023 10:13
Last modified: Tuesday 14th February 2023 10:12
Aliases: жизненный цикл бина
Tags: spring, java
---

# [[spring_Bean Life Cycle|Bean Life Cycle]]

📌

![[Pasted image 20230214101417.png|500]]

1. **Инстанцирование объекта**. Техническое начало жизни бина, работа конструктора его класса
2. **Установка свойств**. Происходит [[spring_Dependency Injection|внедрение зависимостей]]
3. **Нотификация [[spring_Aware interfacies]]**. https://itsobes.ru/JavaSobes/kogda-ispolzuiut-aware-interfeisy-v-spring
> 1. BeanNameAware
> 2. BeanFactoryAware
> 3. ApplicationContextAware
4. **Пре-инициализация** - метода `postProcessBeforeInitialization()` интерфейса **`BeanPostProcessor`**  
5. **Инициализация** 
>**•** Метод бина с аннотацией `@PostConstruct` из стандарта JSR-250 (рекомендуемый способ);  
 **•** Метод `afterPropertiesSet()` бина под интерфейсом `InitializingBean`;  
 **•** Init-метод. Для отдельного бина его имя устанавливается в параметре определения `initMethod`. В xml-конфигурации можно установить для всех бинов сразу, с помощью `default-init-method`;
6. **Пост-инициализация** - `postProcessAfterInitialization()` интерфейса `BeanPostProcessor` 
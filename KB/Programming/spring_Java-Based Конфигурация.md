
---
created: Sunday 19th February 2023 12:54
Last modified: Sunday 19th February 2023 12:54
Aliases: java based конфигурация
Tags: spring, java
---

# [[spring_Java-Based Конфигурация]]

📌Один из типов [[spring_Configuration]]. Является трендом индустрии.

• Все бины располагаются в классах помеченных аннотацией [@Configuration](spring_@Configuration.md)
• Таких классов может бытьмного – обычно на каждый слой/технологию 
• Бины создаются в нестатических методах, помеченных аннотацией [@Bean ](spring_@Bean.md)
• Зависимости бинов – параметры методов


see also: [Import](spring_@Import.md), [ComponentScan](spring_@ComponentScan.md)
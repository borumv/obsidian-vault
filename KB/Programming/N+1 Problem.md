---
created: Thursday 18th May 2023 09:22
Last modified: Thursday 18th May 2023 09:22
Aliases: hibernate n+1 problem
Tags: programming
---

Проблема, с который мы сталкиваемся, когда пытаемся вытащить несколько сущностей сразу же, а не по одному id.

1. По умолчанию в fetchType всегда ставить **LAZY**
Если мы уставливаем **EAGER**, то при формирвоании запроса мы можем получить [[декартово произведение множеств]], где каждый параметр будет повторяться для соотношения с другим параметром запроса.
Т.е. когда мы делаем запрос **`SELECT U from User u`**, у User  у которого есть компании, которые в **EAGER**, то будет формироваться дополнительный запрос для *каждого user-a*

### @Fetch
FetchMode:
*SELECT* - делаем отдельный запрос для получения нашей сущностиъ
*JOIN* - делаем JOIN
Select и Join мы можем использовать только над маппингом [[@OneToMany и @ManyToOne]], потому что если мы используем это с коллекциями, до у нас получается [[декартово произведение множеств]]
*SUBSELECT* - доступен *только* для коллекций и делает *подзапрос*.

### ENTITY GRAPH
**@NamedEntityGraph** 
```java
@NameEntityGraph(name= "WithCompanyAndChat",
										attributesNodes = {
											@NamedAttributeNode("company"),
											@NamedAttributeNode("chat")
										})
```
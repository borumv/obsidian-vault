---
created: Wednesday 8th November 2023 12:39
Last modified: Wednesday 8th November 2023 12:39
Aliases: interview preparing (java core)
Tags: programming
---

### What are the differences between interfaces and classes?

Здесь нужно сделать упор на **состояние**. Благодаря [[Наследование|наследованию]] мы можем хранить состояние наших потомков, интерфейс сделать этого не может и это ключевое различие.

| Interface                                                               | Abstract class                                                   |
| ----------------------------------------------------------------------- | ---------------------------------------------------------------- |
| Supports multiple implementations                                       | Doesn’t support multiple inheritance                             |
| Doesn’t contain Data Member                                             | Contains Data Member                                             |
| Doesn’t contain Constructors                                            | Contains Constructors                                            |
| Contains only incomplete member (signature of member)                   | Contains both incomplete (abstract) and complete member          |
| Can’t have access modifiers; by default everything is assumed as public | Can contain access modifiers for the subs, functions, properties |
| Its member can’t be Static                                              | Only Complete Member of abstract class can be Static             |

В интерфейсе все поля `static final`

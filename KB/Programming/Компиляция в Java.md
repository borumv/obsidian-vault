---
created: Tuesday 16th May 2023 09:27
Last modified: Tuesday 16th May 2023 09:27
Aliases: компиляция
Tags: programming
---

После того, как мы преобразовали код нашего приложения на [[📙MOC-JAVA|java]]  в [[Байт код в Java|байт-код]] у нас есть разные способы преобразования его в машинный код:
1. Непосредственно выполнить. Это ещё называют *интерпретацией*. В [[JVM]] есть интерпретатор языка Java
2. Перед выполнение кода *скомпилировать* его в нативный и отправить CPU выполнять этот код *прямо перед выполнением*. Этот процесс называется [[JIT-компилятор|jit-компиляцией]]
3. Перед запуском программы, мы всё компилируем и прогоняем через CPU c *начала до конца*. Этот процесс называется [[AOT компиляция|AOT компиляцией]]
see:[[Что такое компиляция]]
https://habr.com/ru/companies/piter/articles/466529/
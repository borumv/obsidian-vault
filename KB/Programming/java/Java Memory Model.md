---
created: Tuesday 17th January 2023 21:03
Last modified: Tuesday 17th January 2023 21:03
Aliases: модель памяти в Java
Tags: java
---

![[Pasted image 20230429140153.png]]


1. **[[Heap java|Heap (куча)]]**
2. [[Metaspace (метаданные)|Metaspace(Method area)]] 

Для каждого отдельного потока:
1. [[Stack в Java memory|Stack(стек)]]
2. [[Java program counter register]]


Сегменты памяти, которые заняты [[JIT-компилятор|JIT-компиляцией]]
1. [[CodeCache (кэш кода)]]
2. [[Арены JIT компилятора]] (нет у Graal )

Помимо хипа и класслоудинга память тратиться на [[JIT-компилятор|JIT-компиляцию]]
![[KB/Programming/java/Untitled Diagram.svg]]

Symbols
- SymbolTable
- String Table


Java Memory model можно разделить на несколько частей по разным классификациям.
По области памяти:
1. В памяти JVM находятся [[Heap java|куча]], [[Stack в Java memory|стэк]], [[Java program counter register]]
2. В нативной памяти, которая выделена на компьютере находятся [[Metaspace (метаданные)]], [[CodeCache (кэш кода)]], [[Арены JIT компилятора]]
По хранению:
1. В стэке, если обобщить хранятся ссылки на объекты из кучи и статические переменные и методы из metaspace. Также хранятся ссылки на исполняемые инструкции и codecashe
2. В куче хранятся объекты со всеми его полями. Даже если поле статическое, то оно всё равно хранится в объекте.
3. В metaspace хранятся метаинформация класса, статические методы и переменные
4. В Code Cache хранится скомпилированный код наших инструкций

Но, если в куче хр
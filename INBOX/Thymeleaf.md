---
tags: [sql]
---
 
 Движок HTML шаблонов


in [Java](📙MOC-JAVA.md):
```java
public String getSyntaxExamplePage(Model model){
	moddeladdAttribute("defaultName", "Boris Jonson")
}
```

in HTML:
```html
th:value = "${defaultName}"
```

-   Простые выражения:  
    -   **Переменная**: ${...}
    -   **Выбранная переменная**: *{...}
    -   **Сообщение**: #{...}
    -   **Ссылка URL**: @{...}
    -   **Фрагмент**: ~{...}
-   Литералы/Literals:  
    -   **Текст**: 'one text', 'Another one!',...
    -   **Число**: 0, 34, 3.0, 12.3,...
    -   **Boolean**: true, false
    -   **Null**: null
    -   **Токены**: one, sometext, main,...
-   Текст:  
    -   **Соединение строк**: +
    -   **Подстроки**: |The name is ${name}|
-   Арифметика:  
    -   **Binary**: +, -, *, /, %
    -   **Минус (unary operator)**: -
-   Boolean:  
    -   **Binary**: and, or
    -   **Boolean отрицание (unary operator)**: !, not
-   Сравнение и равенство:  
    -   **Сравнение**: >, <, >=, <= (gt, lt, ge, le)
    -   **Равенство**: ==, != (eq, ne)
-   Условные:  
    -   **If-then**: (if)? (then)
    -   **If-then-else**: (if)? (then): (else)
    -   **Default**: (value) ?: (defaultvalue)
-   Специальные токены:  
    -   **No-Operation**: _
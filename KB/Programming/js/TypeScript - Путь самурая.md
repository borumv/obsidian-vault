Если нам надо отталкиваться от какой-то реализации и сделать её типом, то можно использовать конструкцию **typeof**:
```typescript
  let initialState = {
    name: "Boris",
    lastName: "Vlasevsky",
    age: 29

  }

  type initialStateType = typeof initialState;

  let smthState:initialStateType = {
    name: "sdsd",
    lastName: "sdsd",
    age: 34
  }
```

Стоит отметить, что **typeOf** в TypeScript **другой** нежели чем в js, он возвращает значение элемента (вариации значений). Разница в typeOf происходит из-за того что, в TS он работает на уровне компиляции

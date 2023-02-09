**Union**
--
```ts
function logId(id: string | number){
    console.log(id)
    if(typeof id === 'string'){
        console.log(id.toLowerCase) // ts сам понимает, что когда мы в rt сделали проверку, то это стринг
    }else{
        console.log(id) //ts сам поймёт, что тут number
    }
}

function logError (error: string | string []){
    if(Array.isArray(error)){
        console.log(error) // тут он понял, что это массив
    }else{
        console.log(error) // тут он понял, что это string
    }
}

function logObj(obj: {a: number} | {b: number}){
    if('a' in obj){ //даже когда проверяем ключ, ts всё равно всё понимает
        console.log(obj.a)
    }else{
       console.log(obj.b)
    }
}
```

**Литеральные типы**
```ts
function fetchWithAuth(url: string, method: 'get' | 'post'): 1 | -1{
    return -1;
}
fetchWithAuth('sdff','get')
let method = 'post'
fetchWithAuth('dsf', method as 'post'); // as - это каст, его нужно исопльзовать аккуаратно
```

**Type Aliases**
Позволяет нам определить конкретный тип нашей функции или нашего объекта
```ts
type User = {
    name: string,
    age: number,
    skills: string[]
}

let user: User = {
   name:'John',
    age: 23,
    skills: ['2','3','4']
}
type Role = {
    id:number
}
let userwithrole: User & Role = {
	name:'John',
    age: 23,
    skills: ['2','3','4'],
    id:2
}
```

**Interfaces**
Интерфейсы мы используем когда мы работаем с объектами. Это происходит зачастую, т.к. интерфейсы более удобные. 

**Optional**
`?` после атрбиута означает его опциональность, т.е. он может быть, а может и не быть.
```ts
interface User {
    login: string,
    password?: string
}

const user:User = {
    login: 'a.sdds',
}
```

Два `?` проверяет является ли значению null или undefind, если да, то мы производим вызов функции/или что угодно
```ts
function withOrNotParam(param: string){
    const t = param?? 5;
}
```

**Void**

**Unknow**

**Never**
Тип обозначает, что функция никогда ничего не вернёт.
Помогает нам ограничить какие-либо прохождения. Например, когда мы проходим ветку по типам и нам необходимо предостеречь себя и какую-то ветку заблокировать.
**_1 кейс (бросаем ошибку):_**
```ts
function generateError(message: string): never{
    throw new Error(message);
}
```
**_2 кейс(бесконечные циклы/рекурсия):_**
```ts
function dumpError(): never{
    while(true){}
}
```

Важно понимать, что задача в том числе типа never - это уменьшение ошибок в компайл-тайм (а не рантайм). 
```ts
type paymentAction = 'refund' | 'checkout' | 'reject'
function processAction (action: paymentAction){
    switch(action){
        case 'refund':
            //...
            break;
        case 'checkout':
            //..
            break;
        default:
            const a: never = action // не сработает, потому сужение типо показывает, что есть ещё 'reject'
            throw new Error ('No action')
    }
}
```

**TypeGuard**

Важное отличие возвращаемого значения _boolean_ от _typeGuard_ то, что, boolean **не сужает результат.**
```ts

function logId(id: string | number) {
  if(isString(id)) {
    console.log(id);
  }else{
    console.log(id.toString());
  }
}
function isString(x: string | number): x is string {
  return typeof x === 'string';
}
```
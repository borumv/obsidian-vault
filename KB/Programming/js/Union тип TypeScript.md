**Union**
В параметрах функции мы можем указывать различные типы, которые мы можем передать. При этом,  [[TypeScript]] при компиляции может предсказывать, какой мы тип имеем ввиду (когда используем _typeof_ и иные проверяющие методы - это называется **narrowing** или **сужение**)


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
function logObjcts(a: number | boolean, b: number | string){
    if(a == b){
        console.log(a) // ts сам поймёт, что Это number
    }
}
```
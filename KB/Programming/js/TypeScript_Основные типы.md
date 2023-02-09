`tsc` - команда для работы в командной строке

**Основные типы**
```ts
let b:number = 342
let str: string = "Hello World";
let isTrue: boolean = true;
```
**Типизация функций**
```typescript
	function getFullName(firstName: string, lastName:string): string {
    return `${firstName}   ${lastName}`;
}
const getFullName2 = (firstName: string, lastName:string): string => {
    return `${firstName}   ${lastName}`;

}
```

**Объекты**
```ts
const getFullName2 = (userEntity:{firstName:string, lastName:string}): string => {
    return `${userEntity.firstName}   ${userEntity.lastName}`;
}
const user = {
    firstName: 'John',
    lastName: 'Doe',    
    city: 'New York',
    age: 30,
    skills:{
        dev:true,
        design:true,
        marketing:true

    }

}
```

**Массивы**
```ts
const skills: string[] = ['Dev', 'DevOps', 'Testing']

for(const skill of skills){
    console.log(skill);
}
const result = skills

                    .filter(item => item != 'Dev')
                    .map(item => item + '!')
                    .reduce((a,b) => a + b) 
console.log(result);
```

**Tuples(кортежи)**

```ts
const skills: string[] = ['Dev', 'DevOps', 'Testing']
const skills2:[number, string] = [1, 'Dev'];
const arr:[number,string,...boolean[]] = [1, 'Dev', true, false];
```

**ReadOnly**
```ts
const skills2: readonly [number, string] = [1, 'Dev'];
```
_Чтобы сделать неизменяемым кортеж или массивы_

**Enums**

```ts
enum STATUSCODE {
    SUCCESS,
    FAILURE,
    ERROR
}

const response = {
    message: 'Всё прошло успешно',
    status: STATUSCODE.SUCCESS
}

if (response.status === STATUSCODE.SUCCESS) {
    console.log(response.message);
}
```


**Преобразование JSON  в тс**
```json
/* Запрос */
{
	"topicId": 5,
	"status": "published" // "draft", "deleted"
}
/* Ответ */
[
	{
		"question": "Как осуществляется доставка?",
		"answer": "быстро!",
		"tags": [
			"popular",
			"new"
		],
		"likes": 3,
		"status": "published"
	}
]
```
```ts
enum STATUS{
    PUBLISHED = 'published',
    DRAFT = 'draft',
    DELETED = 'deleted'
}

let answer : {
    question: string,
    answer: string,
    tags: string[],
    likes: number,
    status: STATUS
}

async function getFaqs(req: {topicId: number, status: STATUS}) : Promise<{
    question: string,
    answer: string,
    tags: string[],
    likes: number,
    status?: STATUS
}[]>{

    const res = await fetch('/faqs', {
       method: 'POST',
       body: JSON.stringify(req)
    });
    const data = await res.json();
    return data;
}
```
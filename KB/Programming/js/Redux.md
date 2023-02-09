---
tags: javascript
---

![[Pasted image 20220901160800.png]]
**Store** - это то место, которое держит в себе состояние всего нашего приложения (он является реализацией паттерна [[pattern_Observer]])
В **store** мы реализуем возможность вызова 3 функций:
**dispatch** - в неё мы передаём экшн  - это наша связь с reducer-ом -> идёт вызов **reducer-a** который возвращает **новый state** после этого мы обходим весь список наших **сабскрайб-коллбэков** и **вызываем их**
**subscribe** - мы подписываем вызов **callback функции** при вызове **dispatch**
```js
export const createMyStore = (myReducer, initialState)=>{

    let state = myReducer(initialState, {type: 'INIT'})
    let subscribers = []
    return{
        dispatch(action){
            state = myReducer(state, action)
            subscribers.forEach(sub => sub())
        },
        subscribe(callback){
            subscribers.push(callback)
        },
        getState(){
            return state;
        }
    }
}
```


**Reducer** - это просто функция, которая меняет объект стэйта


Информация из **React PIZZA** 
**useSelector** - хук, которые отвечает за вытаскивание данных (что-то типа **useContext**)
**useDispatch** - специальный хук, который выполняет экшены
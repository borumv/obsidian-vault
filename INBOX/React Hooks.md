Зачем хуки?
```js
function App{
	return(
		<div>
	
		</div>
	)
	
}

export default App
```

Сами по себе хуки - это обычные функции
**UseState**
Функция UseState возвращает *кортеж* - массив с заранее определёнными элементами  

```js
	const counterState = useState(0)
	console.log (counterState[0]) // непосредственно сам стейт
	console.log (counterState[1]) // функция позволяющая изменить стейт
```
[state, setState] = useState(0) - деструктуризация массива

useState действует *асинхронно*:
```js
	function increment(){
		setCounter (counter + 1)
		setCounter (counter + 1)
	}
```

В этом пример counter увеличиться всего лишь на один раз, т.к.для того чтобы его увеличить ещё раз нужен **ререндер компонента.**

Хорошей практикой в таком случае изменять состояние используя callBack, т.е. основываться на предудыдущем значении состояния:
```js
	setCounter((prev) => prev + 1)
	setCounter((prev) => prev + 1)
```

Чтобы не было бесполезных вызовов инициализируещего состояния, лучше всего передавать callback:
```js
function initalCounter(){
	return Math.trunc(Math.random() * 20)
}

const [counter, setCounter] = useState(() => {
return initialCounter ()
})
```

Для того чтобы работать с состоянием объектов,  хорошей практикой считается обновлять состояния, используя спрэд оператор:
```js
[state, setState] = useState({
	title: 'smthTitle'
	date: Date.now()
})


function newState(){
	setState( prev =>{
		...prev,
		title: 'Новое название'		
	})
}
```


**UseEffect**

```js
	useEffect(()=>{
		console.log(1))
	}) //будет вызываться каждый раз, когда происходит рендер компонента
```


**useRef**
По своей сути также создаёт состояние, как и useState
Особенностью является то, что вместо значения мы создаём объект, у которого присутствует свойство current,  к которому мы обращаемся, если хотим получить значение 

Главное: те состояния, которые мы сохраняем через хук useRef, сохраняются между рендером компонента и не вызывает ререндер, если мы что-то меняем => если мы хотим что-то сохранить но при этом не перерисовуывать, мы используем  useRef, в остальных случаях мы используем useState
```js
function App(){
	const [value, setValue] = useState ('initial')
	const renderCount = useRef(1) // внутрь мы передаём начальное состояние
	
	useEffect(()=>{
		renderCount.current++
	})
	
	return (
		<div>
			<h1> Количество рендеров: {renderCount.current} </h1>
			<input type = "text" onChange={e => setValue(e.target.value)} value = {value}> 
		<div>
	)
}

export default App
```

через useRef мы также можем **получать ссылки на DOM-элементы**

```js
	const inputRef = useRef (null)

		
	useEffect(()=>{
		console.log(inputRef.current.value)
	})
	
	
	return (
		<div>
			<input ref={inputRef} type = "text" onChange={e => setValue(e.target.value)} value = {value}> 
		<div>
	)
```
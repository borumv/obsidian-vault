- Создание объекта в единственном экземпляре
- Глобальный доступ (обычно через статически метод или переменную), замена глобальным переменным
- Можно управлять количеством экземпляров объекта, которые можно создать
- Едина точка доступа
- Опасность чрезмерного исопльзования

```java
	public class TestSingleton {

    private static TestSingleton instance;

	    public static synchronized TestSingleton getInstance() { // synchronized 
                                                                 //чтобы несколько потоков получали наверняка один инстанс
        if (instance==null) {
            instance = new TestSingleton();
        }
        return instance;
    }
    
    private TestSingleton() { // обязательно private, чтобы нельзя было создать 
                              //несколько  
                              //объектов
    }

    public void print(){
        System.out.println(this);
    }
    
    public void stop(){
        System.out.println("stop");
    }

}

```

see: [[pattern_Паттерны проектирования]]
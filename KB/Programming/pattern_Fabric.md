- Известен интерфейс, но зараенее неизвестно какая из реализаций будет использоваться
- Получение ссылки на объект в зависимости от входящих условий


```java
	// фабрика по созданию автомобилей
public class CarSelector {
    
    // фабричный метод, который создает нужный автомобиль
    public Car getCar(RoadType roadType) {
        Car car = null;
        switch (roadType) {
            case CITY:
                car = new Porsche();
                break;
            case OFF_ROAD:
                car = new Geep();
                break;
            case GAZON:
                car = new NewGeep();
                break;
        }

        return car;
    }
}

```
---
created: Wednesday 5th April 2023 09:27
Last modified: Wednesday 5th April 2023 09:26
Aliases: мокито
Tags: java
---

### Типы тестовых дублёров (Test Doubles)
- **Dummy** - объекты, которые не используются во время тестирования. Нужны только для заполнения параметров методов.  
- **Fake** - объекты с работающим функционалом, но не подходящим для production. Например, запуск in-memory базы данных для тестирования DAO слоя
- **Stub** - объекты, которые используют mocks и spiece для ответа (Answer) на вызовы методов во время тестов
- **Mock** - запрограммированные объекты, возвращающие ожидаемый результат (**stubs**) на вызов определённых методов

```java
@Mock  
RecipeRepository recipeRepository;  
RecipeServiceImpl recipeService;

@BeforeEach  
void setUp() {  
    Recipe recipe = new Recipe();  
    Set<Recipe> recipes = new HashSet<>();  
    recipes.add(recipe);  
    recipeRepository = Mockito.mock(RecipeRepository.class);  
    Mockito.when(recipeRepository.findAll()).thenReturn(recipes);  
    //Mockito.doReturn(recipes).when(recipeRepository).findAll();  
    recipeService = new RecipeServiceImpl(recipeRepository);  
}  
  
@Test  
void getAllRecepie() {  
    assertEquals(1, recipeService.getAllRecepie().size());  
}
```

- **Spy** - proxy для реальных объектов, которые ведут себя точно также, но могут быть запрограммированы как mocks

  
### Как работать с мокито в [[spring_MVC| Spring MVC]]?

Для работы существует специальный класс **`MockMVC`**, который принимает в себя контроллер через метод `standaloneSetup()`,.
Через метод perform мы передаём тип запроса (get, post, update), а после, обычной цепочкой (методы `andExpect()` и `endReturn`) мы реализуем нашу логику теста.
```java
when(ownerService.findAll()).thenReturn(ownerSet);  
mockMvc.perform(MockMvcRequestBuilders.get("/owners/"))  
        .andExpect(status().isOk())  
        .andExpect(view().name("owners/index"))  
        .andExpect(model().attribute("owners", ownerSet));
```
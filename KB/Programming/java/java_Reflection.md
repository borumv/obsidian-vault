---
created: Tuesday 24th January 2023 10:49
Last modified: Tuesday 24th January 2023 10:48
Aliases: рефлексия
Tags: java
---

# [[java_Reflection|Reflection]]

📌**Рефлексия** - это механизм иследования данных о программе во время её выполнения

Каждому типу [[📙MOC-JAVA|java]] - простым типам, классам, интерфейсам и массивам - соотвестует собственный объект класса Class
Существует также специальный объект Class, представляющий служебное слово *void*
Объекты Class могут использоваться для получения информации о типах и - если тип относится к ссылочным - для создания нвоых объектов этого типа.
Class строится автоматически загружчиеком классов

Существует четыре способа получения объекта Class:
1. Применение метода **getClass**;
```java
ReflectionTest reflectionTest = new ReflectionTest();  
System.out.println(reflectionTest.getClass());
```
2. Использование литерала типа Class (имени класса, сопровождаемого суффиксом .class, – например, String.class);
```java
System.out.println(ReflectionTest.class);
```
3. Применение статического метода Class – forName с указанием полного имени класса, включающего название пакета, которому он принадлежит; Если значение параметра loader равно null, используется системный загрузчик классов. 
	Класс инициализируется только при условии, что значение параметра initialize равно true и ранее инициализация класса не выполнялась. Если класс с заданным именем не может быть найден, выбрасывается объявляемое исключение типа ClassNotFoundException
```java
System.out.println(Class.forName("java.lang.String"));
System.out.println(Class.forName("[I")); //массив интов
```
4. Получение данных с помощью методов рефлексии, которые возвращают объекты Class для вложенных классов и интерфейсов
```java
System.out.println(Integer.class.getSuperclass()); //класс от которого наследуется
System.out.println(Integer.class.getEnclosingClass()); //вложенный класс

```

>**Методы класса Class
>- **public boolean islnterface()** – возвращает true, если объект Class представляет интерфейс. 
>- **public boolean isArray()** – возвращает true, если объект Class представляет массив. 
>- **public boolean isPrimitive()** – возвращает true, если объект Class представляет один из простых типов или служебное слово void 
>- **public Class[] getlnterfaces()** – возвращает массив объектов Class, элементы которого соответствуют интерфейсам, реализуемым текущим типом. Если интерфейсов, базовых по отношению к типу, не существует – из-за того, например, что тип не реализует интерфейсы непосредственно или является простым, – возвращается массив нулевой длины. 
>- **public Class getSuperclass()** – возвращает объект Class, который соответствует классу, базовому по отношению к текущему типу. Метод возвращает null, если текущий объект Class представляет класс Object, интерфейс, простой тип или служебное слово void (все они не обладают базовыми классами)
>- **public int getModifiers()** – возвращает модификаторы, используемые в объявлении типа, в виде кодированного целочисленного значения. Значение должно декодироваться с помощью констант и методов класса Modifier. 
>- **public Class getComponentType()** – возвращает объект класса Class, который представляет компонентный тип массива, описываемого текущим объектом Class. Если текущий объект Class не соответствует массиву, возвращается null. Пусть, например, задан массив значений int; Тогда метод getClass возвратит объект Class, для которого метод-запрос isArray вернет значение true, а метод getComponentType – объект int.class
>- public Constructor[] getConstructors(), • public Field[] getFields(), • public Method[] getMethods(), • public Class[] getClasses() – с помощью данных методов можно получить сведения о public – членах, которые либо объявлены в текущем классе (или интерфейсе), либо унаследованы
>- public Constructor[ ] getDeclaredConstructors(), • public Field[ ] getDeclaredFields(), • public Method[ ] getDeclaredMethods(), • public Class[ ] getDeclaredClasses() – с помощью данных методов можно получить данные о членах (не обязательно обозначенных как public) определенной категории, которые объявлены в текущем классе (или интерфейсе), но не унаследованы.
>- public Field getField(String name), • public Field getDeclaredField(String name) – помощью данных методов можно получить сведения о конкретном члене класса.
>- public Method getMethod(String name, Class[] parameterTypes),  public Method getDeclaredMethod(String name, Class[] parameterTypes) – с помощью данных методов можно получить информацию о конкретных методах класса, в массиве parameterTypes передаются типы параметров метода.

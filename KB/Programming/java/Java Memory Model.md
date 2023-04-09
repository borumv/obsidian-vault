---
created: Tuesday 17th January 2023 21:03
Last modified: Tuesday 17th January 2023 21:03
Aliases: модель памяти в Java
Tags: java
---

# [[Java Memory Model]]
![[Pasted image 20230225202547.png]]

До [[📙MOC-JAVA|java]] 6 была следующая стрктура:
Stack - 8 примитивных типов, ссылки на объекты и некоторые методы(которые возвращали примитивные типы)
[[java_Heap|Куча]] - все объекты
Perm Generation (*static context*) - [[java_String pool|String pool]]


В java 7 [[java_String pool| пул стрингов]] вынесли в [[java_Heap|хип]], потому что в нём мы можем регулировать память.
Благодаря этому мы теперь можем изменять параметр **String Table Size (XX:StringTableSize)** 

С Java 8 убрали Perm Generation и появилось понятия [[java_MetaSpace|мета-спэйса]], который дал возможность динамически расширяться (до размера нативной памяти)

>**MaxMetaspaceSize** - максимальный размер памяти (*default - 60013*)

- Помимо этого в хипе есть **пул констант**, который, в отличии от ситуации со [[java_String|стрингом]], позволяет целочисленные классы обёртки ([[java_Integer|Integer]], [[java_Byte|Byte]], [[java_Short|Short]] и [[java_Character||Character]]) сравнивать в диапазоне одного байта (*от -128 до 127*):
```java
	Integer a = 1;
	Integer b = 1;
	Integer c = 128;
	Integer d = 128;

	a==b //true
	c==d //false
```

- Чтобы поместить значени в пул стрингов, есть метод `intern()`

```java
System.out.println(a==b); //false
System.out.println(c==b);  //false
System.out.println(c==d);//false
  
System.out.println("AFTER INTERN");  
System.out.println(a==b);  
System.out.println(c.intern()==b);  
System.out.println(c.intern()==d.intern());
```

декомпиляция файла:
> javac StringBuilderTest.java - компиляция в байткод
> javap -c StringBuilderTest.class - декомпиляция кода

```java
public class IDTV.javaprofessional.unit5.StringBuilderTest {
  public IDTV.javaprofessional.unit5.StringBuilderTest(); //создаётся конструктор
    Code:
       0: aload_0 //позволяет загрузить ссылку в Stack из локальной переменной
       1: invokespecial #1 // вызывает метод экземпляра объекта и помещает его в Stack
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: ldc           #7                  // добавляем в Stack String 1
       2: astore_1          //храним значения ldc  в локальной переменной
       3: ldc           #9                  // добавляем в Stack String 2
       5: astore_2  //храним значения ldc  в локальной переменной
       6: aload_1
       7: aload_2
       8: invokedynamic #11,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      13: astore_3
      14: new           #15                 // создаём новый объект class java/lang/StringBuilder
      17: dup //дублируется значение на верх стека
      18: invokespecial #17                 // Method java/lang/StringBuilder."<init>":()V
      21: ldc           #7                  // String 1
      23: invokevirtual #18                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      26: ldc           #9                  // String 2
      28: invokevirtual #18                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      31: invokevirtual #22                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      34: astore        4
      36: return
}


```
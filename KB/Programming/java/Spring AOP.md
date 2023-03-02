[[spring_Configuration]] применяет собственную реализацию [АОП](Аспектно-ориентированное%20программирование.md) — Spring AOP, которая использует стиль описания AspectJ, но не реализует все ее возможности. Для внедрения кода Spring AOP применяет проксирование бинов, находящихся в [[IoC]] Это избавляет как от использования специальных загрузчиков классов ([[java_ClassLoader|classloaders]]), так и от посткомпиляции или работы со специальным компилятором, что в целом соответствует «легковесной» направленности Spring.


```java

	@Aspect // говорит о том, что бин является аспектом
	@Component
	public class AppLogginAspect{

		@Before("execution (public void com.geekbrains.aop.UserDAO.addUser())")//этот кусок кода должен работать перед чем-либо
		public void appSimpleMethod (){
			System.out.println("АОП кусок кода");
			
		}
		@Before("execution (public void com.geekbrains.aop.UserDAO.*User())") //выполнится в любом методе, который заканчивается на User()
		....

		@AfterReturning( pointcut = "execution(public * com.geekbrains.aop.UserDAO.getAllUsers (...))",
						returning = "result")
		public void afterGet(JoinPoint joinPoint, List<String> result){
		
			result.set(0, "Donald Duck")
		}

	}
```

Фреймворк создает прокси-классы для тех бинов, на которые ссылаются определенные конфигурацией Pointcut’ы. Ограничение такого подхода — невозможность создать аспект для другого аспекта.
![[Pasted image 20220617124911.png]]

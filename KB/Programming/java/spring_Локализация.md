• Internationalization (i18n) и Localization (l10n) 
• Имеется встроенная поддержка в Java 
• Поддерживается прекрасно в Spring на уровне [[spring_Context|контекста]]
Для того чтобы локализовывать приложения, нужны бандлы (bundle) - это набор файлов в имени которого в суфиксе указывается текущая локаль
![[Pasted image 20220718184431.png]]
Для того чтобы прочитать эти бандлы, необходим объявить вот такой бин:
![[Pasted image 20220718184710.png]]


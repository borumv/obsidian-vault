---
created: Sunday 8th October 2023 15:25
Last modified: Sunday 8th October 2023 15:24
Aliases: null
Tags: programming
---

# [[Java volatile]]

В целях повышения эффективности работы, спецификации языка [[📙MOC-JAVA|java]] позволяет JRE сохранять локальную копию переменной в каждом потоке, который ссылается на нее. Можно считать эти «внутрипоточные» копии переменных похожими на кэш, помогающий избежать проверки главной памяти каждый раз, когда требуется доступ к значению переменной.  
  
Но представьте, что произойдёт в следующем случае: запустятся два потока, и первый прочитает переменную А как 5, тогда как второй – как 10. Если переменная А изменились от 5 до 10, то первый поток не будет знать об изменении, так что будет иметь неправильное значение А. Однако если переменная А будет помечена как volatile, то то в любое время, когда поток обращается к её значению, он будет получать копию А и считывать её текущее значение.  
  
Если переменные в вашем приложении не меняются, то внутрипоточный кэш имеет смысл. В противном случае, очень полезно знать, что может сделать для вас ключевое слово volatile.

[[LectionMultiThreading]]
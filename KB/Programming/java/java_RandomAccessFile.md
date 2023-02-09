---
created: Monday 19th December 2022 10:39
Last modified: Monday 19th December 2022 10:39
Aliases: доступ к файлам в java
Tags: java
---

# [RandomAccessFile](java_RandomAccessFile)


Класс пакета [[Java IO]]
## Зачем?
**RandomAccessFile** может *читать* и *писать* не только с начала, но и с любого другого места файла. Это делает его полезным при мультипоточной обработки файла.

## Использование

**Создание**

```java
RandomAccessFile raf = new RandomAccessFile (Файловый файл, строковый режим);
```


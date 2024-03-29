---
created: Wednesday 13th September 2023 16:17
Last modified: Wednesday 13th September 2023 16:16
Aliases: turing
Tags: programming
---

# [[Machine Turing]]

Машина Тьюринга — это абстрактная вычислительная машина, мысленный эксперимент для решения проблемы математической логики. Она состоит из трёх элементов:

- бесконечной ленты с ячейками;
- автомата или головки для чтения и записи;
- программы.
![[Pasted image 20230915120436.png]]

*Головка* может:
- Считать содержимое ячейки
- Стереть содержимое ячейки
- Перезаписать содержимое ячейки
- Передвинуться влево
- Передвинуться вправо
- Повторить считывание

Действие головки определяются *программой*, которая записывается в виде таблицы и имеет внешний и внутренний алфавит:
- Внешний алфавит - это конечно множество, элементами которого называются буквами или символами
- Внутренний алфавит - это конечное множество, которое отображает состояние головки

Таким образом, команду, которую должна выполнить головка определяется пересечением внутреннего и внешнего алфавита


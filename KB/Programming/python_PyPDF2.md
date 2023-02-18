
---
created: Tuesday 20th December 2022 16:35
Last modified: Tuesday 20th December 2022 16:35
Aliases: библиотека для работы с pdf, pypdf
Tags: python
---

# [[python_PyPDF2]]

Библиотека в [python](📙Python.md) для работы с pdf

>*install:*
>pip3 install PyPDF2
>

📌*Пример открытия pdf-файла:*
```python
import PyPDF2  
with open('pdf-playground/dummy.pdf', 'rb') as pdf_file:  
	...
```

📌*Работа с pdf-файлом:*
```python
	reader = PyPDF2.PdfFileReader(pdf_file)
	#Количество страниц в файле  
	print(reader.numPages)
	#Page-object
	print(reader.getPage(0))

	page = reader.getPage(0)  
	#записываем в переменную объект перевёрнутой странице
	rotatedPage = page.rotateClockwise(180)  
	#создаём врайтер, я так понял - это своего рода буффер
	writer = PyPDF2.PdfFileWriter()  
	#запихиваем в врайтер страницу
	writer.addPage(rotatedPage)  
	with open('tilt.pdf', 'wb') as new_file:  
		#записываем страницу в файл
	    writer.write(new_file)
```

📌*Скрипт для merge двух pdf-файлов:*
```python
import PyPDF2  
import sys  
  
inputs = sys.argv[1:]  
  
def merger_pdf(pdf_files):  
    merger = PyPDF2.PdfMerger()  
    for file in pdf_files:  
        merger.append(file)  
        print(file)  
    merger.write('merger.pdf')  
    
merger_pdf(inputs)
```

📌*Скрипт для нанесения водяного знака на пдф:*
```python
import PyPDF2  
template = PyPDF2.PdfFileReader(open('merger.pdf', 'rb'))  
watermark = PyPDF2.PdfFileReader(open('pdf-playground/wtr.pdf', 'rb'))  
output = PyPDF2.PdfFileWriter()  
  
for i in range(template.getNumPages()):  
    page = template.getPage(i)  
    page.mergePage(watermark.getPage(0))  
    output.addPage(page)  
    with open("watermark.pdf", 'wb') as wb:  
        output.write(wb)
```
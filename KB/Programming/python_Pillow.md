
---
created: Sunday 18th December 2022 11:07
Last modified: Sunday 18th December 2022 11:07
Aliases: сжатие картинок
Tags: python
---

# [[Pillow]]

Инструмент для работы с картинками на языке [Python](📙Python.md)

>*install:*
>pip3 install Pillow 

📌*Пример открытия картнки:*
```python
from PIL import  Image  
image = Image.open('./pockemons/209 pikachu.jpg')  
print(image) 
#<PIL.JpegImagePlugin.JpegImageFile image mode=RGB size=640x640 at 0x1EE1063B4F0>
```

📌*Работа с изображениями:*
```python
from PIL import  Image, ImageFilter  
image = Image.open('./pockemons/209 pikachu.jpg')  
#наложить фильтер блура
image_filter = image.filter(ImageFilter.BLUR)  
#сделать картинку чёрно-белой
image_grey = image.convert('L') 
#перевернуть картинку
crocked = image_grey.rotate(90) 
#изменить размер картинки
resize = image_grey.resize((50, 50)) 
# обрезать картинку
box_crop = (100, 100,400,400)  
crop_image = image_filter.crop(box_crop)
#Уменьшить разрешение(и, следовательно, размер, картинки)
large_img = Image.open("./large-photo/211 astro.jpg");  
large_img.thumbnail((400, 400))  
#Сохранение
large_img.save('./large-photo/resize.jpg')
image_filter.save("blur_pichachy.png", "png")
image_grey.save('gray.png', 'png')
```
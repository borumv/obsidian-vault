---
created: Wednesday 26th April 2023 14:35
Last modified: Wednesday 26th April 2023 14:35
Aliases: tensoflow
Tags: programming
---

![[Pasted image 20230426143628.png]]

**TensorFlow hub** - это библиотека с готовыми моделями. 
Эти модели могут быть использованы в качестве компонентов более крупных моделей машинного обучения или в качестве инструментов для предобработки данных перед обучением моделей. TensorFlow Hub также позволяет искать модели по тематике, датасетам и прочим параметрам, что делает процесс выбора наиболее подходящей модели для конкретной задачи более удобным и быстрым.


### FLOW IMAGES

**Этапы:**
#### 1. Подготовка данных (*turn into Tensors*)
1. Взять путь к картинке 
2. Использовать **TensorFlow** читаев файл и сохраняем его в переменной
3. Конвертируем нашу картинку в *тензор*
4. Нормализируем нашу картинку (конвертируем каналы цвета с 0-255 в 0-1)
5. Изменяем размер нашей картинки 
6. Возвращаем нашу картинку
```python
# Define image size
IMG_SIZE = 224 
# Функция в которой определяются основные этапы подготовки данных
def process_image(image_path, img_size=IMG_SIZE):
	# 1. Взять путь к картинке
	filenames = ["drive/MyDrive/Dog Vision/train/" + names + ".jpg" for names in labels_csv["id"]]
	image_path = filenames[1]
	# 2.. Использовать TensorFlow читаев файл сохраняем её в переменной
	image = tf.io.read_file(image_path)
	# 3. Нормазиуем нашу картику 
	image = tf.io.decode_jpeg(image, channels=3)
	# 4. Нормализируем нашу картинку (конвертируем каналы цвета с 0-255 в 0-1)
	image = tf.image.convert_image_dtype(image, tf.float32)
	# 5. Изменяем её размер
	image = tf.image.resize(image, [img_size, img_size])
```
7. Преобразование данных в *Tuple(image, label)*, где `image` - это тензор с изображением, а `label` - метка
```python
def get_image_label(image_path, label):
  image = process_image(image_path)
  return image, label
```
8. Разделение наших данных на **батчи**
**Почему нужно разделять наши данные на батчи?**
Это необходимо, чтобы наша сессия обучения вместилась в gpu-память. *32* (обработка 32 картинок за итерацию) - является общепринятым стандартом, но при необходимости можно поменять.  

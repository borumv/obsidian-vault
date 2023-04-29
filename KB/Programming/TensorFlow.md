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
```python
BATCH_SIZE = 32
# Функция для разделение наших данных на батчи
def create_data_batches(X, y=None, batch_size=BATCH_SIZE, valid_data=False, test_data=False):
  """
  Creates batches of data out of image (X) and label (y) pairs
  Создаёт батчи наших данных из пары картинок (X) и меток(y)
  Перемешивает данные которые являются не тренировочными
  Также принимает тестовые данные, которые не имеют меток
  """
  #  Если данные являются тестовыми, то у нас нет меток
  if test_data:
    print("Creating test data batches...")
     # Создание dataset Tensor-ов из Tuple(filepath)
    data = tf.data.Dataset.from_tensor_slices((tf.constant(X)))
    # Преобразование наших данных в нормализованную форму и разделение на батчи
    data_batch = data.map(process_image).batch(BATCH_SIZE)
    return data_batch
  # Если данные являются валидационными, нам не нужно их перемешивать
  if valid_data:
    print("Creating validation data batches...")
    # Создание dataset Tensor-ов из Tuple(filepath, label)
    data = tf.data.Dataset.from_tensor_slices((tf.constant(X), #filepath
										                                               tf.constant(y))) #labels
	# Преобразование наших данных в нормализованную форму и разделение на батчи
    data_batch = data.map(get_image_label).batch(BATCH_SIZE)
    return data_batch
  else:
    print("Creadint train data batches...")
    # Создание dataset Tensor-ов из Tuple(filepath)
    data = tf.data.Dataset.from_tensor_slices((tf.constant(X),
                                               tf.constatnt(y)))
    # Перемешивание наших данных. В `batch_size` указываем количество данных, участвующих в перемешке
    data.shuffle(buffer_size=len(X))  
    # Создание dataset Tensor-ов из Tuple(filepath, label) и преобразование наших данных в TF objecty
    data = data.map(get_image_label)
    # разделение наших данных на батчи
    data_batch = data.batch(batch_size = len(data))
    return data_batch
```

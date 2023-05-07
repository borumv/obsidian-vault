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
1. [[Подготовка данных модели глубоког обучения (turn into Tensors)]]
2. [[Построение модели Глубокого обучения]]
3. Тренировка модели глубокого обучения
После того, как мы [[Построение модели Глубокого обучения|создали модель]], и [[Keras callbacks|установили callback-и]] 
Вызовите функцию fit() в нашей модели, передав ей данные обучения, данные проверки, количество *эпох* для обучения (NUM_EPOCHS) и обратные вызовы, которые мы хотели бы использовать.



**Keras Callbacks** 
```python
# Load TensorBOard notebook extension
%load_ext tensorboard
import datetime
# Create a function to build a TensorBoard callback
def create_tensorboard_callback():
  # Create a log directory for storing TensorBoard logs
  logdir = os.path.join("drive/MyDrive/Dog Vision/logs",
                        # Make it so the logs get trackecd whenever we run an experiment
                        datetime.datetime.now().strftime("%Y%m%d-%H%M%S"))
  return tf.keras.callbacks.TensorBoard(log_dir=logdir)
```
**Epochs (Эпохи)** 
Гиперпараметр, отвечающий за то, сколько раз мы прогоним наш датасет через нейронную сеть.





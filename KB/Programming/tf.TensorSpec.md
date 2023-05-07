---
created: Sunday 7th May 2023 13:46
Last modified: Sunday 7th May 2023 13:46
Aliases: tensorspec
Tags: programming
---


[[tf.TensorSpec]]
```python
# Check out the different attributes of our batches
train_data.element_spec, val_data.element_spec
# Возвращает
((TensorSpec(shape=(None, 224, 224, 3), dtype=tf.float32, name=None),
  TensorSpec(shape=(None, 120), dtype=tf.bool, name=None)),
 (TensorSpec(shape=(None, 224, 224, 3), dtype=tf.float32, name=None),
  TensorSpec(shape=(None, 120), dtype=tf.bool, name=None)))
```
Данный объект описывает *тип тензора*. У него есть следующие аргументы:
`shape` - форма [[Тензор|тензора]]

---
created: Thursday 23rd March 2023 12:36
Last modified: Thursday 23rd March 2023 12:36
Aliases: one hot encoding
Tags: programming
---

**One hot encoding** - это процесс [[Конвертирование non-numerical значений в numerical|преобразования категориальных признаков в бинарные признаки]]. Этот метод используется в [[MOC-Machine Learning|машинное обучении]] и анализе данных для обработки категориальных данных, которые не могут быть обработаны стандартными алгоритмами машинного обучения.

![[Pasted image 20230323123741.png|400]]

## Пример использования


```python
from sklearn.preprocessing import OneHotEncoder
from sklearn.compose import ColumnTransformer

categorical_fetures = ['Make', 'Colour', 'Doors']
one_hot = OneHotEncoder()
transformer = ColumnTransformer([("one_hot", one_hot,
                                categorical_fetures
                                )], remainder="passthrough")
transformed_X = transformer.fit_transform(X)
pd.DataFrame(transformed_X)
```

Библиотека `sklearn` содержит класс `OneHotEncoder`, который позволяет преобразовывать категориальные данные в бинарные признаки. 
`ColumnTransformer` - это класс, который используется для применения преобразований к определенным столбцам входных данных.

Переменная `categorical_features` содержит список категориальных признаков, которые должны быть преобразованы в бинарные признаки. 
Объект `OneHotEncoder` инициализируется без параметров, таким образом, все категории будут преобразованы в бинарные признаки.

`ColumnTransformer` применяет OneHotEncoder к столбцам, указанным в списке `categorical_features`. В данном случае новые признаки будут добавлены в начало данных. Аргумент "passthrough" указывает, что все остальные столбцы данных (которые не включены в список `categorical_features`) должны быть пропущены без изменений.

Наконец, метод `fit_transform` применяет преобразование к данным X и возвращает новую матрицу признаков `transformed_X`, которая содержит бинарные признаки вместо категориальных.
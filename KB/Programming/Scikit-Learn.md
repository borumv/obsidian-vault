
---
created: Wednesday 8th March 2023 18:35
Last modified: Wednesday 8th March 2023 18:35
Aliases: 
Tags: python
---

# [[Scikit-Learn]]


**Scikit-learn** - это библиотека машинного обучения для языка программирования [[📙Python]], которая предоставляет набор простых и эффективных инструментов для анализа данных и решения задач машинного обучения. [[Scikit-Learn]] содержит множество моделей машинного обучения, включая классификацию, регрессию, кластеризацию и многие другие. Она также предоставляет функции для предобработки данных, выбора моделей, оценки моделей и многое другое. Scikit-learn является одной из наиболее популярных и используемых библиотек машинного обучения в сообществе Python и широко применяется в индустрии и научных исследованиях.

## Workflow

1.**[[Подготовка данных в машинному обучении|Подготовка данных]]** (Getting the data ready)
2.**[[Выбор оценщика и алгоритма для решения задачи машинного обучения|Выбор правильного алгоритма/оценщика для решения нашей задачи]]** (Choose the right estimator/algortihm for our problenms)
3.**[[Обучение модели (fitting) в машинном обучении|Обучение модели (fitting) и использование ее для предсказания на данных (making predictions)]]**. (Fit the model/algorithm and use it to make predictions on our data)
4.**[[Оценка модели машинного обучения|Оценка модели]]** (Evaluating a model)
5.**[[Улучшение модели в машинном обучении|Улучшение модели]]** (Improve a model)


6.**Сохранение и загруззка модели** (Save and load a trained model)
Это отдельный этап, который может происходить как до, так и после этапа развертывания модели. Когда мы тренируем модель, она обучается на определенных данных, и когда мы сохраняем ее, мы сохраняем параметры модели, которые были получены в результате обучения. Затем, когда мы загружаем модель, мы можем использовать сохраненные параметры для совершения предсказаний на новых данных.
Развертывание модели, с другой стороны, означает использование обученной модели для решения реальных задач в реальной среде, например, в бизнесе. На этом этапе мы интегрируем модель в приложение или создаем интерфейс, который позволяет пользователям взаимодействовать с моделью.
Таким образом, сохранение и загрузка модели являются важными шагами для обеспечения ее повторного использования в будущем, тогда как развертывание модели позволяет использовать ее в реальном мире.
Сохранение производится 2-мя способами:
1. **`pickle`** модуль
```python
import pickle

#Save an existing model to file
pickle.dump(gs_cv_clf, open("gs_cv_clf_model_1.pkl", "wb"))

model = pickle.load(open("gs_cv_clf_model_1.pkl", "br"))
preds = model.predict(X_validate)
evaluate_preds(y_validate, preds)
```
1. **`joblib`** модуль
```python
from joblib import dump, load

dump(gs_cv_clf, filename="gs_cv_clf_model.joblib")
model = load(filename="gs_cv_clf_model.joblib")
preds = model.predict(X_validate)
evaluate_preds(y_validate, preds)
```

7.**Объединение** (Put it all together)

Pipeline in Scikit learn - ?

Означает объединение всех этапов создания модели в один процесс. Это может включать в себя подготовку данных, выбор и обучение модели, оценку ее производительности, улучшение и тюнинг параметров модели, сохранение и загрузку модели, а также развертывание модели.
Такой подход позволяет создать полный и эффективный процесс машинного обучения, который позволяет решать различные задачи в различных областях, например, в бизнесе, медицине, финансах и т.д. При использовании подхода "Put it all together" важно убедиться, что каждый шаг процесса выполняется эффективно и точно, чтобы получить оптимальную производительность модели и достичь требуемых результатов.

```python
#Getting data ready
import pandas as pd
from sklearn.compose import ColumnTransformer
from sklearn.pipeline import Pipeline
from sklearn.impute import SimpleImputer
from sklearn.preprocessing import OneHotEncoder

#Modelling
from sklearn.ensemble import RandomForestRegressor
from sklearn.model_selection import train_test_split, GridSearchCV

#Setup random seed
import numpy as np
np.random.seed(42)

#Import data and drop rows with missing labels
data = pd.read_csv ("data/car-sales-extended-missing-data.csv")
data.dropna(subset=["Price"], inplace=True)

#Define different features and transformer pipeline
categorical_features = ["Make", "Colour"]
categorical_transformer = Pipeline(steps=[
    ("imputer", SimpleImputer(strategy="constant", fill_value="missing")),
    ("onehot", OneHotEncoder(handle_unknown="ignore"))])
door_feature = ["Doors"]
door_transformer = Pipeline(steps=[
    ("imputer", SimpleImputer(strategy="constant", fill_value=4)),
    
])
numerical_features = ["Odometer (KM)"]
numerical_transformer = Pipeline(steps=[
    ("imputer", SimpleImputer(strategy="mean"))])

#Setup preprocessing steps (fill missing values, then convert to numbers)
preprocessor = ColumnTransformer(
                    transformers=[
                        ("cat", categorical_transformer, categorical_features),
                        ("door", door_transformer, door_feature),
                        ("num", numerical_transformer, numerical_features)
                    ])
#Creating a preprocessing and modeling pipeline
model = Pipeline(steps=[("preprocessor", preprocessor),
                       ("model", RandomForestRegressor())])

#Split data
X = data.drop("Price", axis=1)
y = data["Price"]
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2)

#Fit and score the model
model.fit(X_train, y_train)
model.score(X_test, y_test)
```

![[Pasted image 20230308183535.png]]

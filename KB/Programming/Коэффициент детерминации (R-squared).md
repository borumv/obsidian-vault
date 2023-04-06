---
created: Tuesday 28th March 2023 14:09
Last modified: Tuesday 28th March 2023 14:09
Aliases: R-squared, коэффициент детерминации
Tags: programming
---


*Коэффициент детерминации* (R-squared) - это метрика оценки качества [[Модель регрессии|модели регрессии]], которая измеряет, насколько хорошо модель соответствует данным. Коэффициент детерминации находится в диапазоне от 0 до 1, где 0 означает, что модель не объясняет вариацию целевой переменной, а 1 означает, что модель идеально соответствует данным.

Пример кода, где метод `score()` возвращает r-sqared
```python
from sklearn.ensemble import RandomForestRegressor
model = RandomForestRegressor().fit(X_train, y_train)

model.score(X_test, y_test)
```
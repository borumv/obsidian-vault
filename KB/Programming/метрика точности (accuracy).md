---
created: Tuesday 28th March 2023 16:07
Last modified: Tuesday 28th March 2023 16:07
Aliases: accuracy
Tags: programming
---

*Точность (accuracy)* - это доля правильно классифицированных наблюдений от общего числа наблюдений в тестовом наборе данных. Используется в [[Модель классификации|классификаторах]]

```python
np.random.seed(42)
from sklearn.model_selection import cross_val_score
from sklearn.ensemble import RandomForestClassifier
from sklearn.model_selection import train_test_split

X = heart_deseas.drop('target', axis=1)
y = heart_deseas['target']

X_train, X_test, y_train, y_test = train_test_split(X,y,test_size=0.2)

model = RandomForestClassifier(n_estimators=100).fit(X_train, y_train)
model.score(X_test, y_test)
print(f"accuracy = {np.mean(cross_val_score(model, X, y))*100:.2f}%")
```


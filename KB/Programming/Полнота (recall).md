---
created: Saturday 1st April 2023 19:11
Last modified: Saturday 1st April 2023 19:11
Aliases: recall, метрика полноты, метрика чувствительности (sensitivity)
Tags: programming, machineLearning
---


Метрика показателя проивзодительности модели [[Модель классификации|классификации]], которую ещё называют *долей истинно положительной классификации(True Positive Rate TPR)* или *метрикой чувствительности*.

Данная метрика описывает, как часто *положительное предсказание модели совпадает с правдой*.
![[Pasted image 20230401192057.png]]

Код в [[Scikit-Learn]]:
```python
from sklearn.metrics import recall_score
recall_s = recall_score(y_test, y_preds)
recall_s
```
 
Полноту с [[Точность (precision)|точностью]] часто объединяют в одну метрику - [[Мера F1 (F1 score)|F1]]
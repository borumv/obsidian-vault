---
created: Saturday 1st April 2023 20:01
Last modified: Saturday 1st April 2023 20:01
Aliases: f1 score, метрика f1
Tags: programming
---

Мера F1 - это [[среднее гармоническое]] [[Точность (precision)|точности]] и [[Полнота (recall)|полноты]]. Формула выведена так, что только при высоких точности и полноте будет *высокая мера F1*.

![[Pasted image 20230401200701.png]]

Код в [[Scikit-Learn]]:
```python
from sklearn.metrics import f1_score
f1_s = f1_score(y_test, y_preds)
f1_s
```

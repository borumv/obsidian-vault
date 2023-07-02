---
created: Sunday 2nd July 2023 09:54
Last modified: Sunday 2nd July 2023 09:54
Aliases: тестирование в питоне
Tags: programming
---


## Testing in [[📙Python]]
*Пример:*
```python
import unittest  
import sum_module  
  
  
class TestSum(unittest.TestCase):  
    def setUp(self):  
        print("let's go!")  
  
    def test_should_return_nine(self):  
        result = sum_module.sum_five(4)  
        self.assertEqual(result, 9)  
  
    def test_should_return_Valueerror(self):  
        result = sum_module.sum_five("dfsifhsdhf")  
        self.assertIsInstance(result, ValueError)  
  
    def test_should_print(self):  
        result = sum_module.sum_five(0)  
        self.assertEqual(result, "please write > 0")  
  
    def tearDown(self):  
        print("clear")  
  
  
if __name__ == '__main__':  
    unittest.main()
    ```
Чтобы запустить **все** тесты из командной строки
**`python3 -m unitest -v`**


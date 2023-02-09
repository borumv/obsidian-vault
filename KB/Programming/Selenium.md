
---
created: Tuesday 31st January 2023 09:35
Last modified: Tuesday 31st January 2023 09:34
Aliases: селениум, тестирование браузеров
Tags: python
---

# [[Selenium]]

📌 Данная библиотека предназначена для тестирования браузера. 

Для установки:
```python
pip3 install selenium
```
Selenium работает с **драейверами**, который каждый особенный для определённого браузера (систеы). Также, если мы работает в виртуальной среде, то нужно брать драйвер для **Linux:**
```python
from selenium import webdriver  
from selenium.webdriver.firefox.service import Service  
from selenium.webdriver.firefox.options import Options  
  
service = Service(r'geckodriver.exe')  
firefox_browser = webdriver.Firefox(service=service)  
  
print(firefox_browser)
```


**Запрашиваем страницу через гет-запрос**:
```python
firefox_browser.get("https://habr.com/ru/all/")  
  
assert "Все публикации подряд / Хабр" in firefox_browser.title
```

Чтобы достать элементы, в селениуме нужно использовать селекторы. 
source: https://selenium-python.readthedocs.io/locating-elements.html

```python
element = firefox_browser.find_element(By.ID, "710874").get_attribute('innerHTML')  
print(element)

find_element(By.ID, "id")
find_element(By.NAME, "name")
find_element(By.XPATH, "xpath")
find_element(By.LINK_TEXT, "link text")
find_element(By.PARTIAL_LINK_TEXT, "partial link text")
find_element(By.TAG_NAME, "tag name")
find_element(By.CLASS_NAME, "class name")
find_element(By.CSS_SELECTOR, "css selector")
```


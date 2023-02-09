
---
created: Thursday 12th January 2023 13:22
Last modified: Thursday 12th January 2023 13:22
Aliases: Flask, Фласк
Tags: python
---

# [[Flask]]

В документации советуют, сначала установить [[python_Виртуальная среда|виртуальную среду]] и в него уже устанавливать библиотеку:

>pip install Flask



Для запуска Фласки:
Можно создать виртуальную переменную `FLASK_APP`  и запустить
>$env:FLASK_APP = "server.py"
>flask run

А Можно вот так:
>flask --app *Имя_файла* run

Для запуска **дебага**:
>flask --app server --debug run



Подгрузка html-страниц осуществляется с помощью `render_template`:
```python
from flask import Flask, render_template  
  
app = Flask(__name__)  
  
@app.route("/")  
def hello_world():  
    return render_template("./index.html")
```
Все css слои и js должны храниться в папке `static`

Чтобы добавить **ico**, необходимо в html Добавить следующую строчку:
```html
<link rel="shortcut icon" href="{{ url_for('static', filename='mario.ico') }}">
```

**URL параметры**
```python
from markupsafe import escape

@app.route('/user/<username>')
def show_user_profile(username):
    # show the user profile for that user
    return f'User {escape(username)}'

@app.route('/post/<int:post_id>')
def show_post(post_id):
    # show the post with the given id, the id is an integer
    return f'Post {post_id}'

@app.route('/path/<path:subpath>')
def show_subpath(subpath):
    # show the subpath after /path/
    return f'Subpath {escape(subpath)}'
```
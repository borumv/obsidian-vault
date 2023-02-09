# Git и Github для начинающих

Git — система контроля версий

Git - это система контроля версий, позволяющая эффективно управлять историей исходного кода.

Любые изменения которые ты вносишь в проект могут быть сохранены с помощью Git. Ты можешь вернуться к любым ранее сохраненным версиям.

Без Git пришлось бы создавать копии проекта, что было бы проблемой при увеличении объема кода в приложении.

На текущий момент Git — стандарт для разработки.

## Git и GitHub

Для начинающих может быть непонятна разница между этими терминами.

**Git** — система контроля версий. Технология, которую можно скачать на компьютер.

**Github** — сервис, который позволяет работать с твоими Git проектами. Это называется репозитории. Помимо Github существуют другие сервисы (например Bitbucket, GitLab).

## Как установить Git

Это бесплатная технология и скачать ее можно тут:  
[https://git-scm.com/downloads](https://vk.com/away.php?to=https%3A%2F%2Fgit-scm.com%2Fdownloads&cc_key=)

Запускается через командную строку или терминал с команды **git**

В этом практическом курсе можно познакомиться с его основами

Доступ ограничен

Курс по Git и Github для начинающих

## Основные команды

### git init

Позволяет проинициализировать репозиторий в текущей папке



### git checkout

Переключается на другую ветку

> **git checkout branch-name** — переключается на последний коммит в ветке branch-name

> **git checkout -b branch-name** — создает и переключается на ветку branch-name

### git merge

Совмещает текущую ветку с выбранной

> **git merge branch-name** — совмещает текущую ветку с branch-name

### git config

Конфигурация и параметры git

> **git config --global user.name** — Показывает имя пользователя

> **git config --global user.name 'new user'** — Изменяет имя пользователя

> **git config --global user.email** — Показывает email пользователя

> **git config --global user.email 'test@mail.ru'** — Изменяет email пользователя





### 🔸<mark style="background: #FF5582A6;">git clone</mark> - _клонирует проект с удаленного репозитория_

```python
git clone https://github.com/name/name_project.git
```


### 🔸<mark style="background: #FF5582A6;">git status</mark> - _показывает текущий статус (какие файлы ещё добавлены в очередь для комита)_

```python
git status
```

### 🔸<mark style="background: #FF5582A6;">git add</mark> - _отправляе в очередь для коммита файла/все файлов_
```python
git add index.html ##— добавляет index.html
git add . ## — добавляет все файлы
```

### 🔸<mark style="background: #FF5582A6;">git commit</mark> - _отправляет изменения в гит_

```python
git commit -m 'commit message' ## — создает коммит с сообщением
```

### 🔸<mark style="background: #FF5582A6;">git push</mark> - _Заливает текущие локальные коммиты в удаленный репозиторий_
```python
git push
```

### 🔸<mark style="background: #FF5582A6;">git pull</mark> _Забирает изменения с удаленного репозитория в локальный_
```python
git pull
```

📙**Работа с ветками в репозитории**

## 🔸<mark style="background: #FF5582A6;">git branch</mark> — *показывает список веток*

## 🔸<mark style="background: #FF5582A6;">git branch branch-name</mark> — *создает новую ветку branch-name*

🔸<mark style="background: #FF5582A6;">git branch -D branch-name</mark> — *удаляет ветку branch-name*

## Настройка с github для windows

```python
start-ssh-agent.cmd
```
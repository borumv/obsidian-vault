---
created: Thursday 11th May 2023 13:14
Last modified: Thursday 11th May 2023 13:13
Aliases: чистка dockera
Tags: programming
---

**Чистка [[Docker container|контейнера]]**
Уничтожить все запущенные докер-контейнеры:
- `docker kill $(docker ps -q)`
Уничтожить остановленные докер-контенеры:
- `docker rm $(docker ps -a -q)`

**Чистка [[Docker Image|images]]**
Уничтожить образ докера:
- `docker rmi <image name>`
Удалить образы без тегов
- `docker rmi $(docker images -q -f dangling=true)`
Удалить все образы:
- `docker rmi $(docker images -q)`

**Чистка [[Docker Volume]]**
- Как только том не связан с [[Docker container|контейнером]] он считается *висячим*

Удалить все *висячие* тома:
- `docker volume rm $(docker volume ls -f dangling=true -q`

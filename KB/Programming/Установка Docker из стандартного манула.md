---
created: Tuesday 7th February 2023 08:40
Last modified: Tuesday 7th February 2023 08:40
Aliases: устаенвка докера
Tags: docker
---

# [[Установка Docker из стандартного манула]]

Установка Docker (из мануала):
1) Clone repository
The _Getting Started_ project is a simple GitHub repository which contains everything you need to build an image and run it as a container.

Clone the repository by running Git in a container.
```powershell
docker run --name repo alpine/git clone https://github.com/docker/getting-started.git
docker cp repo:/git/getting-started/
```
2) Now, build the image
A Docker image is a private file system just for your container. It provides all the files and code your container needs.
```powershell
cd getting-started
docker build -t docker101tutorial
```
3) Run your first container
Start a container based on the image you built in the previous step. Running a container launches your application with private resources, securely isolated from the rest of your machine.
```powershell
docker run -d -p 80:80 --name docker-tutorial docker101tutorial
```
4) Now save and share your image
Save and share your image on Docker Hub to enable other users to easily download and run the image on any destination machine.
```powershell
docker tag docker101tutotrial falltroy/docker101tutorial
docker push falltroy/docker101tutorial
```


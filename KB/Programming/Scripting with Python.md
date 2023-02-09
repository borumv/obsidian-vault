
---
created: Sunday 18th December 2022 11:00
Last modified: Sunday 18th December 2022 10:56
Aliases: скрипты на питоне
Tags: python
---
Parent: [[_Python]]

# [[Scripting with Python]]

## Image Processing with Python

📌Для сжатия картинок в питоне есть множество тулов, один из них - [[python_Pillow]]
📌Существует библиотека [[OpenCV]]

## PDF Processing with Python

📌[[python_PyPDF2]]

## **Sending EMAILS**

```python
import smtplib  
from email.message import EmailMessage  
  
email = EmailMessage()  
email['from'] = 'Boris Bo BO'  
email['to'] = 'falltroy@protonmail.com'  
email['subject'] = 'You won 1,000,000 dollars'  
  
email.set_content('I am a Python Master!')  
  
#log in and sent  
with smtplib.SMTP(host='smtp.gmail.com', port=587,) as smtp:  
    smtp.ehlo()  
    #TLAS - механизм шифрования  
    smtp.starttls()  
    smtp.login('vasyabordak@gmail.com', '8621398a')  
    smtp.send(email)  
    print('all good boss')
```

## [[python_Pasword Checker]]

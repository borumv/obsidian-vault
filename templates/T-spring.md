
<%*
  let title = tp.file.title
  if (title.startsWith("Untitled")) {
    title = await tp.system.prompt("Title");
    await tp.file.rename(title);
  } 
  
  tR += "---"
%>
created: <% tp.date.now("dddd Do MMMM YYYY HH:mm") %>
Last modified: <% tp.file.last_modified_date("dddd Do MMMM YYYY HH:mm") %>
Aliases: <% tp.system.prompt("Aliases?") %>
Tags: spring, java
---
<% await tp.file.move("/KB/Programming/spring_" + tp.file.title) %>
# [[<% tp.file.title %>]]

📌tp.file.cursor(1)


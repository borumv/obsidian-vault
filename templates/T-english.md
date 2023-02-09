

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

Tags: <% tags = await tp.system.prompt("Write tags?")%> ,  english
---
<% await tp.file.move("/KW/KB/English/" + tp.file.title) %>
# [[<% tp.file.title %>]]

Parent: [[<% tp.system.suggester(["Grammar"], ["English_Grammar"]) %>]]

> [!tip] Description
> Lorem ipsum dolor sit amet

>[!example] Examples
>lorem inedff


See also:[]
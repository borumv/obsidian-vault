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
Tags: <% tags = await tp.system.prompt("Write tags?")%>  algorithms
---
<% await tp.file.move("/KB/Programming/algorithms/" + tp.file.title) %>
# [[<% tp.file.title %>]]

Parent: [[📙MOC-ALGORITHMS]]

Асимптотика:

> [!success] Solution
> Lorem ipsum dolor sit amet

see also:[]

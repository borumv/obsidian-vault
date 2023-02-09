<%*
  let title = tp.file.title
  if (title.startsWith("Untitled")) {
    title = await tp.system.prompt("Title");
    await tp.file.rename(title);
  } 
  
  tR += "---"
%>
title:  <%* tR += title %>
created: <% tp.date.now("dddd Do MMMM YYYY HH:mm") %>
Last modified: <% tp.file.last_modified_date("dddd Do MMMM YYYY HH:mm") %>
Aliases: 
Tags: <% tags = await tp.system.prompt("Write tags?")%>

---
# <%* tR += title %>

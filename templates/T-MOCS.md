<%*
  let title = tp.file.title
  if (title.startsWith("Untitled")) {
    title = await tp.system.prompt("Title");
    await tp.file.rename("MOC-" + title);
  }else{
	  tp.file.rename("MOC-" + title)
  } 
  
  tR += "---"
%>
Aliases: <% tp.system.prompt("Aliases?") %>, мок

Tags: <% tags = await tp.system.prompt("Write tags?")%> moc
---




## MOC

%% Hub MOCs: Don’t edit below  %%

%% Hub MOCs: Don’t edit above  %%

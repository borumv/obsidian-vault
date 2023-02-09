Syntax: `<% templater command comes here%>`
## DATE

<% tp.date.now()%>
_Подробнее_:_ [[Templater-date]]

## File Module
 <%tp.file%>
### Content 
<%tp.file.content%> - копирует контент
### Create new file
<%tp.file.create_new()%>
_Arguments:_
	- template
	- filename
	- open_new
	- folder
<%tp.file.create_new("moc", "test", true).basename %> 
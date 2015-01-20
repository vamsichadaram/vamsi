<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<form:form action="/srustiapp/link/save" modelAttribute="linkComponent"
	method="POST">
	<table>
		<tr>
			<td>name</td>
			<td><input type="text" name="name"></td>
		</tr>
		<tr>
			<td>Description</td>
			<td><input type="text" name="description"></td>
		</tr>
		<tr>
			<td>url</td>
			<td><input type="text" name="url"></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="add"></td>
		</tr>
	</table>
</form:form>
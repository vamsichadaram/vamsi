<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<form:form action="/demo/media/save" enctype="multipart/form-data"
	modelattribute="mediaForm" method="POST">
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
			<td>Alt</td>
			<td><input type="text" name="alt"></td>
		</tr>
		<tr>
			<td>Title</td>
			<td><input type="text" name="title"></td>
		</tr>
		<tr>
			<td>Image</td>
			<td><input type="file" name="file"></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="add"></td>
		</tr>
	</table>
</form:form>
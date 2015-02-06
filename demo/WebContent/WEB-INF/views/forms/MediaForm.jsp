<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 <link href="${pageContext.request.contextPath}/resources/css/main.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" />
	<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/simple-sidebar.css" />
<script
	src="${pageContext.request.contextPath}/resources/script/jquery-1.11.1.min.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/script/bootstrap.min.js"></script>
<div id="wrapper">
 <!-- Page Content -->
        <div id="page-content-wrapper">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12">
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
			<td><input type="file" name="file" multiple="multiple"></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="add"></td>
		</tr>
	</table>
</form:form>
 </div>
                </div>
            </div>
        </div>
        <!-- /#page-content-wrapper -->
</div>
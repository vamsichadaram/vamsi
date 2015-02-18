
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<link href="${pageContext.request.contextPath}/resources/css/forms.css"
	rel="stylesheet">

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


<form class="elegant-aero" action="/demo/category/save" method="post">
	<h1>
		Category Form <span>Please fill all the texts in the fields.</span>
	</h1>
	<table>
		<tr>
			<td><span>category</span></td>
			<td><input type="text" name="category"></td>
		</tr>
		<tr>
			<td></td>
			<td><input class="button" value="add" type="submit"></td>
		</tr>
	</table>
</form>
<!-- <a href="#menu-toggle" class="btn btn-default" id="menu-toggle">Toggle Menu</a> -->
<c:if test="${!empty categories}">
	<h4>Categories</h4>
	<c:forEach items="${categories}" var="category">
		<li><a href=""><c:out value="${category.category}" /></a></li>
	</c:forEach>
</c:if>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
						<form action="/demo/category/save" method="post">
							<table>
								<tr>
									<td>category</td>
									<td><input type="text" name="category"></td>
								</tr>
								<tr>
									<td></td>
									<td><input value="add" type="submit"></td>
								</tr>
							</table>
						</form>                       
                        <!-- <a href="#menu-toggle" class="btn btn-default" id="menu-toggle">Toggle Menu</a> -->
                        <c:if test="${!empty categories}">
                        	<h4>Categories</h4>
                        	<c:forEach items="${categories}" var="category">
                        		<li>
                        			<a href=""><c:out value="${category.category}"/></a>
                        		</li>
                        	</c:forEach>
                        </c:if>
                    </div>
                </div>
            </div>
        </div>
        <!-- /#page-content-wrapper -->
</div>
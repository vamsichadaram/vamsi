 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
						<form:form action="/demo/picture/save" method="POST" enctype="multipart/form-data" modelAttribute="picture">
							<table>
								<tr>
									<td></td>
									<td><input type="hidden" name="customerid" value="${picture.customerid}"></td>
								</tr>
								<tr>
									<td></td>
									<td><input type="hidden" name="category" value="${picture.category}"></td>
								</tr>
								<tr>
									<td>Media</td>
									<td><input type="file" name="files" multiple="multiple"></td>
								</tr>
								<tr>
									<td></td>
									<td><input type="submit" value="upload"></td>
								</tr>
							</table>
						</form:form>                       
                        <!-- <a href="#menu-toggle" class="btn btn-default" id="menu-toggle">Toggle Menu</a> -->
                    </div>
                </div>
            </div>
        </div>
        <!-- /#page-content-wrapper -->
</div>
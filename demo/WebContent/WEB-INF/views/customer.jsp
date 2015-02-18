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
						<form action="/demo/customer/save" method="post">
						<input type="hidden" name="customerid" value="${customers.customerid}"/>
						<table>
							<tr>
								<td>Name</td>
								<td><input type="text" name="name" value="${customers.name}"/></td>
							</tr>
							<tr>
								<td>Email</td>
								<td><input type="text" name="email" value="${customers.email}"/></td>
							</tr>
							<tr>
								<td>Contact</td>
								<td><input type="text" name="contact" value="${customers.contact}"/></td>
							</tr>
							<tr>
								<td><span>Username</span></td>
								<td><input type="text" name="username" value="${customers.username}" placeholder="Customer username"/></td>
							</tr>
							<tr>
								<td><input type="hidden" name="password" value="${customers.password}" placeholder="Customer password"/></td>
							</tr>
							<tr>
								<td></td>
								<td><input type="submit" value="submit"></td>
							</tr>
						</table>
						</form>                        
                        <!-- <a href="#menu-toggle" class="btn btn-default" id="menu-toggle">Toggle Menu</a> -->
                        <c:if test="${!empty categories}">
                        	<h4>Categories</h4>
                        	<c:forEach items="${categories}" var="category">
                        		<li>
                        			<a href="/demo/picture/form/${customers.customerid}/${category.category}"><c:out value="${category.category}"/></a>
                        		</li>
                        	</c:forEach>
                        </c:if>
                    </div>
                </div>
            </div>
        </div>
        <!-- /#page-content-wrapper -->
</div>
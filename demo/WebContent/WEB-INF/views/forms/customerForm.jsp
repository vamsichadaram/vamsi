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
						<table>
							<tr>
								<td>Name</td>
								<td><input type="text" name="name" value="${customer.name}"/></td>
							</tr>
							<tr>
								<td>Email</td>
								<td><input type="text" name="email" value="${customer.email}"/></td>
							</tr>
							<tr>
								<td>Contact</td>
								<td><input type="text" name="contact" value="${customer.contact}"/></td>
							</tr>
							<tr>
								<td></td>
								<td><input type="submit" value="submit"></td>
							</tr>
						</table>
						</form>                        
                        <!-- <a href="#menu-toggle" class="btn btn-default" id="menu-toggle">Toggle Menu</a> -->
                    </div>
                </div>
            </div>
        </div>
        <!-- /#page-content-wrapper -->
</div>
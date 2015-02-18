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
<form class="elegant-aero" action="/demo/customer/save" method="post">
							<h1>Customer Form 
						        <span>Please fill all the texts in the fields.</span>
						    </h1>
						<table>
							<tr>
								<td><span>Name</span></td>
								<td><input type="text" name="name" value="${customer.name}" placeholder="Customer name"/></td>
							</tr>
							<tr>
								<td><span>Email</span></td>
								<td><input type="text" name="email" value="${customer.email}" placeholder="Customer email"/></td>
							</tr>
							<tr>
								<td><span>Contact</span></td>
								<td><input type="text" name="contact" value="${customer.contact}" placeholder="Customer contact"/></td>
							</tr>
							<tr>
								<td><span>Username</span></td>
								<td><input type="text" name="username" value="${customer.username}" placeholder="Customer username"/></td>
							</tr>
							<tr>
								<td><span>Password</span></td>
								<td><input type="password" name="password" value="${customer.password}" placeholder="Customer password"/></td>
							</tr>
							<tr>
								<td></td>
								<td><input class="button" type="submit" value="submit"></td>
							</tr>
						</table>
						</form>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  
    pageEncoding="ISO-8859-1"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
  
<html>  
<head>  
<title>All Customers</title>
<style type="text/css">
	
</style>  
</head>  
<body>
<diV id="wrapper">
 <!-- Page Content -->
        <div id="page-content-wrapper">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12">
                        <h1>  
						List Customers</h1>  
						<h3>  
						<a href="/demo/customer/form">Add More Customers</a></h3>  
						<c:if test="${!empty customers}">  
						 
						<table align="left" border="1"> 
						<tbody>  
						<tr> 
						    <th>customer ID</th> 
						    <th>customer Name</th> 
						    <th>customer email</th> 
						    <th>customer contact</th>
						    <th>username</th> 
						    <th>status</th>
						    <th>status</th>
						    </tr>  
						<c:forEach items="${customers}" var="customer"> 
						<tr> 
						     <td><c:out value="${customer.customerid}"></c:out>
						 </td> 
						     <td><c:out value="${customer.name}"></c:out> 
						</td> 
						     <td><c:out value="${customer.email}"></c:out> 
						</td>
						      <td><c:out value="${customer.contact}"></c:out> 
						</td> 
						      <td><c:out value="${customer.username}"></c:out> 
						</td> 
						<td>
						     <c:out value="${customer.active}"></c:out></td>
						<td>
						     	<a href="<c:out value="/demo/customer/edit/${customer.customerid}"/>">view</a>
						     	<a href="<c:out value="/demo/customer/delete/${customer.customerid}"/>">delete</a>
						     </td> 
						  </tr>  
						</c:forEach>
						</tbody>
						 </table>  
						</c:if>  
                        <!-- <a href="#menu-toggle" class="btn btn-default" id="menu-toggle">Toggle Menu</a> -->
                    </div>
                </div>
            </div>
        </div>
        <!-- /#page-content-wrapper -->
      </diV>
</body>  
</html>  
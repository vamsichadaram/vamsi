<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  
    pageEncoding="ISO-8859-1"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
  
<html>  
<head>  
<title>All Customers</title>  
</head>  
<body>  
<h1>  
List Employees</h1>  
<h3>  
<a href="http://add.html/">Add More Employee</a></h3>  
<c:if test="${!empty customers}">  
 
<table align="left" border="1"> 
<tbody>  
<tr> 
    <th>customer ID</th> 
    <th>customer Name</th> 
    <th>customer email</th> 
    <th>customer contact</th> 
    <th>status</th>
    </tr>  
<c:forEach items="${customers}" var="customer"> 
<tr> 
     <td><c:out value="${customer.id}"></c:out>
 </td> 
     <td><c:out value="${customer.name}"></c:out> 
</td> 
     <td><c:out value="${customer.email}"></c:out> 
</td>
      <td><c:out value="${customer.contact}"></c:out> 
</td> 
     <td><c:out value="${customer.active}"></c:out></td> 
  </tr>  
</c:forEach>
</tbody>
 </table>  
</c:if>  
</body>  
</html>  
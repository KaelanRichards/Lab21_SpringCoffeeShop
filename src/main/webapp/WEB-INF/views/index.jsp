<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="style.css" rel="stylesheet">
<title>Kado's Koffee</title>
</head>
<body>${index }
	<h1 id="frontpg-text">Welcome to Kado's Coffee</h1>
	
	<table border="1">
		<c:forEach var="product" items="${products}">
			<tr>
				<!-- Left out title, Don't have to consume all the data  -->
				
				<td>${product.name}</td>
				<td>${product.description}</td>
				<td>${product.price}</td>

				<!--  
				<td><a href="update?id=${cust.customerID}">Update</a></td>
				<td><a href="delete?id=${cust.customerID}">Delete</a></td>
				-->
			</tr>
		</c:forEach>
	</table>
	
	
	<p>
		Click <a href=/register>here </a>to register
	</p>
	
	
</body>
</html>
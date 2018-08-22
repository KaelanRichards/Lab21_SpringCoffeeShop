<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="m"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>${register }

	<h1>Please fill out the entire form</h1>

	<form action="addnewmember">
		<fieldset>
			<legend>Personal information:</legend>
			First name:<br> <input type="text" name="firstName"><br>
			Last name:<br> <input type="text" name="lastName"><br>
			Email name:<br> <input type="email" name="email"><br>
			Phone Number: <br> <input type="tel" name="pNumber"
				placeholder="123-456-7890" required><br> Create User
			name:<br> <input type="text" name="userName"><br>
			Create password:<br> <input type="password" name="userPass"><br>
			Specify Gender: <br> <input type="radio" name="gender"
				value="male" checked>Male <br> <input type="radio"
				name="gender" value="female"> Female<br> <input
				type="radio" name="gender" value="other">Other <br> <input
				type="submit" value="Submit">
		</fieldset>

	</form>

	<table border="1">
		<m:forEach var="member" items="${Members}">
			<tr>
				<!-- Left out title, Don't have to consume all the data  -->
				<td>${member.userName}</td>
				<td>${member.email}</td>

				<!--  
				<td><a href="update?id=${cust.customerID}">Update</a></td>
				<td><a href="delete?id=${cust.customerID}">Delete</a></td>
				-->
			</tr>
		</m:forEach>
	</table>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>${register }

	<h1>Please fill out the entire form</h1>

	<form action="/adduser">
		<fieldset>
			<legend>Personal information:</legend>
			First name:<br> <input type="text" name="firstName"><br>
			Last name:<br> <input type="text" name="lastName"><br>
			Email name:<br> <input type="email" name="emailName"><br>
			Phone Number: <br> <input type="tel" name="pNumber"><br>
			Create User name:<br> <input type="text" name="userName"><br>
			Create password:<br> <input type="password" name="userPass"><br>
			Specify Gender: <br> <input type="radio" name="gender"
				value="male" checked>Male <br> <input type="radio"
				name="gender" value="female"> Female<br> <input
				type="radio" name="gender" value="other">Other <br> <input
				type="submit" value="Submit">
		</fieldset>

	</form>

</body>
</html>
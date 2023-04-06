<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>

	<h1 align="center">Register Here</h1>
	<hr>

	
		<form:form action="registration-success" mehtod="get" modelAttribute="userReg">
		
		<div align="center">
			<label>User : </label>
			<form:input path="name" />

			<br>

			<label>Name : </label>
			<form:input path="userName" />

			<br>

			<label>Password : </label>
			<form:password path="password" />

			<br>

			<label>Country : </label>
			<form:select path="country">
				<form:option value="IND">India</form:option>
				<form:option value="USA">USA</form:option>
				<form:option value="PAK">Pakistan</form:option>
				<form:option value="SRI">ShriLanka</form:option>
			</form:select>

			<br>

			<label>Hobby : </label>
		Cricket : <form:checkbox path="hobby" value="Cricket" />
		Reading : <form:checkbox path="hobby" value="Reading" />
		Travel : <form:checkbox path="hobby" value="Travel" />
		Programming : <form:checkbox path="hobby" value="Programming" />

			<br>

			<label>Gender : </label>
		Male : <form:radiobutton path="gender" value="Male" />
		Female : <form:radiobutton path="gender" value="Female" />

			<br>

			<input type="submit" value="Register">
	</div>
	</form:form>





</body>
</html>
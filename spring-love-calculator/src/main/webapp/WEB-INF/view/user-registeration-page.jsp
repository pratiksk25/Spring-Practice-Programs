<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<style type="text/css">
	.error{
		color: red;
		position: fixed;
		text-align: left;
		margin-left: 30px;
	}
</style>
<title>Registration Page</title>
</head>
<body>

	<h1 align="center">Register Here</h1>
	<hr>


	<form:form action="registration-success" mehtod="get"
		modelAttribute="userReg">

		<div align="center">
			<label>Name : </label>
			<form:input path="name" />
			<form:errors path="name" cssClass="error"/>

			<br> <label>Name : </label>
			<form:input path="userName" />

			<br> <label>Password : </label>
			<form:password path="password" />

			<br> <label>Country : </label>
			<form:select path="country">
				<form:option value="IND">India</form:option>
				<form:option value="USA">USA</form:option>
				<form:option value="PAK">Pakistan</form:option>
				<form:option value="SRI">ShriLanka</form:option>
			</form:select>

			<br> <label>Hobby : </label> Cricket :
			<form:checkbox path="hobby" value="Cricket" />
			Reading :
			<form:checkbox path="hobby" value="Reading" />
			Travel :
			<form:checkbox path="hobby" value="Travel" />
			Programming :
			<form:checkbox path="hobby" value="Programming" />

			<br> <label>Gender : </label> Male :
			<form:radiobutton path="gender" value="Male" />
			Female :
			<form:radiobutton path="gender" value="Female" />

			<br>
			
			<label>Age : </label>
			<form:input path="age"/>
			<form:errors path="age" cssClass="error"/>
			
			<br>

			<div align="center">
				<h3>Communication :</h3>

				<label>Email : </label>
				<form:input path="communicationDTO.email" />

				<label>Phone : </label>
				<form:input path="communicationDTO.phone" />
			</div>


			<br> <input type="submit" value="Register">
		</div>
	</form:form>





</body>
</html>
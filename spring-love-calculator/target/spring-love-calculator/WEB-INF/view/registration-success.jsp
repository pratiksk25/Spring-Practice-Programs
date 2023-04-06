<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>registration success page</title>
</head>
<body>

	<h1>Registration Successfull</h1>

	<h2>Details Entered by User :</h2>
	User : ${userReg.name}
	<br> UserName : ${userReg.userName}
	<br> Password : ${userReg.password}
	<br> Country : ${userReg.country}
	<br>

	Hobbies :
	<br>
	<c:forEach var="temp" items="${userReg.hobby}">
		${temp}
	<br>
	</c:forEach>

	Gender : ${userReg.gender}
	<br>


</body>
</html>
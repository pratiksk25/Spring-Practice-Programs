<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Love Calculator</title>

<style type="text/css">
	.error{
		color: red;
		position: fixed;
		text-align: left;
		margin-left: 30px;
	}
	
	
</style>


<script type="text/javascript">
	
function validateUserName(){
	
	var userName = document.getElementById("yn").value;
	var crushName = document.getElementById("cn").value;
	
	if(userName.length < 3){
		alert("Your Name should have atleast 3 char!")
		return false;
	}else if(crushName.length < 3){
		alert("Crush Name should have atleast 3 char!")
		return false;
	}else{
		return true;
	}
	
}
	
</script>

</head>
<body>
	<h1 align="center">Love Calculator</h1><hr>
	<form:form action="process-homepage" method="get" modelAttribute="userInfo" <%-- onsubmit="return validateUserName() --%>">
		<div align="center">
			<p>
				<label for="yn">Your Name :</label> <form:input path="userName"
					placeholder="Your Name" id="yn" />
					<form:errors path="userName" cssClass="error"></form:errors>
			</p>

			<p>
				<label for="cn">Crush Name :</label> <form:input path="crushName"
					placeholder="crush name" id="cn" />
					<form:errors path="crushName" cssClass="error"></form:errors>
			</p>
			
			<p>
				<form:checkbox path="termAndCondition" id="check"/>
				<label>Agree! This is for fun...</label>
			</p>
			
			<input type="submit" value="Calculate" />
		</div>
	</form:form>
</body>
</html>
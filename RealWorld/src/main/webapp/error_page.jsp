<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isErrorPage="true" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sorry soething went wrong.</title>

<!-- css -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<style>
	.banner-background{
		clip-path: polygon(0 0, 51% 4%, 100% 0, 96% 56%, 100% 100%, 51% 95%, 0 100%, 3% 54%);


	}
</style>


</head>
<body>
	<div class="container text-center">
		<img alt="error" src="img/error.png" class="img-fluid">
		<h3 class="display-3">Sorry! Something went Wrong....</h3>
		<%= exception%>
		<a class="btn primary-background btn-lg text-white mt-3" href="index.jsp">Home</a>
	</div>
	
	
	
	
	
</body>
</html>
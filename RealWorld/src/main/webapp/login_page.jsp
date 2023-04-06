<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>

<!-- css -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<style>
.banner-background {
			clip-path: polygon(0 0, 51% 4%, 100% 0, 96% 56%, 100% 100%, 51% 95%, 0 100%, 3% 54%);

}
</style>


</head>
<body>
	<!-- Nav Bar -->
	<%@include file="normal_navbar.jsp" %>
	<br><br>
	

	<main class="d-flex align-items-center primary-background banner-background" style="height: 80vh">
		<div class="container">
			<div class=" row">
				<div class="col-md-4 offset-md-4">
					<div class="card">
						<div class="card-header primary-background text-white text-center">
						<br>
							
							<span class="fa fa-user-plus fa-3x"></span>
						
							<p>Login here</p>
						</div>
						<div class="card-body">

							<form action="log" method="post">
								<div class="form-group">
									<label for="exampleInputEmail1">Email address</label> 
									<input name = "email" required
										type="email" class="form-control" id="exampleInputEmail1"
										aria-describedby="emailHelp" placeholder="Enter email">
									<small id="emailHelp" class="form-text text-muted">We'll
										never share your email with anyone else.</small>
								</div>
								<div class="form-group">
									<label for="exampleInputPassword1">Password</label> 
									<input name="password" required
										type="password" class="form-control"
										id="exampleInputPassword1" placeholder="Password">
								</div>
								<div class="container text-center">
									<button type="submit" class="btn btn-primary">Login</button>
									<a href="register_page.jsp" type="submit" class="btn btn-primary mt-2">Register</a>
								</div>
							</form>

						</div>
					</div>
				</div>
			</div>
		</div>
	</main>


	<!-- JavaScript -->
	<script src="https://code.jquery.com/jquery-3.6.4.min.js"
		integrity="sha256-oP6HI9z1XaZNBrJURtCoUT5SUnxFr8s3BzRl+cbzUq8="
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
	<script type="text/javascript" src="JS/myjs.js"></script>

</body>
</html>
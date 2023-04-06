<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>

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
	clip-path: polygon(0 0, 51% 4%, 100% 0, 96% 56%, 100% 100%, 51% 95%, 0 100%, 3% 54%
		);
}
</style>

</head>
<body>

	<%@include file="normal_navbar.jsp"%>

	<main class="primary-background p-5 banner-background">
		<div class="container">

			<div class="col-md-6 offset-md-3 pt-5">

				<div class="card ">
					<div class="card-header text-center primary-background text-white">
						<span class="fa fa-3x fa-user-circle"></span> <br>
						<p>Register Here</p>

					</div>
					<div class="card-body">
						<form id="reg-form" action="RegisterServlet" method="post">
							<div class="form-group">
								<label for="user_name">User Name</label> <input name="user_name"
									type="text" class="form-control" id="user_name"
									aria-describedby="emailHelp" placeholder="Enter User Name">

							</div>

							<div class="form-group">
								<label for="exampleInputEmail1">Email address</label> <input
									name="user_email" type="email" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp"
									placeholder="Enter email"> <small id="emailHelp"
									class="form-text text-muted">We'll never share your
									email with anyone else.</small>
							</div>

							<div class="form-group">
								<label for="exampleInputPassword1">Password</label> <input
									name="user_password" type="password" class="form-control"
									id="exampleInputPassword1" placeholder="Password">
							</div>

							<div class="form-group">
								<label for="gender">Select Gender</label> <br> <input
									type="radio" value="male" id="gender" name="gender">Male
								<input type="radio" value="female" id="gender" name="gender">Female
							</div>

							<div class="from-group">
								<textarea name="about" class="from-control" id="" cols="40"
									rows="5"
									placeholder="Enter some skill that you know technically"> </textarea>
							</div>


							<div class="form-check">
								<input type="checkbox" class="form-check-input" name="check"
									id="exampleCheck1"> <label class="form-check-label"
									for="exampleCheck1">Terms and Conditions.</label>
							</div>
							<br>
							<div class="container text-center" style="display: none;">
								<span class="fa fa-refresh fa-spin" fa-4x></span>
								<h4>Please Wait...</h4>
							</div>
							<button id="submit-btn" type="submit" class="btn btn-primary">Submit</button>
						</form>
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
	<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>

	<script type="text/javascript">
		$(document).ready(function() {
			console.log('loaded...');

			$('#reg-form').on('submit', function(event) {
				event.preventDefault();

				let form = new FormData(this);

				$('#submit-btn').hide();
				$('#loader').show();

				//send register servlet
				$.ajax({
					url : "RegisterServlet",
					type : 'POST',
					data : form,
					success : function(data, textStatus, jqXHR) {
						console.log(data);
						
						$('#submit-btn').show();
						$('#loader').hide();
						
						if(data.trim() === 'Done' || data.trim() === 'done')
						{
							console.log(data);
							//sweet alert
							swal("Success.")
								.then((value) => {
								  window.location="login_page.jsp"
							});
						}else{
							swal(data);
						}
					},
					error : function(jqXHR, textStatus, errorThrown) {
						$('#submit-btn').show();
						$('#loader').hide();
						
						
						swal("Error.");
						
					},
					processData : false,
					contentType : false
				});

			});

		});
	</script>

</body>
</html>
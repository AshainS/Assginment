<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>

<link rel="stylesheet" href="./StyleSheets/Register.css">

</head>
<body style="background-image: url(./images/school.jpg)">


	<div class="register">
		<form action="RegisterServlet" method="post">
			<h1>Register Now</h1>
			<div class="input-box">
				<input type="text" name="username" placeholder="Username"
					required="required"> <img src="./images/usr.png">

			</div>
			<div class="input-box">
				<input type="password" name="password" placeholder="Password"
					required="required"> <img src="./images/pass.png">
			</div>
			<div class="input-box">
				<input type="password" name="confirmPassword" placeholder="Confirm Password"
					required="required"> <img src="./images/pass.png">
			</div>

			<button type="submit" class="btn">Sign Up</button>
			
			<div class="login-link">
				<p>
					Already have an account? <a href="Login.jsp">Login</a>
				</p>
			</div>

		
		</form>
	</div>

</body>
</html>
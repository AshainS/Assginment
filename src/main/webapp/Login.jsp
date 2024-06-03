<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" href="./StyleSheets/Login.css">

</head>


<body style="background-image: url(./images/school.jpg)">


	<%
		
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		
		response.setHeader("Pragma", "no-cache");
		
		response.setHeader("Expires", "0");
		
	
	%>

	
	<div class="login">
		<form action="LoginServlet" method="post">
		
			<h1>Login Page</h1>
			
			<div class="input-box">
				<input type="text" name="username" placeholder="Username"
					required="required"> <img src="./images/usr.png">
			</div>
			<div class="input-box">
				<input type="password" name="password" placeholder="Password"
					required="required"> <img src="./images/pass.png">
			</div>
			<div class="remember-forgot">
				<label><input type="checkbox"> Remember me</label> <a
					href="#">Forgot Password</a>
			</div>

			<button type="submit" class="btn">Login</button>

			<div class="register-link">
				<p>
					Don't have an account? <a href="Register.jsp">Register</a>
				</p>
			</div>

		</form>
	</div>

</body>
</html>
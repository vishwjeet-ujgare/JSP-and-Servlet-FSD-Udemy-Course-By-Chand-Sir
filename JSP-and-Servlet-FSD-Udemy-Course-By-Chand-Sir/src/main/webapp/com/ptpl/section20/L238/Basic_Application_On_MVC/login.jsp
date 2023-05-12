<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%><!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<style>
#header {
	text-align: center;
}

.form-container {
	margin: 0 auto;
	width: 50%;
	text-align: center;
}
</style>
</head>
<body>
	<h1 id="header">Login Here</h1>
	<div class="form-container">

		<form>
			<label for="username">Username:</label> <input type="text"
				id="username" name="username" required><br> <label
				for="password">Password:</label> <input type="password"
				id="password" name="password" required><br> 
				

		</form>

		<a href="<%=request.getContextPath()%>/Controller?page=L238-logedIn"><button>LogIn</button></a>
		<p>
			Don't have an account? <a
				href="<%=request.getContextPath()%>/Controller?page=L238-signUp">Sign
				up here</a>
		</p>
		<p>
			Learn more about us <a
				href="<%=request.getContextPath()%>/Controller?page=L238-about"">here</a>
		</p>
	</div>


</body>
</html>

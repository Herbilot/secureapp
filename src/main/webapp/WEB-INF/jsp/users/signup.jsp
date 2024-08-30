<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Sign Up</title>
<link rel="stylesheet" type="text/css" href="./public/f.css">
<link
	href="https://fonts.googleapis.com/css2?family=Jost:wght@500&display=swap"
	rel="stylesheet">
</head>
<body>
	<div class="main">
		<input type="checkbox" id="chk" aria-hidden="true">
		<div class="signup">
			<form action="signup" method="post">
				<label for="chk" aria-hidden="true">Sign up</label> 
				<input	type="text" name="firstName" placeholder="First name" required="">
				<input	type="text" name="lastName" placeholder="Last name" required="">
				<input type="email" name="email" placeholder="Email" required="">
				<input type="password" name="password"
					placeholder="Password" required="">
				<button>Sign up</button>
			</form>
		</div>
	</div>
</body>
</html>
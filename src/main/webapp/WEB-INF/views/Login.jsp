<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="UTF-8">
<title>login</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<style type="text/css">
.bs-example {
	margin: 20px;
}
/* Fix alignment issue of label on extra small devices in Bootstrap 3.2 */
.form-horizontal .control-label {
	padding-top: 7px;
}
</style>
</head>
<body>
	<div class="bs-example">

		<form class="form-horizontal" action='<c:url value="/home/login"></c:url>' method="POST">
			<div class="form-group">
				<h1>Login page</h1>
			</div>
			<div class="form-group">
				<label for="name" class="control-label col-xs-2">UserName</label>
				<div class="col-xs-5">
					<input type="text" name="name" class="form-control" id="Name"
						placeholder="UserName">
				</div>
			</div>
			<div class="form-group">
				<label for="password" class="control-label col-xs-2">Password</label>
				<div class="col-xs-5">
					<input type="password" name="password" class="form-control"
						id="pwd" placeholder="Enter Password">
				</div>
			</div>

			<div class="form-group">
				<div class="col-xs-offset-2 col-xs-10">
					<button type="submit" class="btn btn-primary">Login</button>
				</div>
			</div>

			<div class="col-xs-offset-2 col-xs-10">
				<a href="home/register">Register</a> <a href="home/updte">ForgotPassword</a>
			</div>
			<!-- </div> -->
		</form>
	</div>
</body>
</html>

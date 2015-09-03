<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container" align="left">

		<h2>Registration </h2>
		
		<form class="form-horizontal" role="form" action='<c:url value="/home/insert"></c:url>' method="post">
 
			<div class="form-group">
				<label  for="name">UserName</label>
				<input type="text" name="name" class="form-control" id="Name" placeholder="UserName">
			</div>
			<div class="form-group">
				<label for="password">Password</label>
				<input type="password" name="password" class="form-control" id="pwd" placeholder="Enter Password">
			</div>

			<div class="form-group">
				<label for="mailid">EmailAddress</label>
					<input type="email" name="mailid" class="form-control" id="emailaddress" placeholder="Enter EmailAddress">
			</div>

			<div class="form-group">
				<label for="address">Address</label>
					<input type="text" name="address" class="form-control" id="Address" placeholder="Enter Address">
			</div>
			
			<div class="form-group">
				<label for="contactno">ContactNo</label>
					<input type="number" name="contactno" class="form-control" id="number" placeholder="contactnumber">
			</div>

			<div class="form-group">
				<div class="col-sm-offset-1 col-sm-10">
					<button type="submit" class="btn btn-primary">Register</button>
			</div>
		</form> 
	</div>


</body>
</html>
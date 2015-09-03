<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type='text/javascript' src='http://code.jquery.com/jquery-1.8.3.js'></script>
<script type='text/javascript' src="http://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/2.1.0/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.3.0/css/bootstrap-combined.min.css">
</head>
</head>
<body>
	<div class="container" >
		<form action='<c:url value="home/login"></c:url>' method="get">
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>UserName</th>
					<th>Password</th>
					<th>Email</th>
					<th>Address</th>
					<th>ContactNo</th>
				</tr>
			</thead>
			<tbody>
				
					<tr>
						<td>${user.name}</td>
						<td>${user.password}</td>
						<td>${user.mailid }</td>
						<td>${user.address}</td>
						<td>${user.contactno}</td>
				
					</tr>
			
			</tbody>

		</table>
</form>
	</div>

</body>
</html>
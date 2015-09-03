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
		<form action='<c:url value="home/userlist"></c:url>' method="get">
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>UserId</th>
					<th>UserName</th>
					<th>Password</th>
					<th>Email</th>
					<th>Address</th>
					<th>ContactNo</th>
					<th>Action</th>
				
				</tr>
			</thead>
			<tbody>
				<c:forEach var="list" items="${userList}">
					<tr>
						<td>${list.userid}</td>
						<td>${list.name}</td>
						<td>${list.password}</td>
						<td>${list.mailid }</td>
						<td>${list.address}</td>
						<td>${list.contactno}</td>
						                
						  <td>
					
						 <a href='<c:url value="/home/performselect"></c:url>?id=${list.userid}'>Update</a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="delete?id=${list.userid}">Delete</a>
                    </td>  
                  </tr>
				</c:forEach>
			</tbody>

		</table>
</form>
	</div>

</body>
</html>
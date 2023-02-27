<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
<script

	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
	crossorigin="anonymous"></script>
</head>
<body  style="color:blue">
<nav class="navbar navbar-light bg-dark">
		<div class="container-fluid">
		
			<a class="navbar-brand" href="#"> <img
				src=" C:\Users\91821\Downloads\photo-1429041966141-44d228a42775.jpeg
"
				alt="" width="85" height="50" class="d-inline-block align text-top">
			</a> <a href="index.jsp">Home</a>
		</div>
	</nav>
	<h2>Welcome to Bridge Search</h2>
	
	<h3>
	<span style="color: red;">${message}</span>
	</h3>
	
	<form action="bridgeSearch" method="get">
	<pre>
	Search by Id<input type="text" name="id" value="${dto.id}"/>
	<input type="submit" value="Search" class="btn btn-secondary"/>
	</pre>
	</form>
	
	<div>
	<h3>Search Results...</h3>
	Name:${dto.name}</br>
	Cost:${dto.cost}</br>
	Type:${dto.type}</br>
	Location:${dto.location}</br>
	NoOfWorkers:${dto.noOfWorkers}</br>
	</div>
	
	
	
	
	
	


</body>
</html>
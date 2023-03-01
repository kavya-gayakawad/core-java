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
				src=" C:\Users\91821\Downloads\photo-1429041966141-44d228a42775.jpeg"

				alt="" width="85" height="50" class="d-inline-block align text-top">
			</a> <a href="index.jsp">Home</a>
		</div>
	</nav>
	<h2>Welcome to Bridge Name Search</h2>
	
	<h3>
	<span style="color: red;">${message}</span>
	</h3>
	
	<form action="searchbyname" method="get">
	<pre>
	Search by Name<input type="text" name="name"/>
	<input type="submit" value="Search" class="btn btn-secondary"/>
	</pre>
	</form>
	<div>
	
	<table border="1">
	<tr>
	<th>ID</th>
	<th>Name</th>
	<th>Type</th>
	<th>Cost</th>
	<th>Location</th>
	<th>NoOfWorkers</th>
	</tr>
	
	<c:forEach items="${list}" var="t">
	<tr>
	<h3>Search Results...</h3>
	<td>${t.id}</td>
	<td>   ${t.name}</td>
	<td>     ${t.cost}</td>
	<td>  ${t.type}</td>
	<td>  ${t.location}</td>
	<td>    ${t.noOfWorkers}</td>
	</tr>
    </c:forEach>
	
	</table>
	</div>
	
	
	
	
	
	




</body>
</html>
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
	<h2>Welcome to Bridge save data.. </h2>
	<c:forEach items="${error}" var="e">
	<span style="color:red">;${e.message}</span><br>
	</c:forEach>
	
	<form action="bridge" method="post">
	<pre>
	
	Name    <input type="text" name="name" value="${dto.name}"/>
	Cost    <input type="text" name="cost" value="${dto.cost}"/>
	NoOfWorkers<input type="text" name="noOfWorkers" value="${dto.noOfWorkers}"/>
	
	Types   <select name="type">
	<option value="">Select</option>
	<c:forEach items="${types}" var="t">
	<option value="${t}">${t}</option>
	</c:forEach>
	</select>
	
	Locations<select name="location">
	<option value="">Select</option>
	<c:forEach items="${locations}" var="l">
	<option value="${l}">${l}</option>
	</c:forEach>
	</select>
	</pre>
	
	<input type="submit" value="Save" class="btn btn-secondary"/>
	
	
	</form>
	
	
	
		



</body>
</html>
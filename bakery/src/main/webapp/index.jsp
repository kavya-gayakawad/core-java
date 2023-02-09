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

	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
	crossorigin="anonymous"></script>
</head>
<body  style="color:blue">
<nav class="navbar navbar-light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <img
				src=" https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" width="85" height="50" class="d-inline-block align text-top">
			</a> <a href="display.jsp">Home Page</a>
		</div>
	</nav>
	
<h3>Save Details of Bakery</h3>
<form  style='color:red' action="bakery" method="get">

Bakery Name	           <input type="text"  name="bakeryName"/><br>
Bakery Owner Name      <input type="text"  name="bakeryOwnerName"/><br>
Bakery Owner WifeName  <input type="text"  name="bakeryOwnerWifeName"/><br>
Bakery Owner Married
yes                    <input type="radio" value="yes"  name="bakeryOwnerMarride"/><br>
No                     <input type="radio" value="no" name="bakeryOwnerMarride"/><br>
Bakery Famous for      <textarea rows="5" cols="25"  name="bakeryFamousFor"></textarea><br> 
Bakery Since           <input type="number"  name="bakerySince"/><br>

		<button style='color:green'type="submit" class="btn btn-success">SAVE</button><br> 
		
		
	</form>
</body>
</html>


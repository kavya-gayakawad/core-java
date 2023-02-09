<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
				alt="" width="80" height="48" class="d-inline-block align text-top">
			</a> <a href="index.jsp">Home Page</a>
		</div>
	</nav>
	
	<h3>Display Bakery details: </h3>
	<form  style='color:red' action="bakery" method="get">
	
		<label>Bakery name:          ${bdto.bakeryName}</label><br>
		<label>Bakery Owner Name:    ${bdto.bakeryOwnerName}</label><br> 
		<label>Bakery Owner WifeName:${bdto.bakeryOwnerWifeName}</label><br>
		<label>Bakery Owner Married: ${bdto.bakeryOwnerMarride}</label><br> 
		<label>Bakery Famous for :   ${bdto.bakeryFamousFor}</label><br>
		<label>Bakery Since :        ${bdto.bakerySince}</label><br>



</body>
</html>
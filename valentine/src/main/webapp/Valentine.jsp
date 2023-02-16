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
			</a> <a href="index.jsp">Home Page</a>
		</div>
	</nav>
	<h1>Welcome to Valentine data saving..</h1>
	<c:forEach items="${errors}" var="e">
	<span style="color:red;">${e.message}</span><br>
	</c:forEach>
	
	<form action="valentine" method ="post">
	<Pre>
	Name<input type="text" name="name" value="${dto.name}"/>
	Valentine Name <input type="text" name="valentineName" value="${dto.valentineName}"/>
	
	Places<select name="place">
	<option value="${dto.place}">SELECT</option>
	<c:forEach items="${places}" var="p">
	<option value="${p}">${p}</option>
	</c:forEach>
	</select>
	
	gifts<select name="gift">
	<option value="">SELECT</option>
	<c:forEach items="${gifts}" var="g">
	<option value="${g}">${g}</option>
	</c:forEach>
	</select>
	
	<input type="submit" value="Save"/>
	
	
	</Pre>
	
</form>
</body>
</html>
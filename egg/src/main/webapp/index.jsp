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
			</a> <a href="Egg.jsp">Home Page</a>
		</div>
	</nav>
	<h1>Welcome to Egg Application</h1>
	<form action="egg" method ="get">
	<Pre>
	HotelName<input type="text" name="hotelName"/>
	Egg Dish Name <select name="dishName">
	<option>select</option>
	<option>Omlet</option>
	<option>Egg-Rice</option>
	<option>Half Boil</option>
	<option>Egg Burge</option>
	<option>Egg Puff</option>
	<option>Egg Masala</option>
	<option>Egg Bonda</option>
	<option>Egg Chilli</option>
	<option>Egg Maggie</option>
	</select>
	
	Egg Type<select name="type">
	<option>Select</option>
	<option>Nati</option>
	<option>Farm</option>
	<option>Boiler</option>
	<option>Duck</option>
	<option>Ostrich</option>
	</select>
	
	Price <input type="text" name="price"/>
	Quantity <select name="quantity">
	<option>Select</option>
	<option>1</option>
	<option>2</option>
	<option>3</option>
	<option>4</option>
	<option>5</option>
	<option>6</option>
    <option>7</option>
	<option>8</option>
	<option>9</option>
	<option>10</option>
    </select>
     
    Take Away Yes: <input type="radio" value="true"	name="takeAway"/>
	           No: <input type="radio" value="false"name="takeAway"/>
	           
	<input type="submit" value="Order" class="btn btn-primary"/>
    </Pre>
    </form>
	

</body>
</html>
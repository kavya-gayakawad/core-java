<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>


<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
 rel="stylesheet" 
 integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
  crossorigin="anonymous">
 
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" 
 integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
  crossorigin="anonymous"></script>
 
</head>
<body  style="color:blue">
<nav class="navbar navbar-light bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#"> <img
    src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
    alt="" width="85" height="50" class="d-inline-block align-text-top">
    </a>
</div>
</nav>


	<form action="takeEmail" method="get">
		<h5>Display Email:${email}</h5>
		<input type="submit" value="getEmail">
	</form>
	<form action="takeMobile" method="get">
		<h5>Display Mobile No:${mobile}</h5>
		<input type="submit" value="getMobileNo">
	</form>
	<form action="takeAdhar" method="get">
		<h5>Display Adhar No:${adhar}</h5>
		<input type="submit" value="getAdharNo">
	</form>
	<form action="takeAge" method="get">
		<h5>Display Age:${age}</h5>
		<input type="submit" value="getAge">
	</form>
	<form action="takeDob" method="get">
		<h5>Display Date of Birth:${birth}</h5>
		<input type="submit" value="getDATEOFBIRTH">
	</form>
	<form action="takeDS" method="get">
		<h5>Display Desired Salary:${salary}</h5>
		<input type="submit" value="get Desired Salary">
	</form>

	<form action="takeBestFriendsList" method="get">
		<h5>Display BestFriendsList</h5>
		<input type="submit" value="get Best Friends List" />
		<ul>
			<c:forEach items="${bfl}" var="items">
				<li>${items}</li>
			</c:forEach>
		</ul>
	</form>
	<form action="takeMVP" method="get">
		<h5>Display Most visited places</h5>
		<input type="submit" value="get Most visited places" />
		<ul>
			<c:forEach items="${mvp}" var="items">
				<li>${items}</li>
			</c:forEach>
		</ul>
	</form>
	<form action="takeSkillSet" method="get">
		<h5>Display Skills</h5>
		<input type="submit" value="get Skill sets" />
		<ul>
			<c:forEach items="${skills}" var="items">
				<li>${items}</li>
			</c:forEach>
		</ul>
	</form>
	<form action="takeEdto" method="get">
		<h5>Display Education details:</h5>
		<input type="submit" value="get Education details" /> <br> <label>schoolName:
			${edto.schoolName}</label><br> <label>hmName: ${edto.hmName}</label><br>
		<label>place: ${edto.place}</label><br> <label>district:
			${edto.district}</label><br> <label>taluk: ${edto.taluk}</label><br>
		<label>state: ${edto.state}</label><br> <label>noOfClasses:
			${edto.noOfClasses}</label><br> <label>noOfTeachers:
			${edto.noOfTeachers}</label><br> <label>noOfBusses:
			${edto.noOfBusses}</label><br> <label>noOfStudents:
			${edto.noOfStudents}</label><br>
	</form>
		<form action="takeFamily" method="get">
		<h5>Display Family details:</h5>
		<input type="submit" value="get Family details" /> <br> 
		<label>Family lives in: ${fdto.familyLives}</label><br>
		<label>Name: ${fdto.name}</label><br> 
		<label>FamilyName: ${fdto.familyName}</label><br>
		<label>Father Name: ${fdto.fatherName}</label><br>
		<label>Mother name: ${fdto.motherName}</label><br> 
		 <label>Total Family members: ${fdto.totalMembers}</label><br> 
		 <label>ColonyName:${fdto.colonyName}</label><br>
		 <label>State: ${fdto.state}</label><br>
		 <label>Indian: ${fdto.indian}</label><br>
		 <label>Siblings:${fdto.siblings}</label><br>
	</form>
			<form action="takeMobileInfo" method="get">
		<h5>Display Mobile details:</h5>
		<input type="submit" value="get Mobile details" /> <br> 
		<label>Mobile model: ${mdto.model}</label><br>
		<label>Mobile price: ${mdto.price}</label><br> 
		<label>Mobile number: ${mdto.number}</label><br>
		<label>Mobile storage: ${mdto.storage} gb</label><br> 
		<label>Camera mp : ${mdto.camera}mp</label><br>
	</form>
	<form action="takeBeverage" method="get">
		<h5>Display Beverages list:</h5>
		<input type="submit" value="get Beverage List" /> <br> <label>1
			: ${bdto.juice1}</label><br> <label>2 : ${bdto.juice2}</label><br>
		<label>3 : ${bdto.juice3}</label><br> <label>4 :
			${bdto.juice4}</label><br> <label>5 : ${bdto.juice5}</label><br> <label>6
			: ${bdto.juice6}</label><br> <label>7 : ${bdto.juice7}</label><br>
		<label>8 : ${bdto.juice8}</label><br>
	</form>
	<form action="takeChata" method="get">
		<h5>Display Chat list:</h5>
		<input type="submit" value="get Chata List" /> <br> 
		<label>1 : ${cdto.chat1}</label><br>
		<label>2 : ${cdto.chat2}</label><br> 
		<label>3 : ${cdto.chat3}</label><br>
		<label>4 : ${cdto.chat4}</label><br> 
		<label>5 : ${cdto.chat5}</label><br>
		<label>6 : ${cdto.chat6}</label><br>
		<label>7 : ${cdto.chat7}</label><br>
		<label>8 : ${cdto.chat8}</label><br>
		<label>9 : ${cdto.chat9}</label><br>
		<label>10 : ${cdto.chat10}</label><br>
		<label>11 : ${cdto.chat11}</label><br>
	</form>
	</body>
	</html>
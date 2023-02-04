<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
    <a href="index.jsp">home</a>
    </div>
    </nav>
    
    <h1>Welcome To Beach</h1>
    <form action="touch" method="post">
    <pre>
    Name     <input type="text" name="name"/>
    Location <input type="text" name="location"/>
    Clean yes<input type="radio" name="clean" value="true"/>
    Clean No <input type="radio" name="clean" value="false"/>
    Game     <input type="text" name="game"/>
    
    <input type="submit" value="beach" class="btn btn-primiary"/>
    
    </pre>
    </form>



</body>
</html>
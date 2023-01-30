<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
</head>
<body>
<h1>Send Details</h1>

<form action="sms"  method="post">
<pre>

First Name   <input type="text" name="fName"/>
Last Name    <input type="text" name="lName"/>
Gender male  <input type="radio" name="gender" value="male"/>
       female<input type="radio" name="gender" value="female"/>
       others<input type="radio" name="gender" value="others"/>
Reason       <textarea rows="5" cols="30" name="reason"></textarea>

Address      <textarea rows="5" cols="25" name="address"></textarea>

<input type="submit" value="send"/>
</pre>
</form>




</body>
</html>
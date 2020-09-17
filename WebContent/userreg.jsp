<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<div><p><strong>User Registration</strong></p> </div> 
<form action="uregservlet" method="post">

<table style="border: thick; border-color: black;">
<tr><td>
<input type="text" name="uname"><sub>  User Name</sub><br>
</td></tr>
<tr><td>
<input type="email" name="uemail"><sub>  Email</sub><br>
</td></tr>
<tr><td>
<input type="number" name="umobile"><sub>  Mobile Number</sub><br>
</td></tr>
<tr><td>
<input type="text" name="uaddress"><sub>  Address</sub><br>
</td></tr>
<tr><td>
<input type="password" name="upass"><sub>  password</sub><br>
</td></tr>
<tr><td>
<input type="password" name="urpass"><sub>  Re-enter password</sub><br>
</td><tr>
<tr><td>
<input type="submit" value="Register">
</td></tr>
</table>

</form>
</center>
</body>
</html>
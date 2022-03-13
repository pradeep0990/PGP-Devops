<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<form action="/practise/registration" method="post">
<table>
<tr><td>Username:</td><td><input type="text" name="Username" placeholder="Enter your Name"></input></td></tr>
<tr><td>Password:</td><td><input type="password"name="Userpassword" minlength=8 placeholder="Enter your Password"></input></td></tr>
<tr><td>Confirm Password:</td><td><input type="text"name="confirmPassword" minlength=8 placeholder="Confirm your Password"></input></td></tr>
<tr><td>Email:</td><td><input type="email"name="Email" placeholder="Enter your Email"></input></td></tr>
<tr><td>Mobile Number:</td><td><input type="tel"name="Phno" placeholder="Enter your mobile number" minlength=10 maxlength=10></input></td></tr>
<tr><td>Room Name:</td><td><input type="text"name="room" placeholder="Enter your room name"></input></td></tr>
<tr colspan=2><td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<button type="submit" >Register</button></td></tr>
</table>
</form>	
<h4><span style="color:red"><%String error=(String)request.getAttribute("Message"); 
if(error!=null)
out.print(error);%></h4>
</center>
</body>
</html>
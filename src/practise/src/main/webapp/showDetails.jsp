<%@page import="com.practise.model.Account"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello 
<%
Account acc=(Account)request.getAttribute("account");%><br>
Name is <% out.print(acc.getUserName());%><br>
Amount invested=<%out.print(acc.getCumAmountInvested()); %><br>
Amount Debt=<% out.print(acc.getCumAmountDebt());%><br>
Contact=<%out.print(acc.getPhno());%><br>
Room Name=<%out.print(acc.getRoom_Name()); %>
</h1>
</body>
</html>
<%@page import="com.cjc.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<center><h3>Edit the Information yo want to update </h3></center>
<title>Edit Page</title>
</head>
<body bgcolor="pink">
<form action="edit">
<center>
<table border="1">
<%
 	Student u=(Student)request.getAttribute("data");
%>
<tr><td>UserId</td><td><input type="text"   name="ui" value=<%=u.getUi()%>></td></tr>
<tr><td>Name</td><td><input type="text"  name="name"  value=<%=u.getName()%>></td></tr>
<tr><td>Address</td><td><input type="text" name="addr" value=<%=u.getAddr()%>></td></tr>
<tr><td>Email</td><td><input type="text" name="email" value=<%=u.getEmail()%>></td></tr>
<tr><td>Username</td><td><input type="text" name="una" value=<%=u.getUna() %>></td></tr>
<tr><td>Password</td><td><input type="text" name="upas" value=<%=u.getUpas() %>></td></tr>
</table>
<br>
<table border="1">

<tr><td><center><input type="submit" value="Update"></center></td></tr>

</table>
</center>
</form>


</body>
</html>
<%@page import="com.cjc.model.Student"%>
<%@page import="java.util.ArrayList"%>

<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">

	function editu() 
	{
		alert("editing data...");
		document.success.action="edt";
		document.success.submit();
	}
	
	function del()
	{
		alert("deleting data...");
		document.success.action="dl";
		document.success.submit();
	}
	
	function uad()
	{
		alert("Adding Record...");
		document.success.action="adl";
		document.success.submit();
	}
	
	function logo()
	{
		alert("Logout the page");
		document.success.action="logout";
		document.success.submit();
	}
	
	function printPage()
	{
		alert("Generating Pdf...!");
		document.success.action="pdfgen";
		document.success.submit();
	}


</script> 

<center>
	<h1>Welcome to Success Page</h1>
</center>
<title>Success Page</title>
</head>
<body bgcolor="pink">
	<div align="center">
		<form name="success">
			<table border="1">
				<caption>

					<h2>List Of Student</h2>

				</caption>


				<tr>
					<th>Select</th>
					<th>Uid</th>
					<th>Name</th>
					<th>Address</th>
					<th>Email</th>
					<th>Username</th>
					<th>Password</th>
				</tr>


				<%
				List<Student> l = new ArrayList();
				%>
				<%
				l =(List<Student>)request.getAttribute("list");
				%>
				<%
				for(Student s:l){
				%>
				
				<tr>
					<td><input type="radio" value=<%=s.getUi()%> name="rid"></td>
					<td><%=s.getUi()%>
					<td><%=s.getName()%></td>
					<td><%=s.getAddr()%></td>
					<td><%=s.getEmail()%></td>
					<td><%=s.getUna()%></td>
					<td><%=s.getUpas()%></td>
				</tr>

				<%
				}
				%>


			</table>
			<br>
			<input type="button" value="Edit" onclick="editu()" /> 
			<input type="button" value="Delete" onclick="del()" /> 
			<input type="button" value="Add" onclick="uad()" />
			<input type="button" value="LogOut" onclick="logo()" />
			<input type="button" value="Print" onclick="printPage()" />

		</form>
	</div>
</body>
</html>
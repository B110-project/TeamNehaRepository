<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="">
<input type="text" name="loanAmount" placeholder="Please enter loan amount">
<br>
<input type="text" name="tenure" placeholder="Please enter Tenure">
<br>
<input type="button" value="Calculate">
<br>
<input type="text" name="loanAmount" value="{$loan.getRateOfInterest}">
<br>
<input type="text" name="tenure" placeholder="Please enter Tenure">

</form>
</body>
</html>
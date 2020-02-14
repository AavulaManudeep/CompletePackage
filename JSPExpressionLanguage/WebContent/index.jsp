<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="EmployeeServelet" method="post">
FirstName:<input type="text" name="fname" placeholder="FirstName"><br>
LastName:<input type="text" name="lname" placeholder="lastName"><br>
EmployeeId:<input type="text" name="empId" placeholder="EmployeeId"><br>
Email_Id:<input type="text" name="email_id" placeholder="example@email.com"><br>
HourlyPay:<input type="text" name="hourlypay" placeholder="HourlyPay"><br>
HoursWorked:<input type="text" name="hoursworked" placeholder="HoursWorked"><br>
<input type="submit" name="go" value="Submit" style="margin-right:50px">
<input type="reset" name="reset" value="Reset"><br>
</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Experssion language Demo</title>
</head>
<body>
<h1>Expression Language Demo _Output </h1>
<hr/>
<h2> Using the Employee Beans</h2>
FirstName:${employee.fname}<br>
LastName:${employee.lname}<br>
EmployeeID:${employee.employeeId}<br>
Email_Id:${employee.email_Id}<br>
HourlyPay:${employee.hourlyrate}<br>
HoursWorked:${employee.hoursWorked}<br>
<%-- catch(Exception e)
{
 out.println("Go an Erroe "+e);
}

--%>
<hr/>
<h2>Using the Map</h2>
Table of the TaxRates:
<table border="1">
<tr>
<td>
Gorgia
</td>
<td>
${taxrates.Gorgia }
</td>
</tr>
<tr>
<td>
Vermont 
</td>
<td>
${taxrates.Vermont}
</td>
</tr>
<tr>
<td>
Arkansas
</td>
<td>
${taxrates.Arkansas}
</td>
</tr>
<tr>
<td>
Tennessee
</td>
<td>
${taxrates.Tennessee}
</td>
</tr>
</table>
<hr/>
<h3>
A temperature calculations
</h3>
<p>3C=${(9.0/5.0)*3.0+32}F
</p>

<h3>Using the Implicite objects</h3>
${empty param .hoursworked}
<br>
<p>Employee Componsation:${employee.hourlyrate*param.hoursworked}</p>
<p>${header["host"]}</p>
</body>
</html>
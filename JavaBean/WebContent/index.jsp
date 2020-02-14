<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id='employee' scope='session' class='model.EmployeeBean'></jsp:useBean>
    <jsp:setProperty property="fname" name="employee" value='Victor'/>
    <jsp:setProperty property="lname" name="employee" value='Alen'/>
    <jsp:setProperty property="startYear" name="employee" value='2019'/>
    <jsp:setProperty property="payrate" name="employee" value='15'/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Employ Been Demo</h1>
<table border="1">
<tr>
<td>
FirsrName:
</td>
<td>
<jsp:getProperty property="fname" name="employee"/>
</td>
</tr>
<tr>
<td>
LastName
</td>
<td>
<jsp:getProperty property="lname" name="employee"/>
</td>
</tr>
<tr>
<td>
StartYear:
</td>
<td>
<jsp:getProperty property="startYear" name="employee"/>
</td>
</tr>
<tr>
<td>
PayRate:
</td>
<td>
<jsp:getProperty property="payrate" name="employee"/>
</td>
</tr>
</table>
</body>
</html>
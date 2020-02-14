<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form action="submitregistration" method = "POST">

<tr>
<td>
StudentName:
</td>
<td>
<input name="student_Name" type="text"></input>
</td>
</tr>

<tr>
<td>
StudentID:
</td>
<td>
<input name="student_id" type="number"></input>
</td>
</tr>
<tr>
<td>
EmailID:
</td>
<td>
<input name="email_id" type="text"></input>
</td>
</tr>

<%-- <tr>
<td>
Majors:
</td>
<td>
<form:checkboxes items="${Major}" path="majors"/>
</td>
</tr>
 --%>
<tr>
<td>
Address:
</td>
<td>
Street:<input name="studentaddress.street" type="text"></input>
</td>

<td>
County:<input name="studentaddress.county" type="text"></input>
</td>

<td>
City:<input name="studentaddress.city" type="text"></input>
</td>

<td>
State:<input name="studentaddress.state" type="text"></input>
</td>

<td>
Zipcode:<input name="studentaddress.zipcode" type="text"></input>
</td>
</tr>

<input type="submit" value="SubmitForm">
</form:form>

</body>
</html>
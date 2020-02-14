<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<td>
StudentName:${studendetails.student_Name}
</td>
</tr>

<tr>
<td>
StudentID:${studendetails.student_id}
</td>
</tr>

<%-- <tr>
<td>
Majors:${student.majors}
</td>
</tr>
 --%>
<tr>
<td>
EmailID:${studendetails.email_id}
</td>
</tr>

<tr>
<td>
Address:${studendetails.studentaddress}
</td>
</tr>

</table>
</body>
</html>
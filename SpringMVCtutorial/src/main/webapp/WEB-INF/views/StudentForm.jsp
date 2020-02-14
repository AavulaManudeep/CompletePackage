<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BORAJI.COM</title>
<style type="text/css">
fieldset {
	border: 1px solid #dedede;
}

legend {
	font-size: 20px;
	text-transform: uppercase;
}

.error {
	color: red;
}

.resltTable {
	width: 50%;
	border-collapse: collapse;
	border-spacing: 0px;
}

.resltTable td, .resltTable th {
	border: 1px solid #565454;
}
</style>
</head>
<body>
  <fieldset>
    <legend>Student Input From</legend>
    <form:form action="saveStudents" method="post" modelAttribute="student">
      <table>
        <tr>
          <th>Name</th>
          <td>
            <form:input path="student_name" /> 
            <form:errors path="student_name" cssClass="error" />
          </td>
          <th>Email</th>
          <td>
            <form:input path="email_id" /> 
            <form:errors path="email_id" cssClass="error" />
          </td>
          <td><button type="submit">Submit</button></td>
        </tr>
      </table>
    </form:form>
  </fieldset>
  <br>
  <br>

  <fieldset>
    <legend>Student List</legend>
    <table class="resltTable">
      <tr>
      
        <th>Name</th>
        <th>Email</th>
      </tr>
      <c:forEach items="${students}" var="student">
        <tr>
         
           <td>${student.student_name}</td>
          <td>${student.email_id}</td>
        </tr>
      </c:forEach>

    </table>
  </fieldset>

</body>

</html>
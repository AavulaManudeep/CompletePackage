<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	if(session.getAttribute("UserName").equals(null))
	{
		response.sendRedirect("Login.jsp");
	}
	
%>
Hello Mr.${UserName} Welcome to the Page
<form action="Fileupload" method="post" enctype="multipart/form-data">

<input type="file" name="file" multiple >
<input type="submit" name="sub" value="UploadFile">
</form>

</body>
</html>
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
String signin=request.getParameter("signin");
String signup=request.getParameter("signup");
//out.println(request.getParameter("signup"));

if(request.getParameter("signin")!=null)
{
	out.println("You Have Logged in Sucessfully");
	response.sendRedirect("Signinpage.jsp");
}	
else if(request.getParameter("signup")!=null)
{
	out.println("You Have SignUp Sucessfully");
	response.sendRedirect("SignUp.html");
}
else
	out.println(" Logged in Permission Denied");
%>
<%
out.println(request.getParameter("signup"));
out.println(request.getParameter("signin"));
%>
</body>
</html>
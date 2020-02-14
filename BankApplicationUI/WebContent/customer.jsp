<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:form action="sayhello">
<s:textfield name ="username" label="UserName" placeholder="username"></s:textfield>
<s:password name="password" label="Password" placeholder="password"></s:password>
<s:textfield name ="email" label="Email_Id" placeholder="example@gmail.com"></s:textfield>
<%-- <s:radio name="usertype" label="LoginType" list="{'Admin','Customer'}"></s:radio> --%>
<s:checkboxlist  name="accounttype"  label="AccountType" list="{'Savings','Checking'}"/>
<s:submit value="register"></s:submit>
</s:form>
</body>
</html>
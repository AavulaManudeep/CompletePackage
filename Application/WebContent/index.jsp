<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
     <%@ taglib uri="/struts-dojo-tags" prefix="sx" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:form action="login">
<s:textfield name ="username" label="UserName" placeholder="username"></s:textfield>
<s:password name="password" label="Password" placeholder="password"></s:password>
<s:radio name="usertype" label="LoginType" list="{'Admin','Customer'}"></s:radio>
<s:submit value="register"></s:submit>
</s:form>
 <sx:tabbedpanel id="tabContainer">
<sx:div lable="Tab1">Tab1</sx:div>
<sx:div lable="Tab1">Tab2</sx:div>
</sx:tabbedpanel> 
</body>
</html>
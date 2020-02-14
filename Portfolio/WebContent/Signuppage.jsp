<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">


ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}

li {
  float: left;
  border-right:1px solid #bbb;
}

li:last-child {
  border-right: none;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover:not(.active) {
  background-color: #111;
}

.active {
  background-color: #4CAF50;
}
form
{
	padding-top:20px;
}
input
{
  height:30px;
  width:95%;
  align:center;
  margin-top:20px
  }
.btn
{
	width:100px;
	margin-right:30px;
		
}
div
{
  height:450px;
  margin-top:5px;
  text-align:center;
  width:50%;
  background-color: #555;
  margin-left:26%;
  margin-top:5px;
}
body
{
	background:url(/home/manu/Desktop/portfolio-back.jpg)
}
</style>
</head>
<body>
	<ul>
  <li><a  href="#home">Home</a></li>
  <li><a class="active" href="#news">News</a></li>
  <li><a href="#contact">Contact</a></li>
  <li style="float:right"><a href="#about">About</a></li>
</ul>
<div>
<form action="" method="post" >
<input type="text" name="fname" placeholder="First name"><br>
<input type="text" name="name" placeholder="UserName"><br>
<input type="password" name="Password"placeholder="Password"><br>
<input type="password" name="Check_Pass"placeholder="Check Password"><br>
<input type="email" name="email_id"placeholder="Email_Id"><br>
<input class="btn" type="Submit" name="SigningUp" value="SignUp">
<input  class="btn" type="reset" name="resetting" value="Reset">
</form>
</div>
<%
  
%>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body{
	text-align:center;
}
</style>
</head>
<body>
<h1><font size="10px">Registration Success</font></h1><br>
<b>about created Information</b><br>
ID: <%= request.getParameter("regid") %><br>
Password: <%= request.getParameter("regpwd")%><br>
Name: <%= request.getParameter("userName")%><br>
Age: <%= request.getParameter("userAge")%><br>
Address: <%= request.getParameter("userAddr")%><br>
Email: <%= request.getParameter("userEmail")%><br>

</body>
</html>

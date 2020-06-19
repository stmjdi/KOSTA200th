<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	request.setCharacterEncoding("utf-8");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result Page</title>
<style>
	body{
		tezt-align:center;
	}
	table{
		margin-top:200px;
		margin-left:auto;
		margin-right:auto;
	}
	td{
		text-align:center;
	}
</style>
</head>
<body>
<h1>Login Information</h1>
<table>
	<tr>
		<th>ID</th>
		<th>Password</th>
	</tr>
	<tr>
		<td>${id}</td>
		<td>${pwd}</td>
	</tr>
</table><br><br>
<button onclick="location.href='leaveForm.do'">drop out</button>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<%
	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>listForm Page</title>
<style>
	table{
		margin-top:200px;
		margin-left:auto;
		margin-right:auto;
		text-align:center;
	}
	td{
		padding:50px;
	}
</style>

</head>
<body>
<h1>List Page</h1>
<table>
	<tr>
		<th>Title</th>
		<th>User</th>
		<th>Date</th>
	</tr>
	<c:forEach var="itm" items="${brdList }">
	<tr>
		<td><a href="detailForm.do?title=${itm.title }&username=${itm.username }">${itm.title }</a></td>
		<td>${itm.username }</td>
		<td>${itm.joinDate }</td>
	</tr>
	</c:forEach>
	<tr>
		<td></td>
		<td></td>
		<td><button onclick="location.href='uploadForm.do'">Upload</button></td>
	</tr>
</table>
</body>
</html>
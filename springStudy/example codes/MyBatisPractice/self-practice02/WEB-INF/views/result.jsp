<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Here is the Result Page</h1>

<table>
<c:forEach var="stck" items="${lst }">
<tr>
	<td>name : </td>
	<td>${stck.getName() }</td>
</tr>
</c:forEach>
</table>

<h4>List Finish</h4>
</body>
</html>
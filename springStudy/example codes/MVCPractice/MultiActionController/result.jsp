<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<%
	request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	tr{
		text-align:center;
	}
</style>
</head>
<body>
<table border="1" width="50%" align="center">
	<tr>
		<td>ID</td>
		<td>Password</td>
	</tr>
	<tr>
		<td>${userId}</td>
		<td>${passwd}</td>
	</tr>
</table>

</body>
</html>

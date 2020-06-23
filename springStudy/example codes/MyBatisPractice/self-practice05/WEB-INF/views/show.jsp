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
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>gno</th>
			<th>gname</th>
			<th>g_start</th>
			<th>g_end</th>
		</tr>
		<c:forEach var="gifts" items="${list}">
		<tr>
			<td>${gifts.getGno()}</td>
			<td>${gifts.getGname()}</td>
			<td>${gifts.getG_start()}</td>
			<td>${gifts.getG_end()}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>
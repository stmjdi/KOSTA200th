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
<table>
	<tr>
		<th>Name</th>
		<th>Balance</th>
		<th>Recent</th>
	</tr>
	<c:forEach var="itm" items="${accDatas }">
		<tr>
			<td>${itm.getName() }</td>
			<td>${itm.getBalance() }</td>
			<td>${itm.getRecent() }</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>
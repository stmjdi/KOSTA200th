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
<title>Login Window</title>

<style>
	tr{
		text-align:center;
	}
</style>
</head>
<body>
<form name="frmLogin" method="post" action="${contextPath}/test/login.do">
	<table border="1" width="80%" align="center">
		<tr>
			<td>ID</td>
			<td>Password</td>
		</tr>
		<tr>
			<td><input type="text" name="userID" value="" size="20"></td>
			<td><input type="password" name="passwd" value="" size="20"></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="Login">
				<input type="reset" value="type again">
			</td>
		</tr>
	</table>
</form>
</body>
</html>

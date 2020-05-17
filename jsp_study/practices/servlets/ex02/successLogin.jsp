<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>When Log in Successfully</title>
	</head>
	<body>
		<h1>Here is the page, 'successLogin.jsp'</h1>
		
		ID : <%=request.getParameter("uid") %><br>
		Password : <%=request.getParameter("pwd") %><br>
	</body>
</html>
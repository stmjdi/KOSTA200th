<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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

<h1>Hello, <%=(String)session.getAttribute("name") %></h1>
<br><br>
<form action="update.do" method="post">
Add Balance : <input type="text" name="recent" placeholder="add"><br>
<input type="submit" value="Submit">
</form>


</body>
</html>
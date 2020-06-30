<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" import="com.spring.vo.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Check if session binded</h1>
ID : <%=session.getAttribute("uid") %>
<br>
<button onclick="location.href='inval.do'" value="invalidate">invalidate</button>
<br><br>
<button onclick="location.href='lastCheck.do'">Rest Test</button>
</body>
</html>
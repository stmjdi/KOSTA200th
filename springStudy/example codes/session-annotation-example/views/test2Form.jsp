<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" import="com.spring.vo.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Check in Bridge Page</h1>
ID : <%=session.getAttribute("uid") %>
<button onclick="location.href='test3Form.do'">Next</button>
</body>
</html>
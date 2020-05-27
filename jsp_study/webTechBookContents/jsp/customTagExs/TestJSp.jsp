<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored='false'%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 
<style>
body{
text-align:center;
}
</style>
</head>
<body>
<%@ taglib prefix="cutil" uri="tld/CommonUtils.tld" %>
<h1>Hello World!</h1>
${cutil:getTest("Jackson")}<br>
<!-- ${cutil:MaxNum("1","2")} -->
${cutil:MaxNum(1,2)}<br> <!-- select bigger one -->
${cutil:Calc(1,'+')} <!-- simple caculation(+,-,*,/) -->
 
</body>
</html>

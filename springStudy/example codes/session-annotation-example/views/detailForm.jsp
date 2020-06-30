<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>detailForm Page</title>
</head>
<body>
<h1>Detail Page</h1>
<div>
<div>Title : ${brd.title }</div>
<div>Date : ${brd.joinDate }</div>
<div>User : ${brd.username }</div>
<div>Contents</div>
<div>
<pre>
	${brd.contents }
</pre>
</div>

</div>

</body>
</html>
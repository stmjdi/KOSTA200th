<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
	div{
		margin-top:200px;
		margin-left:auto;
		margin-right:auto;
		
		border-style:solid;
		border-width:0.5px;
		border-color:lightgreen;
		padding:20px;
	}
</style>
</head>
<body>

<div>
<form action="regis.do" method="post">
ID : <input type="text" name="regisid">
Password : <input type="password" name="regispwd">
<input type="submit" value="register">
</form>
</div>
</body>
</html>
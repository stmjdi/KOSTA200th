<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<style>
body{
	text-align:center;
}
div{
	margin-top:300px;
	margin-left:auto;
	margin-right:auto;
}

</style>
</head>
<body>
<h1>Login Page</h1>

<div>
<form action="show.do" method="post">
ID : <input type="text" name="id">
Password : <input type="password" name="pwd">
<input type="submit" value="login">
</form>
<br><br>
<button onclick="location.href='regisForm.do'">Register</button>
</div>
</body>
</html>
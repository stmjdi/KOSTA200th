<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
	<h1>Login Page</h1>

	<form action="result.do" method="GET">
		ID : <input type="text" name="id" id="id"><br>
		<br> Password : <input type="password" name="pwd" id="pwd"><br>
		<br> <input type="submit" value="Login" id="Sub">
	</form>
	<br>
	<button onclick="location.href='regisForm.do'">Register</button>

	<script>
		$(document).ready(function() {
			$('#Sub').click(function() {
				if ($('#id').val() == "") {
					alert("should type id");
					$('#id').focus();
					return false;
				} else if ($('#pwd').val() == "") {
					alert("should type password");
					$('#pwd').focus();
					return false;
				} else {
					$('#Sub').submit();
				}
			});
		});
	</script>

</body>
</html>
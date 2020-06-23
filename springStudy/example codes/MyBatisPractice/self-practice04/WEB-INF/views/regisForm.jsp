<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Page</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
	<h1>Register Page</h1>
	<form action="regis.do" method="get">
		ID : <input type="text" name="regid" id="regid"><br>
		<br> Password : <input type="password" name="regpwd" id="regpwd"><br>
		<br> <input type="submit" value="Register" id="Sub">
	</form>

	<script>
		$(document).ready(function() {
			$('#Sub').click(function() {
				if ($('#regid').val() == "") {
					alert("should type id");
					$('#regid').focus();
					return false;
				} else if ($('#regpwd').val() == "") {
					alert("should type password");
					$('#regpwd').focus();
					return false;
				} else {
					$('#Sub').submit();
				}
			});
		});
	</script>

</body>
</html>
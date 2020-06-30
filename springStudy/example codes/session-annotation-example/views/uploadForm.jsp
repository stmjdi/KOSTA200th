<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<meta charset="UTF-8">
<title>uploadForm Page</title>
<style>
table {
	margin-top: 200px;
	margin-left: auto;
	margin-right: auto;
	border-style: solid;
	border-width: 1px;
}

td {
	text-align: right;
	pading: 20px;
}

#contents {
	border-style: solid;
	border-color: lightgreen;
}
</style>
</head>
<body>
	<h1>Upload Page</h1>
	<form action="upload.do" method="post">
		<table>
			<tr>
				<td>Title :</td>
				<td><input type="text" name="title" id="title"></td>
			</tr>
			<tr>
				<td>Username :</td>
				<td><input type="text" name="username" id="username"></td>
			</tr>
			<tr>
				<td>Contents</td>
				<td><textarea name="contents" id="contents" id="contents"></textarea></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="upload" id="Sub"></td>
			</tr>
		</table>
	</form>

	<script>
		$(document).ready(function() {
			$('#Sub').click(function() {
				if ($('#title').val() == "") {
					alert("should type id");
					$('#user_id').focus();
					return false;
				} else if ($('#username').val() == "") {
					alert("should type password");
					$('#user_pw').focus();
					return false;
				} else if ($('#username').val() == "") {
					alert("should type password");
					$('#contents').focus();
					return false;
				} else {
					$('#Sub').submit();
				}
			});
		});
	</script>
</body>
</html>
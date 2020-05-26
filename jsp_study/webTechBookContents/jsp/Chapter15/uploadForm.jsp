<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"% isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="${contextPath}/upload.do" method="post" encType="multipart/form-data">
file1 : <input type="file" name="file1">
file2 : <input type="file" name="file2">
parameter1 : <input type="text" name="param1"><br>
parameter2 : <input type="text" name="param2"><br>
parameter3 : <input type="text" name="param3"><br>
<input type="submit" value="upload">
</form>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	String name=(String)session.getAttribute("name");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
<%-- <script>
	$(document).ready(function(){
		<%if(session.getAttribute("name")!=null){%>
			$('h3').html("Hello, <%=name%>");
			
		<%}else{%>
			$('h3').html("");
		<%}%>
	});
</script> --%>

</head>
<body>
<h1>Here is Index Page!!</h1>
<%-- <%if(session.getAttribute("name")!=null){ %>
	<h3>Hello, <%=session.getAttribute("name") %>!!</h3>
<%} %> --%>
<!-- <h3></h3> -->
<form action="login.do" method="post">
Name : <input type="text" name="name"><br>
<br><input type="submit" value="Login">
</form>
<br><br>
<button onclick="location.href='showAccount.do'">Show</button><br>
<br><button onclick="location.href='logout.do'">Logout</button>


</body>
</html>
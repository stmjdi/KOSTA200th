<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.kosta.visitors.*" %>
    <%@ page import="java.util.LinkedList" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Guest Book Space</title>

<style>
body{
	text-align:center;
	display:table;
	margin-left:auto;
	margin-right:auto;
	
}

header{
	text-align:center;
	border-style:solid;
	border-width:0.6px;
	border-color:gray;
	
	margin-top:20px;
	margin-bottom:20px;
	
}

#content{
	border-style:solid;
	border-width:1px;
	border-color:gray;
	
	width:400px;
	height:500px;
}

table{
	text-align:center;
	border-style:solid;
	border-width:0.5px;
}
#ifr{
	margin-bottom:30px;
}

</style>
</head>
<body>
<header><font size='30px' color='purple'>Guest Book Space</font></header>
<form action="../BookServer" method="post">
<table>
<tr>
<td>Number: </td>
<td><input type='text' name='num'></td>
</tr>

<tr>
<td>Name: </td>
<td><input type='text' name='name'></td>
</tr>
<tr>
<td>E-mail: </td>
<td><input type='email' name='email'></td>
</tr>
<tr>
<td>Home: </td>
<td><input type='text' name='home'></td>
</tr>
<tr>
<td>Contents: </td>
<td><input type='text' name='content' id='content'></td>
</tr>
</table>
<input type='submit' value="Submit" id="Subm">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type='reset' value='Reset'>
</form>
<br><br><br><br><br><br>
<hr>
<br><br><br><br><br><br>
<table>
<tr>
<th>Number</th>
<th>Name</th>
<th>Email</th>
<th>Home</th>
<th>Contents</th>

</tr>
<%
if((LinkedList)request.getAttribute("fromServer")==null){
	out.print("null");
}else{
	LinkedList ll = (LinkedList)request.getAttribute("fromServer");
	LinkedList lst;
	while(!ll.isEmpty()) {
		lst=(LinkedList)ll.pollFirst();
		out.print("<tr>");
		while(!lst.isEmpty()) {
			out.print("<td>"+lst.pollFirst()+"</td>");
		}
		out.print("</tr>");
	}
}

%>
</table>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<meta charset="UTF-8">
<title>Insert title here</title>

<script>
$(function(){
	$("#checkJson").click(function(){
		var _jsonInfo='{"name":"jisung","age":"25","gender":"male","nickname":"날센돌이"}';
		$.ajax({
			type:"post",
			async:false,
			url:"http://localhost:8089/jspProject/json",
			data:{jsonInfo:_jsonInfo},
			success:function(data,textStatus){
			},
			error:function(data,textStatus){
				alert("Error occured");
			},
			complete:function(data,textStatus){
			}
		});
	});
})
</script>
</head>
<body>
<button id="checkJson">button</button>
</body>
</html>

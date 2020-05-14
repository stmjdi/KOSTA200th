<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
	<title>Insert title here</title>
	<script src="//code.jquery.com/jquery-1.11.2.min.js"></script>	
	<script type="text/javascript">
	/*
	Selectors
		Attribute ***(form <input....)
		Basic ***
		
		Basic Filter
		Child Filter
		Content Filter
		
		Form
		
		Hierarchy 
		
		jQuery Extensions
		Visibility Filter
	*/
	
		$(document).ready(function(){
			$("body > *").css('color','gold'); //Hierarchy
			$("div > *").css('color','red');
			$("input[type=text]").val("input"); //attribute
			$("input[type=password]").val("1111");
			//Filter
			$('tr:odd').css('color','gray');//홀수 (index : 1,3)
			$('tr:even').css('color','green'); //짝수 (index: 0 , 2 , 4)
			$('tr:first').css('background','blue');
			
			 setInterval(function(){
				var value = $('select > option:selected').val();
				//alert("select option : " + value);
			 }, 2000)
		});
	
	</script>
</head>
<body>
	<div>
		<ul>
			<li>사과</li>
			<li>배</li>
			<li>딸기</li>
		</ul>
	</div>
	<div>
		<ul>
			<li>사과2</li>
			<li>배2</li>
			<li>딸기3</li>
		</ul>	
	</div>
	<input type="text">
	<input type="text">
	<input type="text">
	<input type="password">
	<input type="radio">
	<input type="file">
	<table>
		<tr><td>1</td><td>2</td><td>3</td></tr>
		<tr><td>4</td><td>5</td><td>6</td></tr>
		<tr><td>7</td><td>8</td><td>9</td></tr>
		<tr><td>10</td><td>11</td><td>12</td></tr>
	</table>
	<hr>
	<select>
		<option>농구</option>
		<option>야구</option>
		<option>축구</option>
		<option>배구</option>
	</select>
	
</body>
</html>





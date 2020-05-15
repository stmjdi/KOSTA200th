- 시작 태그
<pre><code>
"<%" : jsp의 시작태그
</code></pre>

- 선언문
<pre><code>
<%!
  자바코드 : 함수 선언
%>
</code></pre>

- 스크립트릿
<pre><code>
<%
  자바코드 : 함수 선언 x
%>
</code></pre>

- 표현식
<pre><code>
<%= 변수 또는 메소드() %>
</code></pre>

- 주석
<pre><code>
//, /* */
</code></pre>

- 예제
<pre><code>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.io.*"%>
    <%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex01_basic.jsp</title>
</head>
<body>
<!-- 선언문 : 자바, 변수 선언, 함수, ... but 제어문, 출력문 안됨-->
<%!
	class Pair{
		int first, second;
		public Pair(int f, int s){
			first=f;
			second=s;
		}
	}

	int Abs(int n){
		return n>=0?n:-n;
	}

%>

<!-- 스크립트릿 : 변수 선언, 자바 코드, 제어문, 출력문 but 함수 선언 x-->
<%
	Pair p = new Pair(-1,2);
	
%>

<!-- 표현식 -->
<%= "Here is the space for expressions<br><br>" %>
<%= p.first+" "+p.second%>
</body>
</html>
</code></pre>

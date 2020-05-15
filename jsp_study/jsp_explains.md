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

 - - - -

- JSP의 내부 객체
  - 4가지 형태로 분류
    - jsp 페이지 입출력 관련
    - jsp 페이지 외부 환경 정보 제공
    - jsp 페이지 Servlet 관련
    - jsp 페이지 예외 관련
  - 내부 객체 종류 (9가지)
    - request : 요청 값에 대한 처리
    - response : 응답할 응답 정보 처리
    - out
    - pageContext
    - session
    - application
    - config
    - page
    - exception
    

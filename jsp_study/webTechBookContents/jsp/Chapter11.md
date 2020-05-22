# Chapter 11. Elements of JSP

1. JSP Elements
- HTML tag, CSS, Javascript code
- JSP <b>basic</b> tag
- JSP <b>action</b> tag
- tag made my developer or tag from framework


2. [JSP Translation Process](# jsp-translation-process)
  - Translation step
  - Compile step
  - Interpret step


3. Elements of JSP Page
- [Directive Tag](#directive-tag)
- Scripting Element : 주석문, Scriptlet, 표현식, 선언식
- Expression Language
- Inner Objects
- Action Tag
- Custom Tag

<hr>

## Directive Tag
- Page Directive Tag
<table>
    <tr>
        <th>Attribute</th>
        <th>Default</th>
        <th>Explain</th>
    </tr>
    <tr>
        <td>info</td>
        <td>none</td>
        <td>페이지를 설명해주는 문자열 지정</td>
    </tr>
    <tr>
        <td>language</td>
        <td>"java"</td>
        <td>JSP 페이지에서 사용할 언어 지정</td>
    </tr>
    <tr>
        <td>contentType</td>
        <td>"text/html"</td>
        <td>JSP 페이지 출력 형식 지정</td>
    </tr>
    <tr>
        <td>import</td>
        <td>none</td>
        <td>JSP 페이지에서 다른 패키지의 클래스를 import할 때 지정</td>
    </tr>
    <tr>
        <td>session</td>
        <td>"true"</td>
        <td>JSP 페이지에서 HttpSession 객체의 사용여부를 지정</td>
    </tr>
    <tr>
        <td>buffer</td>
        <td>"8kb"</td>
        <td>JSP 페이지 출력 시 사용할 버퍼 크기 지정</td>
    </tr>
    <tr>
        <td>autoFlush</td>
        <td>"true"</td>
        <td>JSP 페이지의 내용이 출력되기 전 버퍼가 다 채워질 경우 동작을 지정</td>
    </tr>
    <tr>
        <td>errorPage</td>
        <td>"false"</td>
        <td>JSP 페이지 도중 예외가 발생할 경우 예외 처리 담당 JSP 페이지를 지정</td>
    </tr>
    <tr>
        <td>isErrorPage</td>
        <td>"false"</td>
        <td>현재 JSP 페이지가 예외 처리 담당 JSP 페이지인지를 지정</td>
    </tr>
    <tr>
        <td>pageEncoding</td>
        <td>"ISO-8859-1"</td>
        <td>JSP 페이지에서 사용하는 문자열 인코딩 지정</td>
    </tr>
    <tr>
        <td>isIgnored</td>
        <td>"true"</td>
        <td>JSP 2.0 버전에서 추가된 기능으로 EL 사용 유무를 지정</td>
    </tr>
</table>

- Include Directive Tag
> 여러 JSP 페이지에서 사용되는 공통 JSP 페이지를 만든 후 다른 JSP페이지에서 공통 JSP를 포함시켜 사용하는 기능

<pre><code><%@ include file="common function" %></code></pre>
- 특징
  - 재사용성이 높음
  - JSP 페이지의 유지 관리가 쉬움









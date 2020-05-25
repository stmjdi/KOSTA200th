# Chapter 14. Expression Language(EL) & JSP Standard Tag Library(JSTL)

<b>1. EL(Expression Language)</b>
<pre><code>${some codes}</code></pre>

<b>2. EL's Inner Objects</b>
<table>
<tr>
    <th>Sort</th>
    <th>Inner Object</th>
    <th>Description</th>
</tr>
<tr>
    <td rowspan="4">Scope</td>
    <td>pageScope</td>
    <td>JSP에서 page와 같은 기능을 하고 page 영역에 바인딩된 객체를 생성</td>
</tr>
<tr>
    <td>requestScope</td>
    <td>JSP의 request와 같은 기능을 하고 request에 바인딩된 객체를 참조</td>
</tr>
<tr>
    <td>sessionScope</td>
    <td>JSP의 session과 같은 기능을 하고 session에 바인딩된 객체를 참조</td>
</tr>
<tr>
    <td>applicationScope</td>
    <td>JSP의 application과 같은 기능을 하고 application에 바인딩된 객체를 참조</td>
</tr>
<tr>
    <td rowspan="2">Request Parameter</td>
    <td>param</td>
    <td>request.getParameter() 메소드를 호출한 것과 같으며 한 개의 값을 전달하는 요청 매개변수 처리</td>
</tr>
<tr>
    <td>paramValues</td>
    <td>request.getParameterValues() 메소드를 호출한 것과 같으며 여러 개의 값을 전달하는 요청 매개변수 처리</td>
</tr>
<tr>
    <td rowspan="2">Header Value</td>
    <td>header</td>
    <td>request.getHeader() 메서드를 호출한 것과 같으며 요청 헤더 이름의 정보를 단일 값으로 반환</td>
</tr>
<tr>
    <td>headerValues</td>
    <td>request.getHeader() 메서드를 호출한 것과 같으며 요청 헤더 이름의 정보를 배열로 반환</td>
</tr>
<tr>
    <td>Cookie</td>
    <td>Cookies</td>
    <td>Cookie의 이름의 값을 반환</td>
</tr>
<tr>
    <td>JSP Context</td>
    <td>pageContext</td>
    <td>pageContext 객체를 참조할 때 사용</td>
</tr>
<tr>
    <td>Initial Parameter</td>
    <td>initParam</td>
    <td>Context의 초기화 매개변수 이름의 값을 반환</td>
</tr>
</table>

<b>3. Custom Tag</b>
> JSP 페이지에서 자주 사용되는 자바 코드를 대체하기 위해 만든 태그
- 종류
    - JSTL : JSP페이지에서 가장 많이 사용하는 기능을 태그로 제공, JSTL 라이브러리를 따로 설치헤서 사용
    - 사용자 custom tag : 개발자가 필요에 의해 만든 태그. 스트러츠나 스프링 프레임워크에서 미리 만들어서 제공

<b>4. JSTL</b>
> custom tag 중 가장 많이 사용되는 태그를 표준화하여 라이브러리로 제공하는 것
- JSTL의 종류
<table>
    <tr>
        <th>라이브러리</th>
        <th>기능 상세</th>
        <th>접두어</th>
        <th>관련 URI</th>
    </tr>
    <tr>
        <td>Core</td>
        <td>변수 지원, 흐름 제어, 반복문 처리, URL 처리</td>
        <td>c</td>
        <td>http://java.sun.com/jsp/jstl/core</td>
    </tr>
    <tr>
        <td>국제화</td>
        <td>지역, 메시지 형식, 숫자 및 날짜 형식</td>
        <td>fmt</td>
        <td>http://java.sun.com/jsp/jstl/fmt</td>
    </tr>
    <tr>
        <td>XML</td>
        <td>XML core, 흐름 제어, XML 변환</td>
        <td>x</td>
        <td>http://java.sun.com/jsp/jstl/xml</td>
    </tr>
    <tr>
        <td>Database</td>
        <td>SQL</td>
        <td>sql</td>
        <td>http://java.sun.com/jsp/jstl/sql</td>
    </tr>
    <tr>
        <td>Method</td>
        <td>컬렉션 처리, 문자열 처리</td>
        <td>fn</td>
        <td>http://java.sun.com/jsp/jstl/functions</td>
    </tr>
</table>




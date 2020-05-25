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

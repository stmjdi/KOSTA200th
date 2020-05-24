# Chapter 12. Functions of JSP Script Elements

1. Scripting Elements
> Declaration tag : JSP에서 변수나 메소드를 선언할 때 사용<br>
> Scriptlet : JSP에서 자바 코드를 작성할 때 사용<br>
> Expression tag : JSP에서 변수의 값을 출력할 때 사용

2. Inner Objects
<table>
    <tr>
        <th>Inner Object</th>
        <th>Servlet Type</th>
        <th>Description</th>
    </tr>
    <tr>
        <td>request</td>
        <td>javax.servlet.http.HttpServletRequest</td>
        <td>client의 요청 정보를 저장</td>
    </tr>
    <tr>
        <td>response</td>
        <td>javax.servlet.http.HttpServletResponse</td>
        <td>응답 정보를 저장</td>
    </tr>
    <tr>
        <td>out</td>
        <td>javax.servlet.jsp.JspWriter</td>
        <td>JSP 페이지에서 결과를 출력</td>
    </tr>
    <tr>
        <td>session</td>
        <td>javax.servlet.http.HttpSession</td>
        <td>session 정보를 저장</td>
    </tr>
    <tr>
        <td>application</td>
        <td>javax.servlet.ServletContext</td>
        <td>context 정보를 저장</td>
    </tr>
    <tr>
        <td>pageContext</td>
        <td>javax.servlet.jsp.ServletContext</td>
        <td>JSP 페이지에 대한 정보를 저장</td>
    </tr>
    <tr>
        <td>page</td>
        <td>java.lang.Object</td>
        <td>JSP 페이지의 Servlet instance를 저장</td>
    </tr>
    <tr>
        <td>conf</td>
        <td>javax.servlet.ServletConfig</td>
        <td>JSP 페이지에 대한 설정 정보를 저장</td>
    </tr>
    <tr>
        <td>exception</td>
        <td>java.lang.Exception</td>
        <td>예외 발생 시 예외를 처리</td>
    </tr>
</table>

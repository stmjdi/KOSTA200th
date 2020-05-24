# Chapter 13. Action tags to remove Java codes

<b>1. serveral action tags</b>
<table>
    <tr>
        <th>Name</th>
        <th>Form</th>
        <th>Description</th>
    </tr>
    <tr>
        <td>include</td>
        <td><\jsp:include>\</td>
        <td>이미 있는 JSP를 현재 JSP에 포함하는 태그</td>
    </tr>
    <tr>
        <td>forward</td>
        <td><\jsp:forward>\</td>
        <td>Servlet에서 RequestDispatcher 클래스의 forwarding 기능을 대신하는 태그</td>
    </tr>
    <tr>
        <td>userBean</td>
        <td><\jsp:useBean>\</td>
        <td>객체를 생성하기 위한 new 연산자를 대신하는 태그</td>
    </tr>
    <tr>
        <td>setProperty</td>
        <td><\jsp:setProperty>\</td>
        <td>setter를 대신하는 태그</td>
    </tr>
    <tr>
        <td>getProperty</td>
        <td><\jsp:getProperty>\</td>
        <td>getter를 대신하는 태그</td>
    </tr>
</table>

<b>2. Java Bean</b>
> 웹 프로그램, 즉 Java EE 프로그래밍 시 여러 객체를 거치면서 만들어지는 데이터를 저장하거나 전달하는 데 사용<br>
> Java의 DTO(Data Transfer Object), VO(Value Object) 클래스와 같은 개념<br>
> Java Bean 을 만드는 방법 = VO 클래스를 만드는 방법<br>
> ex) \<jsp:useBean id='m' class="sec01.ex01.MemberBean" scope="page"/\>
- Java Bean 특징
    - 속성의 접근 제한자는 private
    - 각 속성(attribute, property)은 각각의 setter/getter를 가짐
    - setter/getter 이름의 첫 글자는 반드시 소문자
    - 인자 없는 생성자를 반드시 가지며 다른 생성자도 추가할 수 있음



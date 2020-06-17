# Chapter 21. Spring MVC

- spring mvc 특징
  - Model2 Architecture 지원
  - spring과 다른 모듈과의 연계 쉬움
  - tiles or sitemesh 같은 View 기술과의 연계 쉬움
  - tag library를 통해 message 출력, theme 적용 그리고 입력 폼을 보다 쉽게 구현 가능
  
- Spring Framework MVC 구성 요소
<table>
  <tr>
    <th>구셩 요소</th>
    <th>설명</th>
  </tr>
  <tr>
    <td>DispatcherServlet</td>
    <td>client의 요청을 전달받아 해당 요청에 대한 controller를 선택하여 client의 요청을 전달.<br>
    또한 controller가 반환한 값을 View에 전달하여 알맞은 응답을 생성</td>
  </tr>
  <tr>
    <td>HandlerMapping</td>
    <td>client가 요청한 url을 처리할 controller를 지정</td>
  </tr>
  <tr>
    <td>Controller</td>
    <td>client의 요청을 처리한 후 그 결과를 DispatcherServlet에 전달</td>
  </tr>
  <tr>
    <td>ModelAndView</td>
    <td>controller가 처리한 결과 및 뷰 선택에 필요한 정보를 저장</td>
  </tr>
  <tr>
    <td>ViewResolver</td>
    <td>controller의 처리 결과를 전달할 View를 지정</td>
  </tr>
  <tr>
    <td>View</td>
    <td>controller의 처리 결과 화면을 생성</td>
  </tr>
</table>

- Spring Framework MVC 기능 수행 과정
![dispserv](https://user-images.githubusercontent.com/60098657/84734912-26b12c00-afdd-11ea-8fab-1a2b871bdcbb.png)
  1. 브라우저가 DispatcherServblet에 url로 접근하여 해당 정보를 요청
  2. HandlerMapping에서 해당 요청에 대해 매핑된 controller가 있는지 확인
  3. 매핑된 controller에 대해 처리를 요청
  4. controller가 client의 요쳥을 처리한 결과와 View 이름을 ModelAndView에 저장해서 DispatcherServlet으로 반환
  5. DispatcherServlet에서는 controller에서 보내온 View 이름을 ViewResolver로 보내 해당 View를 요청
  6. ViewResolver는 요청한 View를 보냄
  7. View의 처리 결과를 DispatcherServlet으로 보냄
  8. DispatcherServlet은 최종 결과를 브라우저로 전송

- Spring Classes for Practice
<table>
  <tr>
    <th>Class</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>MultiActionController</td>
    <td>URL 요청명으로 바로 controller를 지정해서 사용할 수 있음</td>
  </tr>
  <tr>
    <td>PropertiesMethodNameResolver</td>
    <td>URL 요청명으로 controller의 설정 파일에서 미리 설정된 메서드를 바로 호출해서 사용</td>
  </tr>
  <tr>
    <td>InternalResourceViewResolver</td>
    <td>JSP나 html 파일과 같이 web application의 내부 자원 이용해 View를 생성하는 기능을 제공<br>
    기본적으로 사용하는 View Class이며 prefix와 suffix property를 이용해 경로 지정 가능</td>
  </tr>
</table>

- Files for ['MultiActionController' Practice](../example-codes/MVCPractice/MultiAction)
<table>
  <tr>
    <th>File</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>web.xml</td>
    <td>브라우저에서 *.do로 요청하면 spring의 DispatcherServlet class가 요청을 받을 수 있게 Servlet Mapping을 설정</td>
  </tr>
  <tr>
    <td>action-servlet.xml</td>
    <td>Spring에서 필요한 bean들을 설정</td>
  </tr>
  <tr>
    <td>UserController.java</td>
    <td>매핑된 요청에 대해 controller의 기능을 수행</td>
  </tr>
  <tr>
    <td>loginForm.jsp</td>
    <td>로그인 창</td>
  </tr>
  <tr>
    <td>result.jsp</td>
    <td>로그인 결과를 보여주는 jsp</td>
  </tr>
</table>


  

    

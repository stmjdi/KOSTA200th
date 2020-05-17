# Chapter 8
introduce about various functions like 'forward','binding','annotation' etc

## [Forward](#forward)
- Redirect (response.sendRedirect)
- Refresh (response.addHeader)
- location (location.href)
- dispatch (RequestDispatcher xx = request.getRequestDispatcher)
  - not pass to client from server when forwarding

## [Binding](#binding)
- request.sendRedirect -> fail to transmit contents<br>
  ---> <b>__RequestDispatcher__</b> object use
- related methods
  - setAttribute(String name, Object obj)
  - getAttribute(String name)
  - removeAttribute(String name)

## ServletContext & ServletConfig
- [ServletContext](#ServletContext)
- [ServletConfig](#ServletConfig)


- - -

### forward
: 하나의 Servlet에서 다른 Servlet/JSP와 연동하는 방법
- 용도
  - 요청에 대한 추가 작업을 다른 Servlet에게 수행하게 함
  - 요청에 포함된 정보를 다른 Servlet/JSP와 공유
  - 요청에 대한 정보를 포함시켜 다른 Servlet에 전달
  - Model2 개발 시 Servlet->JSP 로 데이터를 전달
  
  
### binding
: '두 개를 하나로 묶는다' -- 웹 프로그램 실행시 자원(데이터)을 Servlet 관련 객체에 저장하는 방법
- Servlet에서 다른 Servlet/JSP로 대량의 데이터를 공유/전달하고 싶을 때 사용
#### Related Methods
> <b>setAttribute(String name, Object obj)</b>
> : 자원(데이터)을 각 객체에 바인딩<br>
> <b>getAttribute(String name)</b>
> : 각 객체에 바인딩된 자원(데이터)을 name으로 가져옴<br>
> <b>removeAttribute(String name)</b>
> : 각 객체에 바인딩된 자원(데이터)를 name으로 제거<br>


### ServletContext
> 웹 애플리케이션이 실행되면서 애플리케이션 전체의 공통 자원이나 정보를 미리 바인딩<br>
> ---> Servlet들이 공유하여 사용
- 특징
  - javax.servlet.ServletContext로 정의 (관련 메소드 doc 참고)
  - Servlet & Container 간의 연동을 위해 사용
  - context(web application)마다 하나의 ServletContext가 생성
  - Servlet끼리 자원(데이터)을 공유하는 데 사용
  - Container 생성 -> 생성  /  Container 소멸 -> 소멸
- 기능
  - Servlet에서 파일 접근 기능
  - 자원 바인딩 기능
  - 로그 파일 기능
  - context에서 제공하는 설정 정보 제공 기능


### ServletConfig
> Interface로 선언되어 있으며, 여기에 선언된 여러 메소드를 통해 Servlet 관련 기능을 사용
- 제공하는 기능
  - ServletContext 객체를 얻는 기능
  - Servlet에 대한 초기화 작업 기능









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
> : 자원(데이터)을 각 객체에 바인딩
> <b>getAttribute(String name)</b>
> : 각 객체에 바인딩된 자원(데이터)을 name으로 가져옴
> <b>removeAttribute(String name)</b>
> : 각 객체에 바인딩된 자원(데이터)를 name으로 

# Chapter 8
introduce about various functions like 'forward','binding','annotation' etc

## [Forward](#forward)
- Redirect (response.sendRedirect)
- Refresh (response.addHeader)
- location (location.href)
- dispatch (RequestDispatcher xx = request.getRequestDispatcher)
  - not pass to client from server when forwarding


- - -

### forward
: 하나의 Servlet에서 다른 Servlet/JSP와 연동하는 방법
- 용도
  - 요청에 대한 추가 작업을 다른 Servlet에게 수행하게 함
  - 요청에 포함된 정보를 다른 Servlet/JSP와 공유
  - 요청에 대한 정보를 포함시켜 다른 Servlet에 전달
  - Model2 개발 시 Servlet->JSP 로 데이터를 전달

# Chapter 10. Servlet Filter & Listener

1. [Servlet Attributes & Scope](#servlet-attribute-and-scope)
- Attribute
- Scope

2. [Servlet URL Patterns](#)
> 실제 Servlet의 매핑 이름

3. Filter API
- [관련 API](#)
- [User Filter Example]()
- [Response Filter]()

4. [Listener API](#listener-api)
<br>
<hr>
<br>

## Servlet Attribute and Scope
### Servlet Attribute
> 다음 세 가지 Servlet API 클래스에 저장되는 객체
- ServletContext
- HttpSession
- HttpServletRequest

### Servlet Scope
> Servlet API에 바인딩된 속성에 대한 접근 범위 의미
- 기능
  - 로그인 상태 유지 기능
  - 장바구니 기능
  -  MVC의 Model & View의 데이터 전달 기능
- Scope의 종류와 특징
<table>
  <tr>
    <th>scope</th>
    <th>Servlet API</th>
    <th>Scope of Attribute</th>
  </tr>
  <tr>
    <td>Application Scope</td>
    <td>Session Scope</td>
    <td>Request Scope</td>
  </tr>
  <tr>
    <td>ServletContext</td>
    <td>HttpSession</td>
    <td>HttpServletRequest</td>
  </tr>
  <tr>
    <td>애플리케이션 전체에 대해 접근</td>
    <td>해당 브라우저에서만 접근</td>
    <td>해당 요청/응답 사이클에서만 접근</td>
  </tr>
</table>

  
  
  
  

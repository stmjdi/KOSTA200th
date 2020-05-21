# Chapter 10. Servlet Filter & Listener

1. [Servlet Attributes & Scope](#servlet-attribute-and-scope)
- Attribute
- Scope

2. [Servlet URL Patterns](#servlet-url-patterns)
> 실제 Servlet의 매핑 이름

3. Filter API
- [관련 API](#filter-api)
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
        <th>Scope</th>
        <th>Servlet API</th>
        <th>Attribute of Scope</th>
    </tr>
    <tr>
        <td>Application Scope</td>
        <td>ServletContext</td>
        <td>애플리케이션 전체에 대해 접근</td>
    </tr>
    <tr>
        <td>Session Scope</td>
        <td>HttpSession</td>
        <td>브라우저에서만 접근</td>
    </tr>
    <tr>
        <td>Request Scope</td>
        <td>HttpServletRequest</td>
        <td>해당 요청/응답 사이클에서만 접근</td>
    </tr>
</table>

## Servlet URL Patterns
- [name]()
- [directory]()
- [extension(확장자)]()


## Filter API
- methods declared in 'Filter' Interface
<table>
    <tr>
        <th>method</th>
        <th>function</th>
    </tr>
    <tr>
        <td>destroy()</td>
        <td>필터 소멸 시 컨테이너에 의해 호출되어 종료 작업 수행</td>
    </tr>
    <tr>
        <td>doFilter()</td>
        <td>요청/응답 시 컨테이너에 의해 호출되어 기능을 수행</td>
    </tr>
    <tr>
        <td>init()</td>
        <td>필터 소멸 시 컨테이너에 의해 초기화 작업 수행</td>
    </tr>
</table>

- methods of 'FilterConfig'
<table>
    <tr>
        <th>method</th>
        <th>function</th>
    </tr>
    <tr>
        <td>getFilterName()</td>
        <td>필터 이름을 반환</td>
    </tr>
    <tr>
        <td>getInitParameter(String name)</td>
        <td>매개변수 name에 대한 값 반환</td>
    </tr>
    <tr>
        <td>getServletContext()</td>
        <td>Servlet context 객체를 반환</td>
    </tr>
</table>











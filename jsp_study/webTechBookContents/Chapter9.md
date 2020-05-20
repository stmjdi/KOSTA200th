# Chapter 9. Session & Cookie

1. [Session Tracking](#Session-Tracking)

2. Connecting Web pages with using "hidden" tag & URL Rewriting
- ["hidden" tag](#"hidden"-tag)
- [URL Rewriting](#url-rewriting)

3. Connecting Web pages using Cookie
- [Coookie](#cookie)
- [Process using Cookie](#cookie-process)
- [Cookie API](#cookie-api)

4. Connecting Web pages with using Session
- [Process using Session](#session-process)
- [Session API](#session-api)


<hr>

## Session Tracking
> 사용자 입장에서 웹 페이지 사이의 상태나 정보를 공유하도록 하기 위해 구현해야 하는 웹 페이지 연결 기능
<pre><code>--참고--
HTTP 프로토콜 - Server-Client 통신 시 stateless 방식으로 통신
-- stateless --
각 웹 페이지의 상태나 정보를 다른 페이지들과 공유하지 않는 방식
</code></pre>
- 웹 페이지 연동 방법
  - "hidden" tag
  - URL Rewriting
  - Cookie
  - Session


## "hidden" tag
> HTML의 "hidden" 태그를 이용해 웹 페이지들 사이의 정보 공유<br>
> 브라우저에는 표시되지 않지만 미리 저장된 정보를 Servlet으로 전송할 수 있음<br>
> input type="<hidden>" 형식으로 Servlet으로 전송

## URL Rewriting
> GET 방식으로 URL 뒤에 정보를 붙여 다른 페이지로 전송<br>
> "a" tag를 활용하여 다른 Servlet으로 넘김


## Cookie
> 웹 페이지들 사이의 공유 정보를 Client PC에 저장해 놓고 필요할 때 여러 웹 페이지들이 공유해서 사용할 수 있도록 매개 역할을 하는 방법
- 특징
  - 정보가 Client PC에 저장
  - 저장 정보 용량에 제한 (file capacity : 4kb)
  - 보안이 취약
  - Client Browser에서 사용 유무 설정 가능
  - 도메인 당 cookie가 만들어짐 (웹 사이트 당 하나의 cookie)

- Cookie 종류
<table>
  <tr>
    <td>속성</td>
    <td>Persistence Cookie</td>
    <td>Session Cookie</td>
  </tr>
  <tr>
    <td>생성 위치</td>
    <td>파일로 생성</td>
    <td>브라우저 메모리에 생성</td>
  </tr>
  <tr>
    <td>종료 시기</td>
    <td>쿠키를 삭제하거나 쿠키 설정 값이 종료된 경우</td>
    <td>브라우저를 종료한 경우</td>
  </tr>
  <tr>
    <td>최초 접속 시 전송 여부</td>
    <td>최초 접속 시 서버로 전송</td>
    <td>최초 접속 시 서버로 전송되지 않음</td>
  </tr>
  <tr>
    <td>용도</td>
    <td>로그인 유무 또는 팝업창을 제한할 때</td>
    <td>사이트 접속 시 Session 인증 정보를 유지할 때</td>
  </tr>
</table>
  
## Cookie Process
1. 브라우저로 사이트에 접속
2. 서버는 정보를 저장한 쿠키를 생성
3. 생성된 쿠키를 브라우저로 전송
4. 브라우저는 서버로부터 받은 쿠키 정보를 쿠키 파일에 저장
5. 브라우저가 다시 접속해 서버가 브라우저에게 쿠키 전송을 요청하면 브라우저는 쿠키 정보를 서버에 넘겨줌
6. 서버는 쿠키 정보를 이용해 작업 진행


## Cookie API
> Cookie 클래스 객체를 생성하여 정보를 저장한 후 서버에서 client로 전송해 파일로 저장
- Cookie API 특징
  - javax.servlet.http.Cookie
  - HttpServletResponse의 addCookie()메소드를 이용해 client browser에 cookie를 전송한 후 저장
  - HttpServletRequest의 getCookie()메소드를 이용해 cookie를 서버로 가져옴
- Cookie methods
<table>
  <tr>
    <td>getComment()</td>
    <td>쿠키에 대한 설명을 가져옴</td>
  </tr>
  <tr>
    <td>getComment()</td>
    <td>쿠키에 대한 설명을 가져옴</td>
  </tr>
  <tr>
    <td>getDomain()</td>
    <td>쿠키의 유효한 도메인 정보를 가져옴</td>
  </tr>
  <tr>
    <td>getMaxAge()</td>
    <td>쿠키 유효 기간을 가져옴</td>
  </tr>
  <tr>
    <td>getName()</td>
    <td>쿠키 이름 가져옴</td>
  </tr>
  <tr>
    <td>getPath()</td>
    <td>쿠키의 디렉터리 정보를 가져옴</td>
  </tr>
  <tr>
    <td>getValue()</td>
    <td>쿠키의 설정 값 가져옴</td>
  </tr>
  <tr>
    <td>setComment(String)</td>
    <td>쿠키에 대한 설명을 설정함</td>
  </tr>
  <tr>
    <td>setDomain()</td>
    <td>쿠키의 유효한 도메인을 설정함</td>
  </tr>
  <tr>
    <td>setMaxAge(int)</td>
    <td>쿠키 유효 기간 설정함</td>
  </tr>
  <tr>
    <td>setValue(String)</td>
    <td>쿠키값 설정함</td>
  </tr>
  </table>
  
  
## Session Process
1. 브라우저로 사이트 접속
2. 서버는 접속한 브라우저에 대한 session 객체 생성
3. 서버는 생성된 session id를 client browser에 응답
4. 브라우저는 서버로부터 받은 session id를 브라우저가 사용하는 메모리의 session cookie에 저장 (jsesessionId)
5. 브라우저가 재접속하면 브라우저는 session cookie에 저장된 session id를 서버에 전달
6. 서버는 전송된 session id를 이요해 해당 session에 접근하여 작업을 수행

## Session API
<table>
  <tr>
    <th>Return Type</th>
    <th>Method</th>
    <th>Explain</th>
  </tr>
  <tr>
    <td>Object</td>
    <td>getAttribute(String name)</td>
    <td>속성 이름이 name인 속성 가밧을 Object 타입으로 반환. 해당 속성 이름이 없을 경우 null 값을 반환</td>
  </tr>
  <tr>
    <td>Enumeration</td>
    <td>getAttributeNames()</td>
    <td>session 속성 이름들을 Enumeration 객체 타입으로 반환</td>
  </tr>
  <tr>
    <td>long</td>
    <td>getCreationTime()</td>
    <td>1970년 1월 1일 0시 0분을 기준으로 현재 session이 생성된 시간까지 경과한 시간을 계산하여 1/1000초 값으로 반환ㄱ</td>
  </tr>
  <tr>
    <td>String</td>
    <td>getId()</td>
    <td>session에 할당된 고유 식별자를 String 타입으로 반환</td>
  </tr>
  <tr>
    <td>int</td>
    <td>getMaxInactiveInterval()</td>
    <td>현재 생성된 session을 유지하기 위해 설정된 session 유지 시간을 int 타입으로 반환</td>
  </tr>
  <tr>
    <td>void</td>
    <td>invalidate()</td>
    <td>현재 생성된 session을 소멸</td>
  </tr>
  <tr>
    <td>boolean</td>
    <td>removeAttribute(String name)</td>
    <td>session 속성 이름이 name인 속성을 제거</td>
  </tr>
  <tr>
    <td>void</td>
    <td>setAttribute(String name,Object value)</td>
    <td>session 속성 이름이 name인 속성에 속성 값으로 value를 할당</td>
  </tr>
  <tr>
    <td>void</td>
    <td>setMaxInactiveInterval(int interval)</td>
    <td>session을 유지하기 위한 session 유지 시간을 초 단위로 설정</td>
  </tr>
</table>
  
  
  
  
  
  
  
  
  







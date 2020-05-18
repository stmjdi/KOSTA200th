# Chapter 9. Session & Cookie

1. [Session Tracking](#Session-Tracking)

2. Connecting Web pages with using "hidden" tag & URL Rewriting
- [<hidden> tag](#"hidden"-tag)
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
<pre><code>
--참고--
HTTP 프로토콜 - Server-Client 통신 시 stateless 방식으로 통신
-- stateless --
각 웹 페이지의 상태나 정보를 다른 페이지들과 공유하지 않는 방식
</code></pre>
- 웹 페이지 연동 방법
  - <hidden> tag
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
  
  








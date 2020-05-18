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










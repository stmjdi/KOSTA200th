# Chapter 9. Session & Cookie

1. [Session Tracking](#Session-Tracking)

2. Connecting Web pages with using <hidden> tag & URL Rewriting
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

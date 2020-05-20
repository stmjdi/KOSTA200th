# chapter 7

- 웹 어플리케이션 구성요소 및 기능
  - webShop : 웹 어플리케이션의 루트 디렉터리 -- JSP, HTML파일 저장됨
  - WEB-INF : 웹 어플리케이션에 관한 정보 저장
  - classes : 웹 어플리케이션이 수항하는 서블릿, 일반 클래스들 위치
  - lib : 여러 라이브러리 압축 파일(.jar) 저장 위치
  - web.xml : 배치 지시자로서 일종의 환경 설정 파일

- 웹 어플리케이션에 추가된 구성 요소 및 기능
  - jsp/html : jsp, html 파일이 저장되는 위치
  - css : css 저장 위치
  - image : 이미지 저장 위치
  - js : javascript 파일 저장 위치
  - bin : 어플리케이션에서 사용되는 실행 파일들 위치
  - conf : 프레임워크에서 사용하는 각종 설정 파일 저장
  - src : 자바 소스 파일 저장

- Core method at first
  - [doGet](#doGet)
  - [doPost](#doPost)
<pre><code>
* if you want to handle both, use 'doHandle'
</code></pre>

- Servlet에서 oracleDB 사용하기
  - servlet/oracle 연동
    - eclipse/oracle 연동
    - ojdbcx.jar파일을 lib 폴더에 위치
  - DataSource
    - [ConnectionPool](#Connection-Pool)
      - [JNDI](#JNDI)

- - -

## doGet
- example
<pre><code>
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html;charset='utf-8'");
		String id = request.getParameter("id");
		String pw = request.getParameter("pwd");
		
		PrintWriter out = response.getWriter();
		if(id.equals(user) && pw.equals(pwd)) {
			out.println("<html><body>Login Success</body></html>");
		}
		else {
			out.println("<html><body>Login Failed <br>(wrong login access)</body></html>");
		}
		
}
</code></pre>

## doPost
-example
<pre><code>
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
}
</code></pre>

## Connection Pool
> 필요할 때 마다 미리 연결해 놓은 상태를 이용해 빠르게 DB와 연동하여 작업하기 위해<br>
> 미리 DB와 연결시킨 상태를 유지하는 기술.
### ConnectionPool 동작 과정
> Tomcat 컨테이너 실행 시 ConnectionPool 객체 생성<br>
> 생성된 커넥션 객체를 DB와 연결<br>
> DB와 연동 작업이 필요할 때 응용 프로그램은 ConnectionPool에서 제공하는 메소드 호출하여 연동

## JNDI
> (Java Naming and Directory Interface)
> 필요한 자원을 key/value 쌍으로 저장 후 필요할 때 키를 이용해 값을 얻는 방법

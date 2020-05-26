# jQuery & Ajax function
> Ajax(Asynchronous Javascript + XML or JSON) : js를 사용한 비동기 통신, 즉 client와 server 간의 XML이나 JSON 데이터를 주고받는 기술

- 특징
  - 페이지 이동 없이 데이터 처리가 가능
  - 서버의 처리를 기다리지 않고 비동기 요청이 가능

- jQuery Ajax 사용법
<pre><code>$.ajax{
  type: "post or get",
  async: "true or false",
  url: "요청할 URL",
  data: {서버로 요청할 데이터 },
  dataType: "서버에서 전송받을 데이터 형식(XML, TEXT, HTMLM, JSON ... )"
  success:{
    // 정상 요청, 응답 시 처리
  }
  error: function(xhr,status,error){
    // 오류 발생 시 처리
  }
  complete:function(data,textStatus){
    // 작업 완료 후 처리
  }
});
</code></pre>


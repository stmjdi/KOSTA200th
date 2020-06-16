# Chapter 20. AOP
> AOP는 메소드 안의 주기능과 보조 기능을 분리한 후 선택적으로 메서드 에 적용해서 사용한다는 개념

- 장점
  - 전체 코드에 흩어져 있는 보조 기능을 하나의 장소에 모아서 관리할 수 있음
  - 보조 기능을 자신이 원하는 주기능에 선택적으로 적용할 수 있음
    -> 코드 단순화 / 가독성 향상

- AOP 관련 용어
<table>
  <tr>
    <th>용어</th>
    <th>설명</th>
  </tr>
  <tr>
    <td>aspect</td>
    <td>구현하고자 하는 보조 기능을 의미</td>
  </tr>
  <tr>
    <td>advice</td>
    <td>aspect의 실제 구현체(클래스)를 의미. 메서드 호출을 기준으로 여러 지점에서 실행</td>
  </tr>
  <tr>
    <td>joinpoint</td>
    <td>advice를 적용하는 지점 의미. 스프링은 method 결합점만 제공</td>
  </tr>
  <tr>
    <td>pointcut</td>
    <td>advice가 적용되는 대상을 지정. 패키지 이름/클래스이름/메서드이름을 정규식으로 지정하여 사용</td>
  </tr>
  <tr>
    <td>target</td>
    <td>advice가 적용되는 클래스 의미</td>
  </tr>
  <tr>
    <td>weaving</td>
    <td>advice를 주기능에 적용하는 것 의미</td>
  </tr>
</table>

* 보조 기능에는 로깅 / 보안 / 트랜잭션 등이 있음

- Spring API를 이용한 AOP 기능 구현 과정
  1. target class를 지정
  2. advice class를 지정
  3. 설정 파일에서 pointcut을 설정
  4. 설정 ㅏ일에서 advice & pointcut을 결합하는 advisor를 설정
  5. 설정 파일에서 스프링의 ProxyFactoryBean class를 이용해 target에 advice를 설정
  6. getBean() 메서드로 bean 객체에 접근해 사용



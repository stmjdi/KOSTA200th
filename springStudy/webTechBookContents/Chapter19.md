# Chapter 19. Start Spring Framework

<h3>1. Spring Framework</h3>

> Java Web Application 개발을 위한 open source framework<br>
> Light-weight Framework / Light-weight Container<br>
> (* Tomcat : Servlet Container)
- 특징
  - 경량 컨테이너의 기능 수행
  - 제어 역행(IoC) 기술을 이용해 app간 느슨한 결합 제어
  - 의존성 주입(DI)기능을 지원
  - 관점 지향(AOP) 기능을 이용해 자원 관리
  - 영속성과 관련된 다양한 서비스 지원
  - 수많은 라이브러리 & 연동 기능 지원

- Spring 주요 기능
<table>
  <tr>
    <th>스프링 기능</th>
    <th>설명</th>
  </tr>
  <tr>
    <td>Core</td>
    <td>다른 기능과 설정을 분리하기 위한 IoC 기능을 제공</td>
  </tr>
  <tr>
    <td>Context</td>
    <td>스프링의 기본 기능으로서 application의 각 기능을 하는 Bean에 대한 접근 방법을 제공</td>
  </tr>
  <tr>
    <td>DAO</td>
    <td>JDBC 기능을 좀더 편맇게 사용할 수 있도록 함</td>
  </tr>
  <tr>
    <td>ORM</td>
    <td>hibernate or myBatis 같은 영속성 관련 프레임워크와 연동된 기능 제공</td>
  </tr>
  <tr>
    <td>AOP</td>
    <td>관점 지향 기능을 제공</td>
  </tr>
  <tr>
    <td>Web</td>
    <td>Web Application 개발에 필요한 기능을 제공</td>
  </tr>
  <tr>
    <td>WebMVC</td>
    <td>스프링에서 MVC 구현에 관련된 기능을 제공</td>
  </tr>
</table>

<h3>2. 의존성 주입</h3>

> 연관 관계를 개발자가 직접 코딩을 통해 컴포넌트(클래스)에 부여하는 것이 아니라<br>
> 컨테이너가 연관 관계를 직접 규정하는 것.<br>
> 코드에서 직접적 연관 관계가 발생하지 않아 각 클래스들의 변경이 자유로워진다. (Loosly coupled)

- 의존성 주입의 장점
  - 클래스들 간의 의존 관계를 최소화하여 코드를 단순화할 수 있음
  - application을 더 쉽게 유지 및 관리할 수 있음
  - 객체의 생성, 소멸과 객체 간의 의존 관계를 container가 제어

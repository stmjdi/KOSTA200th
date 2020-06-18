# Chapter 23. MyBatis
> 복잡한 SQL문을 표준화된 방법으로 사용 가능하도록 하는 SQL framework

상세 : [MyBatis API](https://mybatis.org/mybatis-3/ko/index.html)

- 특징
  - SQL 실행 결과를 java beans or Map 객체에 매핑해주는 persistence 솔루션으로 관리
    - SQL문을 소스 코드가 아닌 XML로 분리
  - SQL문과 프로그래밍 코드를 분리해서 구현
  - DataSource 기능과 트랜잭션 처리 기능을 제공

- Persistence Framework로 사용된 MyBatis 구조
![myBatisStr](https://user-images.githubusercontent.com/60098657/84971660-2d17e300-b158-11ea-8cbd-8a20e84a61c2.png)
1. SqlMapConfig.xml에 각 기능별로 실행할 SQL문을 SqlMap.xml에 미리 작성한 후 등록
2. application에서 DB와 연동하는 데 필요한 데이터를 각각의 매개변수에 저장한 후 myBatis에 전달
3. application에서 요청한 SQL문을 SqlMap.xml에서 선택
4. 전달한 매개변수와 선택한 SQL문을 결합
5. 매개변수와 결합된 SQL문을 DBMS에서 실행
6. DBMS에서 반환된 데이터를 application에서 제공하는 적당한 매개변수에 저장한 후 반환


- 필요 실행파일
  - SqlMapConfig.xml (dataSource 설정 및 sql문 xml 파일 위치 지정)
  - member.xml (관련 sql문 설정)
  
- SqlSession(Java) class에서 제공하는 여러 메소드
<table>
  <tr>
    <th>Method</th>
    <th>function</th>
  </tr>
  <tr>
    <td>List selectList(query_id)</td>
    <td>id에 대한 select문을 실행한 후 여러 레코드를 List로 반환</td>
  </tr>
  <tr>
    <td>List selectList(query_id,조건)</td>
    <td>id에 대한 select문을 실행하면서 사용되는 조건도 전달</td>
  </tr>
  <tr>
    <td>T selectOne(query_id)/td>
    <td>id에 대한 select문을 실행한 후 지정한 타입으로 한 개의 레코드를 반환</td>
  </tr>
  <tr>
    <td>T selectOne(query_id,조건)</td>
    <td>id에 대한 select문을 실행하면서 사용되는 조건도 전달</td>
  </tr>
  <tr>
    <td>Map<'K,V'> selectMap(query_id,조건)</td>
    <td>id에 대한 select문을 실행하면서 사용되는 조건도 전달. Map 타입으로 레코드 반환</td>
  </tr>
  <tr>
    <td>int insert(query_id,Object obj)</td>
    <td>id에 대한 insert문을 실행하면서 obj 객체의 값을 테이블에 추가</td>
  </tr>
  <tr>
    <td>int update(query_id,Object obj)</td>
    <td>obj 객체의 값을 조건문의 수정 값으로 사용해 id에 대한 update문을 실행</td>
  </tr>
  <tr>
    <td>int delete(query_id,Object obj)</td>
    <td>obj 객체의 값을 조건문의 조건 값으로 사용해 id에 대한 delete문을 실행</td>
  </tr>
</table>

  

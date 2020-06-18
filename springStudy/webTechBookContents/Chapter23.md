# Chapter 23. MyBatis
> 복잡한 SQL문을 표준화된 방법으로 사용 가능하도록 하는 SQL framework

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

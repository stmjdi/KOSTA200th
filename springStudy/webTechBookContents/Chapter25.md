# Chapter 25. Transaction
> 여러 개의 DML 명령문을 하나의 논리적인 작업 단위로 묶어서 관리하는 것<br>
> All or Nothing 방식으로 작업 단위 처리<br>
> 즉 SQL 명령문들이 모두 정상적으로 처리 -> Commit / 하나라도 잘못된 것이 있음 -> Rollback
> 각 단위 기능 수행 시 이와 관련된 DB 연동 작업을 한꺼번에 묶어서 관리한다는 개념

- 보통 Web Application에서 묶어서 처리하는 단위 기능
  - 게시판 글 조회 시 해당 글을 조회하는 기능 & 조회 수 갱신 기능
  - 쇼핑몰에서 상품 주문 시 주문 상품을 테이블에 등록하는 기능 & 주문자의 포인트 갱신 기능
  - 은행에서 송금 시 송금자의 잔고를 갱신하는 기능 & 수신자의 잔고를 갱신하는 기능

<b>(* 즉 DB를 연동해야 하는 두 기능이 긴밀하게 묶여있는 경우 트랜잭션을 통해 동기화를 수행)</b>

![trxEx](https://user-images.githubusercontent.com/60098657/85239014-a53e1b80-b46c-11ea-943a-e2e8317feb0c.png)

- Spring's Transaction Attributes
<table>
  <tr>
    <th>Attribute</th>
    <th>Function</th>
  </tr>
  <tr>
    <td>propagation</td>
    <td>transaction 전파 규칙 설정</td>
  </tr>
  <tr>
    <td>isolation</td>
    <td>transaction 격리 레벨 설정</td>
  </tr>
  <tr>
    <td>realOnly</td>
    <td>읽기 전용 여부 설정</td>
  </tr>
  <tr>
    <td>rollbackFor</td>
    <td>transaction을 Rollback할 예외 타입 설정</td>
  </tr>
  <tr>
    <td>norollbackFor</td>
    <td>transaction을 Rollback하지 않을 예외 타입 설정</td>
  </tr>
  <tr>
    <td>timeout</td>
    <td>transaction timeout 시간 설정</td>
  </tr>
</table>

- Propagation Attribute's values
<table>
  <tr>
    <th>Value</th>
    <th>Meaning</th>
  </tr>
  <tr>
    <td>REQUIRED</td>
    <td>- transaction 필요, 진행중인 transaction이 있는 경우 해당 transaction 사용<br>
      - transaction이 없으면 새로운 transaction 생성, default value
    </td>
  </tr>
  <tr>
    <td>MANDATORY</td>
    <td>- transaction 필요<br>
      - 진행중인 transaction이 없는 경우 예외 발생
    </td>
  </tr>
  <tr>
    <td>REQUIRED_NEW</td>
    <td>- 항상 새로운 transaction 생성<br>
      - 진행중인 transaction이 있는 경우 기존 transaction을 일시 중지시킨 후 새로운 transaction 시작<br>
      - 새로 시작된 transaction이 종료되면 기존 transaction 계속 진행
    </td>
  </tr>
  <tr>
    <td>SUPPORTS</td>
    <td>- transaction 필요 없음<br>
      - 진행중인 transaction이 있는 경우 해당 transaction 사용
    </td>
  </tr>
  <tr>
    <td>NOT_SUPPORTED</td>
    <td>- transaction 필요 없음<br>
      - 진행 중인 transaction이 있는 경우 기존 transaction을 일시 중지시킨 후 method 실행<br>
      - method 싷행이 종료되면 기존 transaction 게속 진행
    </td>
  </tr>
  <tr>
    <td>NEVER</td>
    <td>- transaction 필요 없음<br>
      - 진행중인 transaction이 있는 경우 예외 발생
    </td>
  </tr>
  <tr>
    <td>NESTED</td>
    <td>- transaction 필요<br>
      - 진행중인 transaction이 있는 경우 기존 transaction에 중첩된 transaction에서 method 실행<br>
      - transaction이 없으면 새로운 transaction 생성
    </td>
  </tr>
</table>

- isolation Attribute's values
<table>
  <tr>
    <th>Attribute</th>
    <th>Function</th>
  </tr>
  <tr>
    <td>DEFAULT</td>
    <td>DB애서 제공하는 기본 설정 사용</td>
  </tr>
  <tr>
    <td>READ_UNCOMMITED</td>
    <td>다른 transaction에서 commit하지 않은 데이터 읽기 기능</td>
  </tr>
  <tr>
    <td>READ_COMMITED</td>
    <td>commit한 데이터만 읽기 가능</td>
  </tr>
  <tr>
    <td>REPEATABLE_READ</td>
    <td>현재 transaction에서 데이터를 수정하지 않았다면 처음 읽어온 데이터와 두 번째 읽어온 데이터가 동일</td>
  </tr>
  <tr>
    <td>SERIALIZABLE</td>
    <td>같은 데이터에 대해 한 개의 transaction만 수행 가능</td>
  </tr>
</table>


  


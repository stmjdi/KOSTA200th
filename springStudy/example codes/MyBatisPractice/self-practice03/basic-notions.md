# Transaction
> DB의 상태를 변환시키는 하나의 논리적 기능을 수행하기 위한 작업의 단위 또는 한꺼번에 모두 수행되어야 할 일련의 연산들

- Transaction 특징
  - Transaction은 DB System에서 병행 제어 및 회복 작업 시 처리되는 작업의 논리적 단위
  - 사용자가 시스템에 대한 서비스 요구 시 시스템이 응답하기 위한 상태 변환 과정의 작업 단위
  - 하나의 transaction은 Commit or Rollback

- Transaction의 성질
  - 원자성 (Atomicity)
    - 한 트랜잭션 내에서 실행한 작업들은 하나로 간주. 즉, 모두 성공 or 실패
  - 일관성 (Consistency)
    - transaction은 일관성 있는 DB 상태를 유지 (data integrity 만족 등)
  - 격리성 (Isolation)
    - 동시에 실행되는 transaction들이 서로 영향을 미치지 않도록 격리해야 함
  - 지속성 (Durability)
    - Transaction을 성공적으로 마치면 결과가 항상 저장되어야 함

- Transaction의 상태
  - 활동(Active) : transaction이 실행 중인 상태
  - 실패(Failed) : transaction 실행에 오류가 발생하여 중단된 상태
  - 철회(Aborted) : transacgtion이 비정상적으로 종료되어 Rollback 연산을 수행한 상태
  - 부분 완료(Partially Commited) : transaction의 마지막 연산까지 실행했지만, Commit 연산이 실행되기 직전의 상태
  - 완료(Commited) : transaction이 성공적으로 종료되어 Commit 연산을 실행한 후의 상태
![statusTrans](https://user-images.githubusercontent.com/60098657/85265692-99267e00-b4ad-11ea-95bf-02430853b430.png)

- 다수의 Transaction이 경쟁 시 발생할 수 있는 문제

<b>1. Dirty Read</b>
<pre><code>아직 transaction이 완료되지 않은 상황에서 데이터에 접근을 허용할 경우 발생할 수 있는 데이터 불일치</code></pre>
<b>2. Non-Repeatable Read</b>
<pre><code>한 Transaction에서 같은 쿼리를 두 번 실행했을 때 발생할 수 있는 데이터 불일치
* Dirty Read에 비해선 발생 활률 적음</code></pre>
<b>3. Phantom Read</b>
<pre><code>한 transaction에서 일정 범위의 레코드를 두 번 이상 읽을 때 발생하는 데이터 불일치</code></pre>


[출처 : https://coding-factory.tistory.com/226]<br>
[출처 : https://goddaehee.tistory.com/167]



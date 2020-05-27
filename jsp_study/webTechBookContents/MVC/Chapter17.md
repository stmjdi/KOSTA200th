# Chapter 17.Developing with 2-Model efficiently

1. Model 2
- 특징
  - 각 기능이 서로 분리되어 있어 개발 및 유지보수가 쉬움
  - 각 기능(모듈)의 재사용성이 높음
  - 디자이너와 개발자의 작업을 분업화해서 쉽게 개발 가능
  - 모델2 방식과 관련된 기능이나 개념의 학습 필요
  
2. MVC 디자인 패턴
- [구성요소](#구성요소)

3. [MVC Examples](#mvcexs)



<hr>

## MVC Design Pattern
### 구성요소
- Controller
  - Servlet이 controller 역할
  - client의 요청을 분석
  - 요청에 대해 필요한 model 호출
  - model에서 처리한 결과를 보여주기 위해 JSP를 선택
- Model
  - DB 연동과 같은 비즈니스 로직 수행
  - 일반적으로 DAO, VO 클래스로 이루어짐
- View
  - JSP가 화면 기능 담당
  - Model에서 처리한 결과를 화면에 표시
  

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
  - doGet
  - doPost
'''
* if you want to handle both, use 'doHandle'
'''

## useful informations about spring

1. https://docs.spring.io/spring/docs/current/spring-framework-reference/ --- spring references
2. https://supawer0728.github.io/2018/03/11/Spring-Framework-5.0.4.RELEASE-Reference-Core-(Chapter5)/
<br>Simple Examples to show AOP Codes
3. https://gmlwjd9405.github.io/2018/11/10/spring-beans.html -- about spring bean & its scopes
4. https://blog.woniper.net/338 -- spring IoC Container _ about beanFacotry& ApplicationContext
5. http://ldg.pe.kr/framework_reference/spring/ver1.2.2/html/beans.html -- 4.의 상세 
6. https://gmlwjd9405.github.io/2018/12/02/spring-annotation-types.html -- spring annotations description


<hr>

### ApplicationContext -- xml 위치 지정
1. XmlBeanFactory : Resource 객체를 사용해 컨텍스트 정의 파일을 로딩하는 단순한 BeanFactory

2. ClassPathXmlApplicationContext : 클래스 경로로부터 컨텍스트 정의 파일을 로딩하는 ApplicationContext

3. FileSystemXmlApplicationContext : 파일 시스템으로부터 컨텍스트 정의 파일을 로딩하는 ApplicationContext

4. XmlWebApplicationContext : 웹 어플리케이션 컨텍스트로부터 컨텍스트 정의 파일을 로딩하는 ApplicationContext

### FactoryBean -- ''
1. ByteArrayResource : 메모리에 있는 바이트 배열로 만들어진 리소스를 표현

2. ClassPathResource : 클래스패스에서 읽는 리소스를 표현

3. DescriptiveResource : 실제 읽을 용도가 아닌 리소스에 대한 정보만을 담기 위한 리소스

4. FileSystemResource : 파일 시스템에서 읽는 리소스 표현

5. InputStreamResource : 입력 스트림으로 넘어오는 리소스 표현

6. UrlResource : URL에서 읽는 리소스를 표현

7. PortletContextResource : Portlet 컨텍스트에서 읽는 리소스

8. ServletContextResource : 서블릿 Context에서 읽는 리소스 표현

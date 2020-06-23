# Chapter 26. Spring Annotation

1. Spring Annotation

- Classes related to Spring Annotation
<table>
  <tr>
    <th>Class</th>
    <th>Function</th>
  </tr>
  <tr>
    <td>DefaultAnnotationHandlerMapping</td>
    <td>class-level에서 @RequestMapping을 처리</td>
  </tr>
  <tr>
    <td>AnnotationMethodHandlerAdapter</td>
    <td>method-level에서 @RequestMapping을 처리</td>
  </tr>
</table>

- "context:component-scan" tag
> 이 태그를 사용해 패키지 이름을 지정 -> application 실행 시 해당 패키지에서 annotation으로 지정된 클래스를 빈으로 만들어줌

- Stereo type Annotaions
<table>
  <tr>
    <th>Annotation</th>
    <th>Function</th>
  </tr>
  <tr>
    <td>@Controller</td>
    <td>Spring Container가 component-scan에 의해 지정한 클래스를 controller bean으로 자동 변환
  </tr>
  <tr>
    <td>@Service</td>
    <td>Spring Container가 component-scan에 의해 지정한 클래스를 Service bean으로 자동 변환
  </tr>
  <tr>
    <td>@Repository</td>
    <td>Spring Container가 component-scan에 의해 지정한 클래스를 DAO bean으로 자동 변환
  </tr>
  <tr>
    <td>@Component</td>
    <td>Spring Container가 component-scan에 의해 지정한 클래스를 bean으로 자동 변환
  </tr>
</table>



  

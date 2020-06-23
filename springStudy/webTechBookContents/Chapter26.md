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

2. <b>@RequestParam</b>
> 단일 parameter를 전달 받을 때 사용하는 annotation

### Example
<pre><code>@Controller("mainController")
@RequestMapping("/test")
public class MainController {
	@ModelAttribute("view2")
	public String view2() {
		return "ModelAttribute view2!!";
	}
	
	@RequestMapping("inputForm.do")
	public String inputForm(Model model) {
		return "inputForm";
	}
	
   @RequestMapping(value="/test1.do" ,method=RequestMethod.GET)
   public ModelAndView main1(@RequestParam Map<String,String> info,HttpServletRequest request, HttpServletResponse response)  throws Exception{
      ModelAndView mav=new ModelAndView();
      mav.addObject("msg","main1");
      mav.addObject("id",info.get("id"));
      mav.addObject("name",info.get("name"));
      
      mav.setViewName("index");
      return mav;
   }

   @RequestMapping(value="/main2.do" ,method = RequestMethod.GET)
   public ModelAndView main2(HttpServletRequest request, HttpServletResponse response) throws Exception{
      ModelAndView mav=new ModelAndView();
      mav.addObject("msg","main2");
      mav.setViewName("index");
      return mav;
   }
}
</code></pre>



package test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/*
 * 어노테이션을 이용해서 컨트롤러를 작성하는 경우 메소드를 정의할때 개발자가 원하는 형태로 메소드를 정의할수 있다.
 * 매개변수나 리턴타입으로 올 수 았는 타입들이 정해져 있긴 하지만 그 안에서 원하는 스펙을 다양하게 적용할 수 있다.
 * 리턴타입: String, void, ModelAndView...
 * 		   String : 뷰에 대한 정보만 리턴할때 사용
 * 		   ModelAndView : 공유할 데이터와 뷰에 대한 정보를 함께 리턴
 * 매개변수: String, HttpServletRequest, HttpServletResponse,
 *		   HttoSession, Model, DTO....... 		
 */
@Controller
public class IndexController {
	//우리가 추가한 main()메소드가 요청될 path를 어노테이션으로 등록
	//@RequestMapping 안에 정의하는 path는 <bean>의 name
	@RequestMapping("/index.do")
	public String main() {
		System.out.println("어노테이션 기반 컨트롤러");
		return "test/index";
	}

}
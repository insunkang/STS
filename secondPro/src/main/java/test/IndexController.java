package test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class IndexController  {

	@RequestMapping("/index.do")
	public String main() {
		System.out.println("어노테이션 로드");
		return "test/index";
	}

}

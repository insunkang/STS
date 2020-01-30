package multi.erp.emp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//emp테이블에서 만들어지는 모든 내용에 대한 controller

@Controller
public class EmpController {
	@RequestMapping("/emp/login.do")
	public String login() {
		return "login";
	}

}

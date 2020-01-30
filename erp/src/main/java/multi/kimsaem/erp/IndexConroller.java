package multi.kimsaem.erp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexConroller {

		@RequestMapping("/index.do")
		public String main() {
			System.out.println("index메인 컨트롤러");
			return "index";
		}
		
}

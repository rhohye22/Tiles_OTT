package ITzy.OTT.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HomeController {

//	@GetMapping(value = "/main.do")
//	public String login() {
//		System.out.println("MemberController main() " + new Date());
//		
//		return "main";
//	}
	
	@GetMapping(value = "/admin.do")
	public String bbslist() {
		System.out.println("MemberController bbslist() " + new Date());
		
		return "admin/admin";
	}
}

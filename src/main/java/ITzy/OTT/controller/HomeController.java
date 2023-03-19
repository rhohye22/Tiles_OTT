package ITzy.OTT.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HomeController {

	
	@GetMapping(value = "/admin.do")
	public String bbslist() {
		System.out.println("MemberController bbslist() " + new Date());
		
		return "admin/admin";
	}
}

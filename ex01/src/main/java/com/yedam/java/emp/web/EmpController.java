package com.yedam.java.emp.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmpController {
//컨트롤러등록
	@RequestMapping("/allList")
	public String getEmpList(Model model, @RequestParam String msg) {// String view -> 실행 : http://localhost:8081/java/allList?msg=all
		model.addAttribute("msg", msg);
		
		return "empList";//not void
	}

}

package com.yedam.java.emp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.yedam.java.emp.service.EmpService;
import com.yedam.java.emp.service.EmpVO;

@Controller
public class EmpController {
//컨트롤러등록 -> 서비스 자료요청하면 해당 서비스가 db연결 필요할 경우에 해줌
//DB랑 실제 연결 : 비지니스 로직(인터페이스+구현클래스)(실행하는 아이)

	@Autowired
	EmpService empService; // 구현클래스 여러개 일때는 이름 붙혀주기

	@RequestMapping("/allList")
	// , @RequestParam String msg)
	public String getEmpList(Model model) { // String view -> 실행 : http://localhost:8081/java/allList?msg=all
		model.addAttribute("empInfoList", empService.selectAllEmp());

		return "emp/empList";// not void
	}

	// 단건 조회 컨트롤러
	//조회할 식별 정보 : EmpVO empVO / 다시 돌려줄 객체 : Model model
	@GetMapping("/info")
	public String getEmpInfo(EmpVO empVO, Model model) {
		EmpVO findEmp = empService.selectOneEmp(empVO);
		model.addAttribute("empInfo",findEmp);
		return "emp/empInfo";
	}
	
	
	//단순 페이지 전환
	@GetMapping("insertForm")
	public String printInsertForm() {
		return "emp/insertForm";
		
	}
	
	
	//(단순 페이지 전환) -> 등록 처리 
	@PostMapping("insert")
	//form으로 보내는 경우 @보다 form으로 보내는게 더 편안 
	public String empInsert(EmpVO empVO,  RedirectAttributes ratt) {
		//성공 후 페이지 전환 : Redirect(요청 끝 -> 재요청시 RedirectAttributes ) -> 성공, 실패 시 메세지
		
		int resutl = empService.insertEmpInfo(empVO);
		if(resutl == 1) {
			ratt.addFlashAttribute("msg", "정상적으로 등록되었습니다.");
		} else {
			ratt.addAttribute("msg", "정상적으로 등록되지 않았습니다.");
		} //<-> 에드플래쉬는 일시적으로 세션에 저장
		
		//redirect(할때 ):allList(상대경로로 들어가서 경로 불러주면 됨)
		return "redirect:allList";
	}
	
	
	//연봉인상
	@PostMapping("updateSal")
	public String empUpdateSal(@RequestParam int employeeId, RedirectAttributes ratt) {
		
		int resutl = empService.updateEmpSal(employeeId);
		if(resutl == 1) {
			ratt.addFlashAttribute("msg", "정상적으로 처리되었습니다.");
		} else {
			ratt.addAttribute("msg", "정상적으로 처리되지 않았습니다.");
		}
		
		return "redirect:allList";
	}
	
	
	@GetMapping("delete/{empId}")
	@ResponseBody
	public String empDelete(@PathVariable int empId) {
		int result = empService.deleteEmpInfo(empId);
		String message = null;
		if(result ==1) {
			message = "사원번호 : " + empId + "삭제되었습니다.";
			
		} else {
			message ="삭제되지 않았습니다.";
		}
		
	}
	
	
	
}

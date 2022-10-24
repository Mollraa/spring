package com.yedam.java.emp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yedam.java.emp.service.EmpReqVO;
import com.yedam.java.emp.service.EmpService;
import com.yedam.java.emp.service.EmpVO;

@RestController
//@RestController : view생성 안함

//@CrossOrigin("http://127.0.0:5500")
@CrossOrigin("*") //-> 쉽게 뚤림, restserver: 보안에 취약 
public class EmpRestController {

	//기존에 등록된 서비스 호출
	@Autowired
	EmpService service;
	
	//전체조회 - select = get
	@GetMapping("/emp")
	public List<EmpVO> empSelect(){
		//기존과 달리 model 필요없
		//EmpReqVO : mapper.xml에 요구하는 아이
		return service.getEmpList(new EmpReqVO());
		//서버올리고 -> http://localhost:8081/java/emp 호출 (보여지는 값 : body에 있는 값들)
	}
	
	//사원조회
	//{employeeId} = @PathVariable String employeeId => 경로로 가져오니까, 같게 해줘야함
	@GetMapping("/emp/{employeeId}")
	public EmpVO empFind(@PathVariable String employeeId) {
		EmpVO empVO = new EmpVO();
		empVO.setEmployeeId(employeeId);
		return  service.getEmp(empVO);
		//key value에서 -> value만 반환
	}
	
	//사원등록
	//empInsert() : json할지 api할지 정해줘야함, 근데 그냥 제이슨으로 오게할거임
	//json반환시 빈값은 반환안됨, 뭐라도 넣어주기
	@PostMapping("/emp")
	public EmpVO empInsert(@RequestBody EmpVO empVO) {
		service.insert(empVO);
		return empVO;
	} //서버올리고 -> http://localhost:8081/java/emp/206 (사원 아무나 입력해서 확인)
	//=> 부메랑으로 실습
	
	//사원수정
	//@PutMapping : 복합적 사용가능 (@PathVariable + @RequestBody)
	//경로에서 접근하려는 사원정보, body에서 수정하려는 정보
	@PutMapping("/emp/{employeeId}")
	public EmpVO empUpdate(@PathVariable String employeeId, @RequestBody EmpVO empVO) {
		//id + 업데이트 정보 두가지 값 필요
		empVO.setEmployeeId(employeeId); //누구 정보인지 알려주고
		service.updateEmp(empVO); //업데이트 진행
		return empVO;
	}
	
	//사원삭제
	@DeleteMapping("/emp/{employeeId}")
	public EmpVO empDelete(@PathVariable String employeeId) {
		EmpVO empVO = new EmpVO();
		empVO.setEmployeeId(employeeId);
		service.deleteEmp(empVO);
		return empVO;
	}
}

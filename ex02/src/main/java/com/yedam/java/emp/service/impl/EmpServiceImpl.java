package com.yedam.java.emp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.java.emp.mapper.EmpMapper;
import com.yedam.java.emp.service.EmpService;
import com.yedam.java.emp.service.EmpVO;

@Service //bean등록, interface는 등록 안됨
//@Service("empDAO")
public class EmpServiceImpl implements EmpService {
	//내부구성, 실제 동작하는 아이들 
	
	
	//매퍼야 이리와바 
	@Autowired
	EmpMapper empMapper;
	
	
	
	@Override
	public List<EmpVO> selectAllEmp() {
		return empMapper.getEmpList();
	}

	@Override
	public EmpVO selectOneEmp(EmpVO empVO) {
		return empMapper.getEmp(empVO); //정보 하나 가져옴
	}

	@Override
	public int insertEmpInfo(EmpVO empVO) {
//실제 알고리즘이 들어가는 곳 ex
//	double salary = empMapper.selectSalTable(empVO.getDepartmentId());
//	empVO.setSalary(salary);
//	empMapper.insertEmp(empVO);
	return empMapper.insertEmp(empVO);
// 다량의 정보 보고싶엉
//	public int insertEmpInfo(List<EmpVO> empVO) {
//		for(EmpVO empinfo : empVO) {
//			
//		}
//		return 0;
//	}
}
	

	@Override
	public int updateEmpSal(int EmpId) {
		return empMapper.updateEmpSalary(EmpId);
	}

	@Override
	public int deleteEmpInfo(int empId) {
		return empMapper.deleteEmpInfo(empId);
	}

}

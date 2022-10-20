package com.yedam.java.emp.service;

import java.util.List;

public interface EmpService {
	//mapper랑 같아도 되고, 달라도 상관 없음
	//실습 : 이름 일부러 다르게 함
	
	//전체조회
	public List<EmpVO> selectAllEmp();
	
	//단건조회
	public EmpVO selectOneEmp(EmpVO empVO);
	
	//등록
	public int insertEmpInfo(EmpVO empVO);
	
	//수정
	public int updateEmpSal(int EmpId);
	
	//삭제
	public int deleteEmpInfo(int empId);
}

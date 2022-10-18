package com.yedam.java.emp.mapper;

import com.yedam.java.emp.service.EmpVO;

public interface EmpMapper {
	//sql문이 mapping될 class를 만들 interface
	
	public EmpVO getEmp(EmpVO empVO);
	
}

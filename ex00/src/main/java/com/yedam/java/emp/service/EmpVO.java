package com.yedam.java.emp.service;

import lombok.Data;

@Data
public class EmpVO {
//	하이폰 쓸 수 있는 이유: 별도의 설정파일 안해줘서 가능 (마이바티스 같은 칭구들.. 
//	지금은 이름이 정확하게 일치할 이유가 없어서 가능하다): 설정해주는거 root-context.xml -> 마이바티스 셋팅
	String employeeId;
	String firstname;
	String lastname;
	String email;
	String hiredate;
	String jobid;
	String departmentId;
	String salary;
}

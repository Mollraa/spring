package com.yedam.java.emp.service;

import java.util.Date; //sql로 가져오면 안됨. 둘다 비슷하게 생겼지만 다른성격

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class EmpVO {
	private int employeeId; //employee_id
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	//기존: yyyy/MM/dd -> 변경yyyy-MM-dd 
	//우리나라 시간타입으로 바꿔주고 써야함 
	@DateTimeFormat(pattern="yyyy-MM-dd") 
	private Date hireDate;
	private String jobId;
	private double salary;
	private double commissionPCT;
	private int managerId;
	private int departmentId;
	
	
	
}

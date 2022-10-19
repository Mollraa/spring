package com.yedam.java.emp.service;

import java.util.Date; //sql로 가져오면 안됨. 둘다 비슷하게 생겼지만 다른성격

import lombok.Data;

@Data
public class EmpVO {
	private int employeeId; //employee_id
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private Date hireDate;
	private String jobId;
	private double salary;
	private double commissionPCT;
	private int managerId;
	private int departmentId;
	
	
	
}

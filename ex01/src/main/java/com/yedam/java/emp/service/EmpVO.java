package com.yedam.java.emp.service;

import java.util.Date; //sql�� �������� �ȵ�. �Ѵ� ����ϰ� �������� �ٸ�����

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

package com.yedam.java.emp.service;

import lombok.Data;

@Data
public class EmpVO {
//	������ �� �� �ִ� ����: ������ �������� �����༭ ���� (���̹�Ƽ�� ���� Ī����.. 
//	������ �̸��� ��Ȯ�ϰ� ��ġ�� ������ ��� �����ϴ�): �������ִ°� root-context.xml -> ���̹�Ƽ�� ����
	String employeeId;
	String firstname;
	String lastname;
	String email;
	String hiredate;
	String jobid;
	String departmentId;
	String salary;
}

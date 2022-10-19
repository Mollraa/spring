package com.yedam.java.emp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yedam.java.emp.service.EmpVO;

//import org.apache.ibatis.annotations.Mapper;
//
//@Mapper: xml������� ��ĵ�ϴ°Ծƴ�. �����ϴ� �ʿ� @�� ���۽�ĵ. ���� �Ⱦ�
//	<->	mybatis mapper�� �������ؼ� ������ ���� 
public interface EmpMapper {
//	mapper : �ַ� �ϳ��� ���̺� ���� 

	//�⺻���� CRUD
	// ��ü��ȸ
	public List<EmpVO> getEmpList();
	
	// �ܰ���ȸ : ��ȸ���� -> EmpVO
	public EmpVO getEmp(EmpVO empVO);
	
	// ���
	public int insertEmp(EmpVO empVO);
	
	// ���� : ���� 10%�λ�
	public int updateEmpSalary(@Param("eId") int employeeId);
		//vo���� �ΰ��� �̻� ���� ���� �� param����ټ����� �޾��ֱ� 
		//mybatis sql�ȿ����� ����� -  mapper mapping���� employeeId�� �̸����� �ްڴٴ� �ǹ� 
	
	// ����2 : ��������� �Ѱܹ޾Ƽ� �̸���, ��, �̸����� ������ �� �ִ� �޼ҵ�
	public int updateEmpInfo(EmpVO empVO);
	
	// ����
	public int deleteEmpInfo(int employeeId);
}

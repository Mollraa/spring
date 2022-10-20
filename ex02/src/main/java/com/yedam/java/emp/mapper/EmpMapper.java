package com.yedam.java.emp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yedam.java.emp.service.EmpVO;

//import org.apache.ibatis.annotations.Mapper;
//
//@Mapper: xml방식으로 스캔하는게아님. 시작하는 쪽에 @로 매퍼스캔. 아직 안씀
//	<->	mybatis mapper랑 비슷비슷해서 뭘쓰던 갠츈 
public interface EmpMapper {
//	mapper : 주로 하나의 테이블에 연결 

	// 기본적인 CRUD
	// 전체조회
	public List<EmpVO> getEmpList();

	// 단건조회 : 조회조건 -> EmpVO
	public EmpVO getEmp(EmpVO empVO);

	// 등록
	public int insertEmp(EmpVO empVO);

	// 수정 : 연봉 10%인상
	public int updateEmpSalary(@Param("eId") int employeeId);
	// vo제외 두가지 이상 값을 받을 때 param어너텐션으로 받아주깅
	// mybatis sql안에서만 사용함 - mapper mapping에서 employeeId이 이름으로 받겠다는 의미

	// 수정2 : 사원정보를 넘겨받아서 이름과, 성, 이메일을 수정할 수 있는 메소드
	public int updateEmpInfo(EmpVO empVO);

	// 삭제
	public int deleteEmpInfo(int employeeId);
}

package com.yedam.java.emp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.yedam.java.emp.mapper.EmpMapper;
import com.yedam.java.emp.service.EmpVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/*-context.xml")

public class EmpMapperTest {
	@Autowired
	EmpMapper mapper;

	@Before
	public void testDivid() {
		System.out.println("--------------------");
	}

//@Test : 실행하고싶은곳 클릭하고 런, 보고싶은 결과만 test에 주석 해제
	//@Test
	public void returnObjectTest() {
		assertNotNull(mapper);
	} //JUnit 
	
	//@Test
	public void empAllSelectTest() {
		List<EmpVO> empList = mapper.getEmpList();
		for(EmpVO empInfo : empList) {
			System.out.println(empInfo.getLastName());
		}
	}
	
	//@Test
	//오류 sql(?,?,?..) : 오타 내면 오류 남
	public void empInsertTest() {
		EmpVO empVO = new EmpVO();
		empVO.setFirstName("11");
		empVO.setLastName("11");
		empVO.setEmail("11@naver.com");
		empVO.setJobId("IT_PROG");
		empVO.setSalary(99999);
		
		mapper.insertEmp(empVO);
		
		assertEquals(empVO.getEmployeeId(), 211);
	}
	
	//@Test
	public void updateEmpSalary() {
		int result = mapper.updateEmpSalary(207);
		assertEquals(result, 1);
	}
	
	//@Test
	public void deleteEmpInfoTest() {
		int result = mapper.deleteEmpInfo(211);
		assertEquals(result, 1);
	}
	
	@Test
	public void updateEmpInfoTest() {
		EmpVO empVO = new EmpVO();
		empVO.setEmployeeId(207);
		empVO.setFirstName("Na Na");
//		empVO.setLastName("Su");
		empVO.setEmail("nanaSuu@goolgle,co");
	
		int result = mapper.updateEmpInfo(empVO);
		assertEquals(result, 1);
	}
}

package com.yedam.java.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.java.test.service.AaaService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/**/*-context.xml")
// 값 안들어간 오류 : 경로 잘 못 잡아줌(mapper.xml생성 안해도 -> 서블릿으로 바로 값을 넘 길수있다)
public class TxTest {
	
	@Autowired
	AaaService service;
	
	@Test
	public void txTest() {
		//service.insert();
		service.test();
	}
}

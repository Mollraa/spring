package com.yedam.java.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.java.test.service.Cats;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class AopTest {
	@Autowired
	Cats myCat;
	
	@Test
	public void aopTest() {
		myCat.getName(); // 아무 메서드나 실행
		System.out.println("=============");
	}

}

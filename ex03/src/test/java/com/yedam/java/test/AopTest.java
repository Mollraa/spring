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
	
	//@Test
	public void aopTest() {
		myCat.getName(); // 아무 메서드나 실행
		
		System.out.println("=======================");
		//로그개념 : 실제 메서드가 출력된 흔적 X -> 어느 메서드가 출련된지 확인 가능 
		
		System.out.println("1)");
		String catName = myCat.getName();
		
		
		System.out.println("2)");
		System.out.println(catName);
	}
	
	@Test
	public void aopTest2() {
		//aop -> 그림자 클래스 호출은 interface인데 this.는 나 자신이라서 호출, 실제 2개 동작 this쓰면 안되는이유
		myCat.printInfo();
		System.out.println("=======================");
		myCat.printData();
	}

}

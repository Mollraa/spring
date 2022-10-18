package com.yedam.anotation;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


//오류남 

//컨테이너 떄문에 junit으로만 스프링 테스트어려움 => class, locations 필요
//1.@RunWith(단위테스트 주체가 달라짐.) -> SpringJUnit4ClassRunner 해당 러너가 달라짐
@RunWith(SpringJUnit4ClassRunner.class)

//2.@ContextConfiguration - 테스트 컨데이너 만들기
@ContextConfiguration(locations="classpath:applicationContext.xml")


public class SpringTest {
	
//	@Autowired
//	TV tv;
	
	@Autowired
	ApplicationContext ctx; 
	
	@Test
	public void beanTest() {
		//빈 생성 확인
		TV tv = ctx.getBean(SamsungTV.class);
		assertNotNull(tv); 
	}
	

}

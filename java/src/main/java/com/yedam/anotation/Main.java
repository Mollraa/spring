package com.yedam.anotation;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	
	//main오류 : 기존에 있던 정보 불러오고있을때 -> 클린해주고 다시 실행해보기
	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		TVDisplay td = (TVDisplay)ctx.getBean("TVDisplay");
		td.run();
	}

}

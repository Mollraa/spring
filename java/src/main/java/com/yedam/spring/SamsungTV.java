package com.yedam.spring;

//import org.springframework.stereotype.Component;
//
//@Component -> 어노테이션 : 설정관련 스프링에서 많이 씀 
public class SamsungTV implements TV {

	@Override
	public void on() {
		System.out.println("스프링 방식으로");

	}

}

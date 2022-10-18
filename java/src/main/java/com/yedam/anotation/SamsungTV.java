package com.yedam.anotation;

import org.springframework.stereotype.Component;

@Component
//1) @Component("sTV") -> 갯수가 많을 때, 필드에 선언
public class SamsungTV implements TV {

	@Override
	public void on() {
		System.out.println("어노테이션 사용");
	}

}

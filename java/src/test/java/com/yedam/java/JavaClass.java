package com.yedam.java;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class JavaClass {

	//자바방식 - test
	@Test
	public void javaTest() {
		TV tv = new SamsungTV();
//		tv.on();
		assertNotNull(tv); //인스턴스관련 제대로 실행 되는지 확인
	}
}

package com.yedam.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
//실제 호출시 자바랑 뭐가다른지 확인
	public static void main(String[] args) {
		//컨테이너 생성 : xml에서 문제 있으면 여기서 막힘.
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		TV tv = (TV)ctx.getBean("tv"); //캐스팅변환, "tv"라는 명칭만 있을뿐 수정안해도됨 -> applicationContext.xml여기서 <bean id="tv" class="com.yedam.spring.SamsungTV" />의 클래스만 수정해주면됨
		tv.on(); // 스프링 방식 다른점? 자바안의 코드가 수정 되는지 안되는지☆
		System.out.println("--");
		TVDisplay td = (TVDisplay)ctx.getBean("td");
		td.run();
	}
}

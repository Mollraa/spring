package com.yedam.anotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TVDisplay {
	
	//@Autowired : tv에 대해 의존성주입 / 기능상 수정하는 경우가 아니면 내부코드를 수정할 일은 없음,  public class SamsungTV implements TV 해당클래스로 가서  ->  @Component얘가 알아서함
	@Autowired
	TV tv;
//1)TV sTV; - 필드에 이름 등록해서 사용 
	//중요한건 TV tv;의 TV(타입)
	
	public void run() {
		this.tv.on();
	}
	
	

}

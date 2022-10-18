package com.yedam.java;

public class TVDisplay {
	//TV하나를 들고있고 
	TV tv;
	
	//생성자로 집어넣기
	public TVDisplay(TV tv) {
		this.tv = tv;
	}
	//메소드(setter)
	public void setTV(TV tv) {
		this.tv = tv;
	}
	
	
	
	//필드를 사용하고 싶을때?
	public void tvOn() {
		this.tv.on();
	}

}

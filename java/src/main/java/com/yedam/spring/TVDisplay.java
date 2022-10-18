package com.yedam.spring;

public class TVDisplay {
	TV tv;
	
	public TVDisplay() {
		//기본생성자
	}
	
	public TVDisplay(TV selectedTV) {
		this.tv = selectedTV;
	}
	
	public void setTV(TV tv) {
		// setTV의 규칙 : name="tV" 첫글자를 소문자로
		this.tv = tv;
	}
	
	public void run() {
		this.tv.on();
	}

}

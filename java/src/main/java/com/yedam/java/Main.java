package com.yedam.java;

public class Main {
	public static void main(String[] args) {
		TV tv = new SamsungTV(); //고장나면 새로 클래스 만들어서 -> SamsungTV수정하는 방식
		tv.on();
		
		TVDisplay td = new TVDisplay(new SamsungTV());
		td.tvOn(); //오류나는이유 : 필드 선언만하고 인스턴스가 없어서
	}
}

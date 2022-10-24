package com.yedam.java.test.service;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Data
public class Cats {
	private String name;
	private int age;
	private String color;

	//1) this - 쓰면 안될 예시
	public void printInfo() {
		System.out.println(this.getName() + " , "
						+ this.getAge() + " , "
						+ this.getColor());
	}
	
	//interface - 정상 호출
	@Autowired
	Cats myCats;
	
	public void printData() {
		System.out.println(this.getName() + " , "
						+ this.getAge() + " , "
						+ this.getColor());
	}
}

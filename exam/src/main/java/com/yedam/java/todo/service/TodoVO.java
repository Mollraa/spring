package com.yedam.java.todo.service;

import lombok.Data;

@Data // 안되면 소스수정으로 등록
public class TodoVO {
	private int no;
	private int id;
	private String contents;
	private char todoyn;
}

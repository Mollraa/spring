package com.yedam.java.todo.service;

import java.util.List;

public interface TodoService {

	// 전체조회
	public List<TodoVO> getTodoAllList(TodoVO todoVO);

	// 등록
	public int todoInsert(TodoVO todoVO);

	// 수정-할일여부 - 0/1
	public int todoUpdate(TodoVO todoVO);

	// 삭제
	public int todoDelete(TodoVO todoVO);

}

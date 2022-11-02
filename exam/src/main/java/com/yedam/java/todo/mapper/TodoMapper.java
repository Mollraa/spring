package com.yedam.java.todo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yedam.java.todo.service.TodoVO;

public interface TodoMapper {
	// 전체조회
	// param으로 넘어가는 id값 어떻게 넘겨줄지
	public List<TodoVO> getTodoAllList(int id);

	// 등록
	public int todoInsert(TodoVO todoVO);

	// 수정-할일여부 - 0/1
	public int todoUpdate(TodoVO todoVO);

	// 삭제
	//@param = mybatis mapper에서 사용할 이름 "id", "no"
	public int todoDelete(@Param("id") int id, @Param("no") int no);
	
}

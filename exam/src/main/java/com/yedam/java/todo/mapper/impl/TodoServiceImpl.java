package com.yedam.java.todo.mapper.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.java.todo.mapper.TodoMapper;
import com.yedam.java.todo.service.TodoService;
import com.yedam.java.todo.service.TodoVO;

@Service
public class TodoServiceImpl implements TodoService {

	/*
	 * 필요시 emp mapper도 접속가능함. service -> mapper이렇게 안가도됨
	 * 
	 * @Autowired EmpService service; = X
	 * 
	 * @Autowired EmpMapper mapper; = O
	 * 
	 * 즉, mapper <-> service 종속 관계아님, 중요!
	 */

	@Autowired
	TodoMapper todoMap;

	@Override
	public List<TodoVO> getTodoAllList(TodoVO todoVO) {
		// 전체조회
		return todoMap.getTodoAllList(todoVO.getId());
	}

	@Override
	public int todoInsert(TodoVO todoVO) {
		// 등록
		return todoMap.todoInsert(todoVO);
	}

	@Override
	public int todoUpdate(TodoVO todoVO) {
		// 수정
		return todoMap.todoUpdate(todoVO);
	}

	@Override
	public int todoDelete(TodoVO todoVO) {
		// 삭제
		return todoMap.todoDelete(todoVO.getId(), todoVO.getNo());
	}

}

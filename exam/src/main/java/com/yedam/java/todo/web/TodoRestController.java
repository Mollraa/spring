package com.yedam.java.todo.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yedam.java.todo.service.TodoService;
import com.yedam.java.todo.service.TodoVO;

@Controller
@CrossOrigin("*")
//vue가 필요없는 컨트롤러 
public class TodoRestController {
//vue없이 만들기

	@Autowired
	TodoService todoService;

	// 전체조회
	@GetMapping("todoSelect")
	@ResponseBody // 커맨드 or json으로 받아오는경우 TodoVO- 유동적으로 받아올수있음 편함
	public List<TodoVO> todoSelect(TodoVO todoVO) {
		return todoService.getTodoAllList(todoVO);
	}

	// 등록
	//@RequestBody => todoHeader -> insert시 data - contentType : 'application/json'
	@PostMapping("todoInsert")
	@ResponseBody
	public Map<String, Object> todoInsert(@RequestBody TodoVO todoVO) {
		//@안하고 객체로 받을꺼 
		int result = todoService.todoInsert(todoVO);
		Map<String, Object> resultVO = new HashMap<String, Object>();
		if( result > 0) {
			resultVO.put("result", "success");
			resultVO.put("count", result);
		} else {
			resultVO.put("result", "fail");
		}
		return resultVO;
	}

	// 수정
	@GetMapping("todoUpdate")
	@ResponseBody
	public TodoVO todoUpdate(TodoVO todoVO) {
		todoService.todoUpdate(todoVO);
		return todoVO;
	}

	// 삭제
	@GetMapping("todoDelete")
	@ResponseBody
	public TodoVO todoDelete(@RequestParam int id, @RequestParam int no) {
		TodoVO todoVO = new TodoVO();
		todoVO.setId(id);
		todoVO.setNo(no);
		todoService.todoDelete(todoVO);
		return todoVO;
	}
}

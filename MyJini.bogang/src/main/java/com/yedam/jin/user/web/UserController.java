package com.yedam.jin.user.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.yedam.jin.user.service.UserService;
import com.yedam.jin.user.service.UserVO;

@Controller

public class UserController {

	@Autowired
	UserService service;

	//전체조회
	@GetMapping("list")
	public String selectUserList(Model model) {
		model.addAttribute("list", service.selectUserList());
		return "user/list";
	}

	// 등록form
	@GetMapping("userInsert")
	public String userInsertForm() {
		return "user/userInsert";
	}
	
	//등록 - DB
	@PostMapping("insert")
	public String insertUser(UserVO uvo, RedirectAttributes ratt) {
	
		Map<String, Object> result = service.insertUser(uvo);
		ratt.addAttribute("msg", result.get(result)+"등록 되었습니다.");
		return "redirect:list";
	}

}

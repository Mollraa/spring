package com.yedam.jin.book.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.yedam.jin.book.service.BookService;

@Controller
public class BookController {
	
	@Autowired //@Autowired = 컨테이너 안 bean불러옴
	BookService service;

	@GetMapping("bookList") //리스폰스바디가 없어서 뷰로 반환
	public String selectBookList(Model model) {
		model.addAttribute("list", service.selectBookList());
		return "book/list"; //tiles먹일건지 말건지 여기서 결정. (/ : 등등)
		// <-> return "list"; = /WEB-INF/views/list.jsp
	}
}

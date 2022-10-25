package com.yedam.jin.book.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.yedam.jin.book.service.BookService;
import com.yedam.jin.book.service.BookVO;

@Controller
public class BookController {
	
	@Autowired //@Autowired = 컨테이너 안 bean불러옴
	BookService service;

	//도서목록조회
	@GetMapping("blist") //리스폰스바디가 없어서 뷰로 반환
	public String selectBookList(Model model) {
		model.addAttribute("list", service.selectBookList());
		return "book/list"; // tiles먹일건지 말건지 여기서 결정. (/ : 등등)
		// <-> return "list"; = /WEB-INF/views/list.jsp
		//404오류 : return "book/list"의 list가 아니고, @GetMapping("blist")의 blist가 실제 경로
	}
	
	//도서등록 페이지 이동 + Model model(현재 등록될 예상되는 번호)
	@GetMapping("bookinsert") //실제 경로-> header
	public String insertBookForm(Model model) {
		//model.addAttribute("binfo",service.selectBookNo().getBookNo()); //-> no까지 int로 받아오면, jsp에서 info만 받아오면됨 = value="${binfo}"
		model.addAttribute("binfo",service.selectBookNo()); // = private int bookNo;요 형태로 보냄 / value="${binfo.bookNo}"
		return "book/binsert";
	}
	
	//도서정보를 DB에 등록
	//binsert.jsp의 form action="bookinsert"가져옴
	@PostMapping("bookinsert")
	public String insertBookInfo(BookVO bookVO) {
		service.insertBookInfo(bookVO);
		return "redirect:blist";
		//"redirect:" = 컨트롤러 호출(경로를 다시부르겠다)
	}
}

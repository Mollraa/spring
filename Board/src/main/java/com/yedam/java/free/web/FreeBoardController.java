package com.yedam.java.free.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.yedam.java.free.service.FBService;
import com.yedam.java.free.service.FBVO;

@Controller

//controller단위 경로mapping, but request만 가능 get,post.. 모르기 떄문
@RequestMapping("freeBoard")
public class FreeBoardController {
	//뷰랑 컨트롤러 같이 만들어도 무관
	
	@Autowired
	FBService fbService;
	
	//등록- 폼 불러올거 , Model-넘길 값
	@GetMapping("insert")
	public String insertForm(Model model) {
		model.addAttribute("no", fbService.getBoardNo());
		return "freeBoard/insertForm";
	}
	
	//등록- DB insert할거, 통신방식에 따라 다른 경로 사용가능 | FBVO - 받을 값
	@PostMapping("insert")
	public String insertFreeBoard(FBVO fbvo, RedirectAttributes ratt) {
		Map<String, Object> result = fbService.insertBoardInfo(fbvo);
		ratt.addAttribute("msg", result.get("result") + "등록 되었습니다.");
		return "redirect:list";
	} //->  :(상대경로)  <-> /(root, 절대경로) 
	
	//전체조회
//	@GetMapping("list")
//	public String selectFreeBoardList(Model model , @RequestParam(required = false) String msg) {
//		System.out.println("Message : " + msg);
//		return "";
	@GetMapping("list")
	public String selectFreeBoardList(Model model) {
		model.addAttribute("boardList", fbService.selectBoardList());
		return "freeBoard/boardList";
	}
	
	//단건조회
	@GetMapping("info")
	public String selectBoardInfo(FBVO fbvo, Model model){
		model.addAttribute("board", fbService.selectBoardInfo(fbvo));
		return "freeBoard/boardInfo";
	}
	
	//수정 - 폼
	
	//수정 - DB update
	
	//삭제
}

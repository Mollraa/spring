package com.yedam.java.free.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.yedam.java.free.service.FBService;
import com.yedam.java.free.service.FBVO;

import oracle.jdbc.proxy.annotation.Post;

@Controller
@RequestMapping("freeBoard")
public class FreeBoardController {
	@Autowired
	FBService fbService;

	//등록-폼  그냥 호출하는 용도는 get/ 데이터가 넘어가야하기 때문에 Model사용
	@GetMapping("insert")
	public String insertForm(Model model) {
		model.addAttribute("no", fbService.getBoardNo());
		return "freeBoard/insertForm";
	}
	//등록-DB insert / 통신방식에 따라 구분해서 사용가능, 경로가 같아보이지만 처리방식이 다름
	@PostMapping("insert")
	public String insertFreeBoard(FBVO fbVO, RedirectAttributes ratt) {
		Map<String, Object> result = fbService.insertBoardInfo(fbVO);
		ratt.addFlashAttribute("msg",result.get("result") + "건이 등록되었습니다.");
		return "redirect:list";
	}
	
	//전체 조회
	@GetMapping("list") //리퀘스트 파람 무조건 값을 줘야하는데 리콰이얼드 폴스를 주면 없어도 됨 때마다 다르다
//	public String selectFreeBoardList(Model model, @RequestParam(required = false) String msg) {
//		System.out.println("Message : " + msg);
	public String selectFreeBoardList(Model model) {
		model.addAttribute("boardList", fbService.selectBoardList());
		return "freeBoard/boardList";
	}
	
	//단건 조회
	@GetMapping("info")
	public String selectBoardInfo(FBVO fbVO, Model model) {
		model.addAttribute("board", fbService.selectBoardInfo(fbVO));
		return "freeBoard/boardInfo";
	}
	//수정-폼
	@PostMapping("updateForm")
	public String updateForm(FBVO fbvo, Model model) {
		model.addAttribute("board", fbService.selectBoardInfo(fbvo));
		return "freeBoard/updateForm";
	}
	
	//수정-DB update
	@PostMapping("update")
	public String updateBoard(FBVO fbvo, RedirectAttributes ratt) {
		Map<String, Object> result = fbService.updateBoardInfo(fbvo);
		ratt.addAttribute("msg", result.get("result") + "수정성공!");
		return "redirect:list";
	}
	
	//삭제
	@PostMapping("delete")
	public String deleteBno(FBVO fbvo, RedirectAttributes ratt) {
		Map<String, Object> result = fbService.deleteBoardInfo(fbvo);
		ratt.addAttribute("msg", result.get(result)+" 삭제완료!");
		return "redirect:list";
	}
//	@GetMapping("delete/")
//	@ResponseBody
//	public String deleteBoard(boardNo int bno) {
//		int result = fbService.deleteBoardInfo(bno);
//		String msg = null;
//		if(result == 1) {
//			msg = "글 번호" + bno + "삭제 완료!";
//		} else {
//			msg = "글이 삭제되지 않았습니다!!";
//		}
//		return "msg";
//	}
	
//	 @RequestBody
//	 http요청의 본문(body)이 그대로 전달된다. 
//	 일반적인 GET/POST의 요청 파라미터라면 @RequestBody를 사용할 일이 없을 것이다.
//	 반면에 xml이나 json기반의 메시지를 사용하는 요청의 경우에 이 방법이 매우 유용하다.
//	 HTTP 요청의 바디내용을 통째로 자바객체로 변환해서 매핑된 메소드 파라미터로 전달해준다. 
	
}

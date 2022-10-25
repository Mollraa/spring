package com.yedam.jin.book.mapper;

import java.util.List;

import com.yedam.jin.book.service.BookVO;

public interface BookMapper {
//mybatis가 스캔할 곳 

	// 전체조회
	public List<BookVO> getBookList();
	
	
	//등록-1)번호조회
//	public int로 해도 무관
	public BookVO getboBookNo();
	
	//등록-2)실제등록
	public int insertBook(BookVO bookVO);
	
	//대여현황
	public BookVO getRentalInfo();
}

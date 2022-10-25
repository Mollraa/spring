package com.yedam.jin.book.mapper;

import java.util.List;

import com.yedam.jin.book.service.BookVO;

public interface BookMapper {
//mybatis가 스캔할 곳 

	// 전체조회
	public List<BookVO> getBookList();
	
}

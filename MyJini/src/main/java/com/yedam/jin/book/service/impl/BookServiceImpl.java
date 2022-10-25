package com.yedam.jin.book.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.jin.book.mapper.BookMapper;
import com.yedam.jin.book.service.BookService;
import com.yedam.jin.book.service.BookVO;

@Service
//컨테이너에 등록되는 곳 = service @로 알려줌
public class BookServiceImpl implements BookService {
	@Autowired
	BookMapper mapper;
	
	@Override
	public List<BookVO> selectBookList() {
		//전체조회
		return mapper.getBookList();
	}

}

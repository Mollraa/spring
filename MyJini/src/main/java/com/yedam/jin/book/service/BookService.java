package com.yedam.jin.book.service;

import java.util.List;

//인터페이스는 그자체 사용 불가능. 클래스로 만들어줘야함
public interface BookService {

	//전체조회
	public List<BookVO> selectBookList();
}

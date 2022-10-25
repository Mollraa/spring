package com.yedam.jin.book.service;

import java.util.List;

//인터페이스는 그자체 사용 불가능. 클래스로 만들어줘야함
public interface BookService {

	//전체조회
	public List<BookVO> selectBookList();
	
	//번호조회
//	public BookVO selectBookNo(); -> Impl에서 바로 등록에서 처리가능함. mapper랑 service랑 같을 필요없음
	public BookVO selectBookNo();
	
	//등록
	public int insertBookInfo(BookVO bookVO);
	
}

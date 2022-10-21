package com.yedam.java.free.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yedam.java.free.service.FBVO;

//클래스 이름 길어지면 약어사용! 약어에 익숙해지자
public interface FBMapper {
	//전체조회
	public List<FBVO> getBoardList();
	
	//단건조회
	public FBVO getBoardInfo(FBVO fbvo);
	
	//등록
	public int insertBoard(FBVO fbvo);
	
	//수정
	public int updateBoard(FBVO fbvo);
	
	//삭제
	public int deleteBoard(@Param("bno")int boardNo);

	//입력될 게시글 번호 조회
	public FBVO getBoardNo();
	
}

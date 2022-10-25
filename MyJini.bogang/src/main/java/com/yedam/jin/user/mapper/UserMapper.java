package com.yedam.jin.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yedam.jin.user.service.UserVO;

public interface UserMapper {

	//전체조회
	public List<UserVO> userList(); 
	
	//단건조회
	public UserVO  getUserInfo(UserVO uvo);
	
	//등록	
	public int insertUser(UserVO uvo);
	
	//수정
	public int updateUser(UserVO uvo);
	
	//삭제
	public int deleteUser(@Param("userId")int userId);
	
	//
	boolean isMemberId(String id); // 아이디 중복체크 존재하면 false,
	
}

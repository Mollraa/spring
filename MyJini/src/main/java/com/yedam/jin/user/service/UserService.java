package com.yedam.jin.user.service;

import java.util.List;
import java.util.Map;

public interface UserService {

	// 전체조회
	public List<UserVO> selectUserList();

	//단건조회 
	public UserVO selectUserInfo(UserVO uvo);
	
	//등록
	public Map insertUser(UserVO uvo);
}

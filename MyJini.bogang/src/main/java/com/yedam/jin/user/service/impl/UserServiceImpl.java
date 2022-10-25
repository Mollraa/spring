package com.yedam.jin.user.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.jin.user.mapper.UserMapper;
import com.yedam.jin.user.service.UserService;
import com.yedam.jin.user.service.UserVO;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper mapper;
	
	@Override
	public List<UserVO> selectUserList() {
		//전체조회
		return mapper.userList();
	}

	@Override
	public UserVO selectUserInfo(UserVO uvo) {
		//단건조회
		return mapper.getUserInfo(uvo);
	}

	@Override
	public Map insertUser(UserVO uvo) {
		//등록
		int count = mapper.insertUser(uvo);
		return getResult(count, uvo);
	}
	
	//공동사용
	public Map getResult(int count, UserVO uvo) {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("result",count);
		result.put("data",uvo);
		return result;
	
	}

}

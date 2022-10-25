package com.yedam.java.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yedam.java.test.mapper.AaaMapper;
import com.yedam.java.test.service.AaaService;

@Service
public class AaaServiceImpl implements AaaService {
	//transcation = AOP
	
	@Autowired
	AaaMapper mapper;
	
	
	
//	@Transactional : 비즈니스 로직에서만 사용, 값들 묶어주기
	@Transactional
	@Override
	public void insert() {
		mapper.insert("101"); //각각 커밋, 롤백
		mapper.insert("값"); //각각 커밋, 롤백 <-> 
	}
	
	@Override
	public void test() {
		//insert()위의 이친구 불러옴 -> test 디비 확인 
		this.insert();
	}
}

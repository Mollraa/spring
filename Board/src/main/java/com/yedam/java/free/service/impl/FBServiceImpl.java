package com.yedam.java.free.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.java.free.mapper.FBMapper;
import com.yedam.java.free.service.FBService;
import com.yedam.java.free.service.FBVO;

@Service
public class FBServiceImpl implements FBService {

	@Autowired
	FBMapper fbMapper;
	
	@Override
	public int getBoardNo() {
		/* 일회성 변수사용
		FBVO fbVO = fbMapper.getBoardNo();
		int bno = fbVO.getBno();
		return bno;
		=> return fbMapper.getBoardNo().getBno();
		*/
		return fbMapper.getBoardNo().getBno();
	}

	@Override
	public List<FBVO> selectBoardList() {
		return fbMapper.getBoardList();
	}

	@Override
	public FBVO selectBoardInfo(FBVO fbvo) {
		return fbMapper.getBoardInfo(fbvo);
	}

	@Override
	public Map insertBoardInfo(FBVO fbvo) {
		int count = fbMapper.insertBoard(fbvo);
		return getResult(count, fbvo);
	}

	@Override
	public Map updateBoardInfo(FBVO fbvo) {
		int count = fbMapper.updateBoard(fbvo);
		return getResult(count, fbvo);
	}

	@Override
	public Map deleteBoardInfo(FBVO fbvo) {
		int count = fbMapper.deleteBoard(fbvo.getBno());
		return getResult(count, fbvo);
	}

	//Map - 구현 클래스 내, 중복되는 코드들 메서드에 모음, 코드 깔꼼
	public Map getResult(int count, FBVO fbvo) {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("result", count);
		result.put("data", fbvo);
		return result;
	}
}

package com.yedam.java.test.mapper;

import org.apache.ibatis.annotations.Insert;

public interface AaaMapper {
	//insert라서 마이파티스안씀
	@Insert("INSERT INTO aaa VALUES ( #{value} )")
	public void insert(String value);
}

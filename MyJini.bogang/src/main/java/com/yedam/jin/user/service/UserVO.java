package com.yedam.jin.user.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class UserVO {
/*
user_id VARCHAR2(500) PRIMARY KEY, --id
user_name VARCHAR2(500) NOT NULL , --이름
user_password VARCHAR2(500) NOT NULL , --비밀번호
user_nic VARCHAR2(500) NOT NULL UNIQUE, --닉네임
user_date DATE DEFAULT sysdate NOT NULL, --가입일
user_phone VARCHAR2(500), --연락처
user_email VARCHAR2(500), --이메일
user_type CHAR(1) DEFAULT '1' NOT NULL --유형: 관리자(0), 일반회원(1)
*/
	
	private String userId;
	private String userName;
	private String userPassword;
	private String userNic;
	@DateTimeFormat(pattern="yyyy년MM월dd일")
	private Date userDate;
	private String userPhone;
	private String userEmail;
	private String userType;
}

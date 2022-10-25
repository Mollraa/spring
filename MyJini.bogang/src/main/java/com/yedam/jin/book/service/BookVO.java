package com.yedam.jin.book.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class BookVO {
	// table기반 이지만 여기서 쓸거 추가해서 사용해도됨
	/*
	 * "BOOK_NO" NUMBER(8,0) NOT NULL ENABLE, "BOOK_NAME" VARCHAR2(50 BYTE) NOT NULL
	 * ENABLE, "BOOK_COVERIMG" VARCHAR2(20 BYTE), "BOOK_DATE" DATE DEFAULT sysdate,
	 * "BOOK_PRICE" NUMBER(8,0), "BOOK_PUBLISHER" VARCHAR2(50 BYTE), "BOOK_INFO"
	 * VARCHAR2(2000 BYTE), PRIMARY KEY ("BOOK_NO")
	 */
	private int bookNo;
	private String bookName;
	private String bookCovering; // I하지말고i해야함 db에서_없어서 인식오류날 수 있음
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date bookDate;
	private int bookPrice;
	private String bookPublisher;
	private String bookInfo;

	/*
	 * <!-- vo완성 후 -> mybatis-config.xml가서 -> 별칭 설정 -->
	 * <typeAliases>
	 * <package name="com.yedam.jin.book.service"/>
	 * </typeAliases>
	 */
	
	
	
	//대여관련 - sql join
	private int rentalPrice;
	private int rentalCount;

}

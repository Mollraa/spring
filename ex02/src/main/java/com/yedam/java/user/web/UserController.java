package com.yedam.java.user.web;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.yedam.java.user.service.UserListVO;
import com.yedam.java.user.service.UserVO;

@Controller
public class UserController {
	// 입력 할 페이지
	@RequestMapping(value = "inputForm", method = { RequestMethod.POST, RequestMethod.GET })
	public String inputForm() {

		return "inputForm";
	}

	// <FORM action="users" = 경로, 가볍게 데이터를 받을 때
	@RequestMapping("users")
//	public String process(UserVO userVO) {
//	public String process(@RequestParam("name") String userName, @RequestParam("age") int userAge) {
//		=   public String process(@RequestParam String name, @RequestParam int age) {
	public String process(@RequestParam Map<String, Object> map) {

//		System.out.println("이름 : " + userVO.getName());
//		System.out.println("나이 : " + userVO.getAge());
//		System.out.println(userName + " , "+ userAge);
		System.out.println(map.get("name") + " , " + map.get("age"));

		return "";
	}

	
	//http://localhost:8081/java/nameList?name=Cing&name=Kamg&name=jong : 경로 따라 값이 들어감
	@RequestMapping("nameList")
	public String nameprocess(@RequestParam List<String> name) {
		for (String temp : name) {
			System.out.println(temp);
		}
		return "";
	}
	
	
	// 배열로 받을 때 -> UserListVO추가 | 자바 제어문 복습
	@RequestMapping(value = "userList")
	//public String listProcess(UserListVO userList) {
	public String listProcess(@RequestBody List<UserVO> userList) {
//		for (UserVO user : userList.getList()) {
			for (UserVO uservo : userList) {
//			System.out.println("이름 : " + user.getName());
//			System.out.println("나이 : " + user.getAge());
			System.out.println("이름 : " + uservo.getName());
			System.out.println("나이 : " + uservo.getAge());
		}
		return "";
	}

}

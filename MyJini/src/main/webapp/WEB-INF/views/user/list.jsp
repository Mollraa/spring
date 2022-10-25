<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UserList</title>

<style type="text/css">
table {
	border: 3px solid pink;
}

th, td {
	border: 3px solid pink;
	padding: 10px, 10px;
}

</style>
</head>
<body>
<!-- 1. 연락처와 이메일은 일부만 표시
	 2. 관리자 페이지로 이동시 관리자 아이디와 비밀번호를 이용해서 권한확인  -->
<div align="center">
<table>
		<thead>
			<tr>
				<th>아이디</th>
				<th>이름</th>
				<th>비밀번호</th>
				<th>닉네임</th>
				<th>가입일</th>
				<th>휴대전화</th>
				<th>이메일</th>
			</tr>
		</thead>
		<tbody>
			<!-- 실제c 태그 실행 -->
			<c:forEach items="${list}" var="userList">
				<tr>
					<td>${userList.userId }</td>
					<td>${userList.userName }</td>
					<td><input value="${userList.userPassword }" type="password" readonly></td>
					<td>${userList.userNic }</td>
					<td><fmt:formatDate value="${userList.userDate }"
							pattern="yyyy년MM월dd일" /></td>
					<td>${userList.userPhone }</td>
					<td>${userList.userEmail }</td>
					
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
</body>
</html>
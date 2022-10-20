<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<!-- 새로운 태그 : fmt(이름은 내가 정함ㅎ ) (포맷관련 태그, 날짜 숫자 ...)  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table, tr, th, td {
	border: 2px, solid, pink;
}
</style>
</head>
<body>
	<!-- 연결은 emplist에서  -->
	<!-- method="post" : 조회제외 post -->
	<form action="updateSal" method="post">
		<table>
			<tr>
				<th>사원번호</th>
				<td><input type="text" name="employeeId" value=" ${empInfo.employeeId }" readonly/></td>
			</tr>
			<tr>
				<th>성</th>
				<td>${empInfo.firstName }</td>
			</tr>
			<tr>
				<th>이름</th>
				<td>${empInfo.lastName }</td>
			</tr>
			<tr>
				<th>입사일</th>
				<!-- value=가져온값 , pattern=내가표기 하고싶은 방식 -->
				<td><fmt:formatDate value="${empInfo.hireDate }"
						pattern="yyyy년 MM월 dd일" /></td>
			</tr>
			<tr>
				<th>부서번호</th>
				<td>${empInfo.departmentId }</td>
			</tr>
			<tr>
				<th>직업</th>
				<td>${empInfo.jobId }</td>
			</tr>
			<tr>
				<th>급여</th>
				<td><fmt:formatNumber value="${empInfo.salary}" /></td>
			</tr>
		</table>
		<button type="submit">연봉 인상</button>
	</form>
</body>
</html>
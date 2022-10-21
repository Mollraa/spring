<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>번호</th>
			<td>${board.bno }</td>
		</tr>
		<tr>
			<th>제목</th>
			<td>${board.title }</td>
		</tr>
		
		<tr>
			<th>작성자</th>
			<td>${board.writer }</td>
		</tr>
		
		<tr>
			<th>내용</th>
			<td><textarea rows="5" cols="3" style="width: 100px;" readonly>${board.contents }</textarea></td>
		</tr>
		
		<tr>
			<th>첨부파일</th>
			 <!-- <td><img alt="이미지입니다.." src="${pageContext.request.contextPath }/resources/${board.image }"></td> -->
			<td><img src="<c:url value='/resources/images/${board.image }'/>" alt="이미지입니다.." ></td>
		
		</tr>
		
		<tr>
			<th>작성일</th>
			<td><fmt:formatDate value="${board.regdate }" pattern="yyyy년MM월dd일"/> </td>
		</tr>
		
	</table>
</body>
</html>
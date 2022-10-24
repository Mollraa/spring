<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 상세보기</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
</head>
<body>
	<div>
		<h2>게시글 상세보기</h2>
	</div>
	<table>
		<tr>
			<th>글 번호</th>
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
			<td><textarea rows="30" cols="30"  style="width: 100px" readonly>${board.contents }</textarea></td>
		</tr>
		<tr>
			<th>첨부파일</th>
			<!--  <td><img src="${pageContext.request.contextPath}/resources/images/${board.image}" alt="이미지"> </td>-->
			<td><img src="<c:url value='/resources/images/${board.image}'/>"
				alt="이미지"></td>
		</tr>
		<tr>
			<th>작성일자</th>
			<td><fmt:formatDate value="${board.regdate }"
					pattern="yyyy년MM월dd일" /></td>
		</tr>
	</table>
	<br>
	<form id="boardInfo" action="" method="post">
		<input type="hidden" name="bno" value="${board.bno}">
		<button type="button" onclick="update('update')">수정</button>
		<button type="button" onclick="delete('delete')">삭제</button>
	</form>
	<script type="text/javascript">
		function updateDelete(u) {
			if (a == 'update') {
				$('#boardInfo').prop('action', 'updateForm').submit();
			} 
		};
		
		function delete(d) {
			if (a == 'delete') {
				$('#boardInfo').prop('action', 'delete').submit();
			}
		};
	</script>
	

</body>
</html>
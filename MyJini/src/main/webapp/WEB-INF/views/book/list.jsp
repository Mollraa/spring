<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book List</title>

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
	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>표지</th>
				<th>출판일</th>
				<th>가격</th>
				<th>작가</th>
				<th>내용</th>
			</tr>
		</thead>
		<tbody>
			<!-- 실제c 태그 실행 -->
			<c:forEach items="${list}" var="bookInfo">
				<tr>
					<td>${bookInfo.bookNo }</td>
					<td>${bookInfo.bookName }</td>
					<td><img alt=""
						src="<c:url value='resources/images/${bookInfo.bookCovering}'/>"></td>
					<td><fmt:formatDate value="${bookInfo.bookDate }"
							pattern="yyyy년MM월dd일" /></td>
					<td><fmt:formatNumber value="${bookInfo.bookPrice }" /></td>
					<td>${bookInfo.bookPublisher }</td>
					<td>${bookInfo.bookInfo}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>
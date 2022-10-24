<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 목록</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<style>
table, thead, tbody, tr, th {
	border: 3px solid black;
}

th {
	background-color: pink;
}

td {
	border: 1px solid black;
}
</style>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${boardList }" var="board">
				<tr>
					<td>${board.bno}</td>
					<td>${board.title}</td>
					<td>${board.writer}</td>
					<td><fmt:formatDate value="${board.regdate}"
							pattern="yyyy년MM월dd일" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<form id="boardInfo" action="info" method="get">
		<input type="hidden" name="bno" value="">
	</form>

	<script>
		//단건조회 선택 안된이유 : resultMsg != ""에 !안해줌
		let resultMsg = '${msg}';
		if (resultMsg != null && resultMsg != "") {
			alert(resultMsg);
		}

		//마우스오버, 클릭
		$('tbody tr').on({
			'mouseover' : function() {
				let target = event.currentTarget;
				$(target).css('background-color', 'yellow');
			},
			'mouseout' : function() {
				let target = event.currentTarget;
				$(target).css('background-color', 'white');
			}
		});

		$('tbody td').click(function() {
			let bno = $(this).parent().children().eq(0).text();
			$('#boardInfo input').val(bno);
			$('#boardInfo').submit();
		})
	</script>
</body>
</html>
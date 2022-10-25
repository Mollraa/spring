<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>binsert form</title>

<!-- 원래 layout -> header밑에 -> jQuery 들어가야함 -->
</head>
<body>
	<form action="bookinsert" method="post" onsubmit="return formOption()">
		<!-- onsubmit="return" : 동작전 함수실행 먼저하겠다, 동적 -->
		<!-- onsubmit="return false" : 무조건 막아놓겠다 -->
		<table>
			<tr>
				<th>도서번호</th>
				<td><input type="text" name="bookNo" value="${binfo.bookNo}"
					readonly></td>
				<!-- input : 값 입력 받을 때 -->
				<!-- name="컨트롤러에서 받는 값 = 필드명"  %> -->
			</tr>
			<tr>
				<th>도서명</th>
				<td><input type="text" name="bookName" value=""></td>
			</tr>
			<tr>
				<th>도서표지</th>
				<td><input type="text" name="bookCovering" value=""></td>
			</tr>
			<tr>
				<th>출판일자</th>
				<td><input type="date" name="bookDate" value=""></td>
			</tr>
			<tr>
				<th>금액</th>
				<td><input type="number" name="bookPrice" value=""></td>
			</tr>
			<tr>
				<th>출판사</th>
				<td><input type="text" name="bookPublisher" value=""></td>
			</tr>
			<tr>
				<th>도서소개</th>
				<td><textarea rows="3" col="3" name="bookInfo"></textarea></td>
			</tr>
		</table>
		<button type="submit">등록</button>
		<button type="button">조회</button>
	</form>
	<script type="text/javascript">
		function formOption() {
			//1) 도서명 입력여부
			//bookName - name중복 안되면 굳이 id 안줘도됨
			//() -> 제이쿼리 대괄호는 속성검색
			//[name^="bookName"].. [name*="bookName"] 등등 가능.
			let tag = $('input[name="bookName"]');
			if (tag.val() == '') {
				alert("도서명이 입력되지 않았습니다.");
				tag.focus();
				return false; // = onsubmit false;
			};

			//2) 등록 알림창 띄우기
			alert('도서등록이 완료되었습니다.');
			return true;
		}
	</script>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- jQuery -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<style>
.bd-placeholder-img {
	font-size: 1.125rem;
	text-anchor: middle;
	-webkit-user-select: none;
	-moz-user-select: none;
	user-select: none;
}

@media ( min-width : 768px) {
	.bd-placeholder-img-lg {
		font-size: 3.5rem;
	}
}
</style>

<link
	href="${pageContect.request.contextPath }/resources/css/header.css"
	rel="stylesheet">
<!-- Custom styles for this template -->
<!-- <link href="headers.css" rel="stylesheet"> -->
</head>
<body>

	<div class="b-example-divider"></div>

	<div class="container">
		<!-- header에는 상대경로 금지
	절대경로 : 절대적으로 변하지 않음 (pageContext부터 절대경로)
	상대경로 : 나를 기준으로 경로 재설정 (현재페이지가 어디냐에 따라 위치가 달라짐)-->
		<header class="d-flex justify-content-center py-3">
			<ul class="nav nav-pills">
				<li class="nav-item"><a href="${pageContext.request.contextPath}/bookinsert" class="nav-link active" aria-current="page">도서등록</a></li>
				<li class="nav-item"><a href="${pageContext.request.contextPath}/blist" class="nav-link">도서목록조회/수정</a></li>
				<li class="nav-item"><a href="${pageContext.request.contextPath}" class="nav-link">대여현황조회</a></li>
				<li class="nav-item"><a href="${pageContext.request.contextPath}" class="nav-link">홈으로</a></li>
				<li class="nav-item"><a href="#" class="nav-link">♡</a></li>
			</ul>
		</header>
	</div>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
				<li class="nav-item"><a
					href="${pageContext.request.contextPath}/list"
					class="nav-link active" aria-current="page">메인페이지</a></li>
				<li class="nav-item"><a
					href="${pageContext.request.contextPath}/list" class="nav-link">관리자페이지</a></li>
				<li class="nav-item"><a href="#" class="nav-link">♡</a></li>
				<li class="nav-item"><a href="#" class="nav-link">♡</a></li>
				<li class="nav-item"><a href="#" class="nav-link">♡</a></li>
			</ul>
		</header>
	</div>
	
		<div class="help-line">
			<c:if test="${ empty userId }">
				<button class="button black"
					style="font-weight: bold; margin-top: 10px;"
					onclick="location.href='login.yd'">LOGIN</button>
				<button class="button black" style="font-weight: bold;"
					onclick="#'">SIGN UP</button>
			</c:if>
			<c:if test="${not empty userId }">
				<button class="button black"
					style="font-weight: bold; margin-top: 10px;"
					onclick="#">LOGOUT</button>
			</c:if>

			<c:if test="${userType eq '0'}">
				<button class="button black" style="font-weight: bold;"
					onclick="${pageContext.request.contextPath}/adminlist'">ADMIN</button>
			</c:if>

		</div>
</body>
</html>
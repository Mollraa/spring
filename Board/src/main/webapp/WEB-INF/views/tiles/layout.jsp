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

<!-- tiles의 중심 -->
<!-- 부트스트랩4까지 제이쿼리기반, 5부터는 제이쿼리제외(안정적)  -->
<link href="${pageContect.request.contextPath }/resources/css/footer">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous"></script>
</head>
<body>
	<!-- 시멘틱 태그 넣기 -->
	<header>
		<tiles:insertAttribute name="header"></tiles:insertAttribute>
	</header>
	<main>
		<tiles:addAttribute name="main"></tiles:addAttribute>
	</main>
	<footer>
		<div class="container">
			<footer
				class="d-flex flex-wrap justify-content-between align-items-center py-3 my-4 border-top">
				<p class="col-md-4 mb-0 text-muted">&copy; 2021 Company, Inc</p>

				<a href="/"
					class="col-md-4 d-flex align-items-center justify-content-center mb-3 mb-md-0 me-md-auto link-dark text-decoration-none">
					<svg class="bi me-2" width="40" height="32">
						<use xlink:href="#bootstrap" /></svg>
				</a>

				<ul class="nav col-md-4 justify-content-end">
					<li class="nav-item"><a href="#"
						class="nav-link px-2 text-muted">Home</a></li>
					<li class="nav-item"><a href="#"
						class="nav-link px-2 text-muted">Features</a></li>
					<li class="nav-item"><a href="#"
						class="nav-link px-2 text-muted">Pricing</a></li>
					<li class="nav-item"><a href="#"
						class="nav-link px-2 text-muted">FAQs</a></li>
					<li class="nav-item"><a href="#"
						class="nav-link px-2 text-muted">About</a></li>
				</ul>
			</footer>
		</div>

		<div class="b-example-divider"></div>

		<div class="container">
			<footer
				class="d-flex flex-wrap justify-content-between align-items-center py-3 my-4 border-top">
				<div class="col-md-4 d-flex align-items-center">
					<a href="/"
						class="mb-3 me-2 mb-md-0 text-muted text-decoration-none lh-1">
						<svg class="bi" width="30" height="24">
							<use xlink:href="#bootstrap" /></svg>
					</a> <span class="text-muted">&copy; 2021 Company, Inc</span>
				</div>

				<ul class="nav col-md-4 justify-content-end list-unstyled d-flex">
					<li class="ms-3"><a class="text-muted" href="#"><svg
								class="bi" width="24" height="24">
								<use xlink:href="#twitter" /></svg></a></li>
					<li class="ms-3"><a class="text-muted" href="#"><svg
								class="bi" width="24" height="24">
								<use xlink:href="#instagram" /></svg></a></li>
					<li class="ms-3"><a class="text-muted" href="#"><svg
								class="bi" width="24" height="24">
								<use xlink:href="#facebook" /></svg></a></li>
				</ul>
			</footer>
		</div>

		<div class="b-example-divider"></div>

		<div class="container">
			<footer class="py-3 my-4">
				<ul class="nav justify-content-center border-bottom pb-3 mb-3">
					<li class="nav-item"><a href="#"
						class="nav-link px-2 text-muted">Home</a></li>
					<li class="nav-item"><a href="#"
						class="nav-link px-2 text-muted">Features</a></li>
					<li class="nav-item"><a href="#"
						class="nav-link px-2 text-muted">Pricing</a></li>
					<li class="nav-item"><a href="#"
						class="nav-link px-2 text-muted">FAQs</a></li>
					<li class="nav-item"><a href="#"
						class="nav-link px-2 text-muted">About</a></li>
				</ul>
				<p class="text-center text-muted">&copy; 2021 Company, Inc</p>
			</footer>
		</div>

		<div class="b-example-divider"></div>

		<div class="container">
			<footer class="row row-cols-5 py-5 my-5 border-top">
				<div class="col">
					<a href="/"
						class="d-flex align-items-center mb-3 link-dark text-decoration-none">
						<svg class="bi me-2" width="40" height="32">
							<use xlink:href="#bootstrap" /></svg>
					</a>
					<p class="text-muted">&copy; 2021</p>
				</div>

				<div class="col"></div>

				<div class="col">
					<h5>Section</h5>
					<ul class="nav flex-column">
						<li class="nav-item mb-2"><a href="#"
							class="nav-link p-0 text-muted">Home</a></li>
						<li class="nav-item mb-2"><a href="#"
							class="nav-link p-0 text-muted">Features</a></li>
						<li class="nav-item mb-2"><a href="#"
							class="nav-link p-0 text-muted">Pricing</a></li>
						<li class="nav-item mb-2"><a href="#"
							class="nav-link p-0 text-muted">FAQs</a></li>
						<li class="nav-item mb-2"><a href="#"
							class="nav-link p-0 text-muted">About</a></li>
					</ul>
				</div>

				<div class="col">
					<h5>Section</h5>
					<ul class="nav flex-column">
						<li class="nav-item mb-2"><a href="#"
							class="nav-link p-0 text-muted">Home</a></li>
						<li class="nav-item mb-2"><a href="#"
							class="nav-link p-0 text-muted">Features</a></li>
						<li class="nav-item mb-2"><a href="#"
							class="nav-link p-0 text-muted">Pricing</a></li>
						<li class="nav-item mb-2"><a href="#"
							class="nav-link p-0 text-muted">FAQs</a></li>
						<li class="nav-item mb-2"><a href="#"
							class="nav-link p-0 text-muted">About</a></li>
					</ul>
				</div>

				<div class="col">
					<h5>Section</h5>
					<ul class="nav flex-column">
						<li class="nav-item mb-2"><a href="#"
							class="nav-link p-0 text-muted">Home</a></li>
						<li class="nav-item mb-2"><a href="#"
							class="nav-link p-0 text-muted">Features</a></li>
						<li class="nav-item mb-2"><a href="#"
							class="nav-link p-0 text-muted">Pricing</a></li>
						<li class="nav-item mb-2"><a href="#"
							class="nav-link p-0 text-muted">FAQs</a></li>
						<li class="nav-item mb-2"><a href="#"
							class="nav-link p-0 text-muted">About</a></li>
					</ul>
				</div>
			</footer>
		</div>

		<div class="b-example-divider"></div>


		<div class="container">
			<footer class="py-5">
				<div class="row">
					<div class="col-2">
						<h5>Section</h5>
						<ul class="nav flex-column">
							<li class="nav-item mb-2"><a href="#"
								class="nav-link p-0 text-muted">Home</a></li>
							<li class="nav-item mb-2"><a href="#"
								class="nav-link p-0 text-muted">Features</a></li>
							<li class="nav-item mb-2"><a href="#"
								class="nav-link p-0 text-muted">Pricing</a></li>
							<li class="nav-item mb-2"><a href="#"
								class="nav-link p-0 text-muted">FAQs</a></li>
							<li class="nav-item mb-2"><a href="#"
								class="nav-link p-0 text-muted">About</a></li>
						</ul>
					</div>

					<div class="col-2">
						<h5>Section</h5>
						<ul class="nav flex-column">
							<li class="nav-item mb-2"><a href="#"
								class="nav-link p-0 text-muted">Home</a></li>
							<li class="nav-item mb-2"><a href="#"
								class="nav-link p-0 text-muted">Features</a></li>
							<li class="nav-item mb-2"><a href="#"
								class="nav-link p-0 text-muted">Pricing</a></li>
							<li class="nav-item mb-2"><a href="#"
								class="nav-link p-0 text-muted">FAQs</a></li>
							<li class="nav-item mb-2"><a href="#"
								class="nav-link p-0 text-muted">About</a></li>
						</ul>
					</div>

					<div class="col-2">
						<h5>Section</h5>
						<ul class="nav flex-column">
							<li class="nav-item mb-2"><a href="#"
								class="nav-link p-0 text-muted">Home</a></li>
							<li class="nav-item mb-2"><a href="#"
								class="nav-link p-0 text-muted">Features</a></li>
							<li class="nav-item mb-2"><a href="#"
								class="nav-link p-0 text-muted">Pricing</a></li>
							<li class="nav-item mb-2"><a href="#"
								class="nav-link p-0 text-muted">FAQs</a></li>
							<li class="nav-item mb-2"><a href="#"
								class="nav-link p-0 text-muted">About</a></li>
						</ul>
					</div>

					<div class="col-4 offset-1">
						<form>
							<h5>Subscribe to our newsletter</h5>
							<p>Monthly digest of whats new and exciting from us.</p>
							<div class="d-flex w-100 gap-2">
								<label for="newsletter1" class="visually-hidden">Email
									address</label> <input id="newsletter1" type="text"
									class="form-control" placeholder="Email address">
								<button class="btn btn-primary" type="button">Subscribe</button>
							</div>
						</form>
					</div>
				</div>

				<div class="d-flex justify-content-between py-4 my-4 border-top">
					<p>&copy; 2021 Company, Inc. All rights reserved.</p>
					<ul class="list-unstyled d-flex">
						<li class="ms-3"><a class="link-dark" href="#"><svg
									class="bi" width="24" height="24">
									<use xlink:href="#twitter" /></svg></a></li>
						<li class="ms-3"><a class="link-dark" href="#"><svg
									class="bi" width="24" height="24">
									<use xlink:href="#instagram" /></svg></a></li>
						<li class="ms-3"><a class="link-dark" href="#"><svg
									class="bi" width="24" height="24">
									<use xlink:href="#facebook" /></svg></a></li>
					</ul>
				</div>
			</footer>
		</div>


		<script src="../assets/dist/js/bootstrap.bundle.min.js"></script>


	</footer>
</body>
</html>
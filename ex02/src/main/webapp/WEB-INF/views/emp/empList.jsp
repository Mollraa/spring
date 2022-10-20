<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!-- 
 오류 allList:1083 Uncaught ReferenceError: $ is not defined at allList:1083:3 : jquery cnd
 -->
<style>
table, tr, th, td {
	border: 1px, solid, black;
	margin: 0px;
}
</style>
</head>
<!-- 동기식 데이터 처리 -->
<body>
	<h1>${msg }</h1>
	<!-- <h6>${empInfoList }</h6>	-->


	<br>
	<!-- 교수님 풀이 -->
	<div id="dataList" style="border: 1px, solid, black;">
		<button type="button" onclick="location.href='insertForm'">사원등록</button>
		<table>
			<thead>
				<tr>
					<th>사원번호</th>
					<th>성</th>
					<th>이름</th>
					<th>직업</th>
					<th>급여</th>
					<th>부서번호</th>
				</tr>
			</thead>
			<!-- iteams=jspl에서 가져온값, var=담을변수이름 -->
			<tbody>
				<c:forEach items="${empInfoList }" var="empInfo">
					<!-- get만 가능
					  <tr onclick="location.href='info?employeeId=${empInfo.employeeId }'">
					  -->
					<tr name="${empInfo.employeeId}">
						<td>${empInfo.employeeId }</td>
						<td>${empInfo.firstName }</td>
						<td>${empInfo.lastName }</td>
						<td>${empInfo.jobId }</td>
						<td>${empInfo.salary }</td>
						<td>${empInfo.departmentId }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<!-- 
	 동기식 : ajax를 동기식으로 바꾸면 대기상태가 됨, 데이터 조작만 하고 뷰 작동 안함. 
	 		경로 변환 X -> 그 자리에 있는 걸 태그로 덮어씀 | 상대경로 다 무시됨
	 		
	 form을 이용하쟈 : get,post,delete put 가능
	 -->
		<form id="input">
			<input type="hidden" name="employeeId">
		</form>
	</div>
	<script>
	//td -> parent -> tr -> name : 지금은 get방식
	//.prop('method', 'get') -> post방식 할 때 참고
	
	//등록시 alert
	let message = '${msg}';
	if(message != null && message !=''){		
	alert('${msg}');
	}
	
		$('#dataList td').click(function() {
			let empId = $(this).parent().attr('name');
			$('#input > input').val(empId);
			$('#input').prop('action', 'info').prop('method', 'get').submit();
		});
	</script>




	<br>
	<!-- jqurey로 풀기, jstl의 값을 어떻게 바꿀지가 관건 -->
	<!-- jsp는 결국 html형태로 반환/ 순서: c:태그 실행 -> js반복된코드 읽어나감 -> 내가원하는 형태의 데이터 반환 :jquery이용 데이터 뿌리기 -->
	<!-- c태그 안에서 js못씀, 동작 순서의 원리 잘 알고 쓰쟈 -->
	<script type="text/javascript">
		let empList = [];
		let emp = {};
		<c:forEach items="${empInfoList}" var="empInfo">
		emp = {
			employeeId : '${empInfo.employeeId}',
			firstName : '${empInfo.firstName}',
			lastName : '${empInfo.lastName}',
			departmentId : '${empInfo.departmentId}',
			jobId : '${empInfo.jobId}',
			salary : '${empInfo.salary}'
		}
		empList.push(emp);
		</c:forEach>

		/* 
		//제데로 데이터가 들어왔을 때 어떻게 하느냐
		$('tbody').empty();

		$(empList).foreach(function(idx, obj) {
			let tr = $('<tr/>');
			$(tr).append($('<td/>').text(obj.employeeId));
			$(tr).append($('<td/>').text(obj.firstName));
			$(tr).append($('<td/>').text(obj.lastName));
			$(tr).append($('<td/>').text(obj.jobId));
			$(tr).append($('<td/>').text(obj.salary));
			$(tr).append($('<td/>').text(obj.departmentId));
			$('#dataList tbody').append(tr);
		});
		 */
	</script>




</body>

</html>
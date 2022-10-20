<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- CDN -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>

<body>
	<!-- form 단건 -->
	<!-- get : http://localhost:8081/java/users?name=%EB%B0%B1%EC%A7%84%ED%9D%AC&age=22 -->
	<!-- post : http://localhost:8081/java/users -->
	<form action="users" method="post">
		<input type="text" name="name">
		<input type="number" name="age">
		<button type="submit">전송</button>
	</form>

	<!-- form을 이용, 데이터 다량넘기기 -->
	<form action="userList">
		<input type="text" name="List[0].name">
		<input type="number" name="List[0].age"> 
			<input type="text" name="List[1].name">
		<input type="number" name="List[1].age">
		<button type="submit">전송</button>
	</form>
	<br>
	<button onclick="javascript:ajaxUserList();">ajax</button>
	<script type="text/javascript">
	function ajaxUserList() {
		//제이슨 데이터 형태로 만들어줌
		let data = [
			{"name" : "백제니", "age" : 22},
			{"name" : "노지수", "age" : 22},
			{"name" : "킴리사", "age" : 22},
			{"name" : "이로제", "age" : 88}
			];
	//415오류 : contentType오타
	$.ajax({
		url : 'userList',
		type: 'post',
		contentType: 'application/json',
		data: JSON.stringify(data),
		succes : function(data){
			console.log(data);
		},
		error: function (reject) {
			console.log(reject);
		}
		
		});

	}
	</script>
</body>
</html>
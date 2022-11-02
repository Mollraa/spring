<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table, tr, th, td {
	border: 1px, solid, pink;
}
</style>
</head>
<body>
	<table>
		<tr>
			<th colspan="2">${test.deptId }</th>
		</tr>
		<c:forEach items="${test.nameList }" var="name">
			<tr>
				<td colspan="2">${name }</td>
			</tr>
		</c:forEach>
		<tr>
			<td>${test.dataList[0].state }</td>
			<td>${test.dataList[0].location }</td>
		</tr>
	</table>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>�̺�Ʈ ���</h1>
	<h2>${message}</h2>
	<table>
		<tr>
			<th>�̸�</th>
			<th>����</th>
		</tr>
		<c:forEach items="${events}" var="event">
			<tr>
				<td>${event.name}</td>
				<td>${event.starts}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
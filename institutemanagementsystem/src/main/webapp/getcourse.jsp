<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 style="color:red;">Course Details:</h1>
<table border="2">
		<tr>
			<th>CourseId</th>
			<th>CourseName</th>
			<th>Action</th>
		</tr>

		<c:forEach items="${data}" var="s">
			<tr>
				<td>${s.cid }</td>
				<td>${s.cname }</td>
				<td><a href="">DELETE</a> || <a href="">UPDATE</a></td>
			</tr>

		</c:forEach>

	</table>

</body>
</html>
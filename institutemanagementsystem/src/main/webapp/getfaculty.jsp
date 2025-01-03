<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Faculty Details</title>
</head>
<body>
<h1 style="color:red;">Faculty Details:</h1>
<table border="2">
    <tr>
        <th>FacultyId</th>
        <th>FacultyName</th>
        <th>CourseId</th>
        <th>CourseName</th>
        <th>Action</th>
    </tr>

    <c:forEach items="${data}" var="s">
        <tr>
            <td>${s.fid}</td>
            <td>${s.fname}</td>
            <td colspan="2">
                <!-- Nested loop for courses -->
                <table border="1">
                    <c:forEach items="${s.lcourse}" var="course">
                        <tr>
                            <td>${course.cid}</td>
                            <td>${course.cname}</td>
                        </tr>
                    </c:forEach>
                </table>
            </td>
            <td>
                <a href="deleteFaculty?id=${s.fid}">DELETE</a> || 
                <a href="updateFaculty?id=${s.fid}">UPDATE</a>
            </td>
        </tr>
    </c:forEach>

</table>
</body>
</html>

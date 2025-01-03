<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="addfacultydao">
<pre>

Faculty Name:<input type="text" name="fname">
Course Id:<input type="number" name="cid">
<input type="submit" value="ADD">
<h2 style="color:red"> ${msg}</h2>
</pre>

</form>

</body>
</html>
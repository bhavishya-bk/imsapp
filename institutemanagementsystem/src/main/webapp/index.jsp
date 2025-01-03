<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
<style>
    body {
        font-family: Arial, sans-serif;
        margin: 20px;
        padding: 20px;
    }
    h1 {
        color: red;
        text-align: center;
    }
    table {
        width: 60%;
        margin: 20px auto;
        border-collapse: collapse;
    }
    table, th, td {
        border: 1px solid black;
    }
    th, td {
        padding: 10px;
        text-align: center;
    }
    th {
        background-color: #f2f2f2;
    }
    a {
        text-decoration: none;
        color: blue;
    }
    a:hover {
        color: darkblue;
    }
</style>
</head>
<body>
    <h1>Welcome to CJC Karve Nagar</h1>
    
    <table>
        <tr>
            <th>Functionality</th>
            <th>Actions</th>
        </tr>
        <tr>
            <td>Course</td>
            <td>
                <a href="addcourse">Add</a> | 
                <a href="viewcourse">View</a>
            </td>
        </tr>
        <tr>
            <td>Faculty</td>
            <td>
                <a href="addfaculty">Add</a> | 
                <a href="viewfaculty">View</a>
            </td>
        </tr>
        <tr>
            <td>Batch</td>
            <td>
                <a href="addbatch">Add</a> | 
                <a href="viewbatch">View</a>
            </td>
        </tr>
        <tr>
            <td>Student</td>
            <td>
                <a href="addstudent">Add</a> | 
                <a href="viewstudent">View</a>
            </td>
        </tr>
    </table>
</body>
</html>

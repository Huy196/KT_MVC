<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 12/10/2024
  Time: 10:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List employee</title>
</head>
<body>
<h3>Employees</h3>
<p>
    <a href="/employee?action=list">List employees</a>
</p>
<form>

</form>
<table border="0.4">
    <tr>
        <td>STT</td>
        <td>Họ và tên</td>
        <td>Tuổi</td>
        <td>Vị trí công việc</td>
        <td>Phòng ban</td>
        <td>Mức lương</td>
        <td>Chức năng</td>
    </tr>
    <c:forEach items= "${employees}" var="employee">
        <tr>
            <td>${employee.ma}</td>
            <td>${employee.name}</td>
            <td>${employee.age}</td>
            <td>${employee.jobPosition}</td>
            <td>${employee.departments}</td>
            <td>${employee.salary}</td>
            <td>
                <a>delete</a>
                <a>delete</a>
                <a>delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 12/10/2024
  Time: 3:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cập nhật thông tin</title>
</head>
<body>
<h3>Cập nhật thông tin </h3>
<form method="post" action="/employee?action=update">
    <fieldset>
        <legend>Customer information</legend>
        <table>
            <tr>
                <td>Name:</td>
                <td><input type="text" name="name" id="name" value="${employee.name}"></td>
            </tr>
            <tr>
                <td>Age:</td>
                <td><input type="number" name="age" id="age" value="${employee.age}"></td>
            </tr>
            <tr>
                <td>Job Position:</td>
                <td><input type="text" name="jobPosition" id="jobPosition" value="${employee.jobPosition}"></td>
            </tr>
            <tr>
                <td>Departments:</td>
                <td><input type="text" name="departments" id="departments" value="${employee.departments}"></td>
            </tr>
            <tr>
                <td>Salary:</td>
                <td><input type="number" name="salary" id="salary" value="${employee.salary}"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Update customer"></td>
            </tr>
        </table>
    </fieldset>
</form>

</body>
</html>

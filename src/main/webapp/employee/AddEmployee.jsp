<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 12/10/2024
  Time: 2:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ADD Employee</title>
</head>
<body>

<form method="post" action="/employee?action=add">
    <fieldset>
        <legend>Customer information</legend>
        <table>
            <tr>
                <td>Name:</td>
                <td><input type="text" name="name" id="name"></td>
            </tr>
            <tr>
                <td>Age:</td>
                <td><input type="number" name="age" id="age"></td>
            </tr>
            <tr>
                <td>Vị trí công việc</td>
                <td><input type="text" name="jobPosition" id="jobPosition"></td>
            </tr>
            <tr>
                <td>Phòng ban:</td>
                <td><input type="text" name="departments" id="departments"></td>
            </tr>
            <tr>
                <td>Lương:</td>
                <td><input type="number" name="salary" id="salary"></td>
            </tr>
            <tr>
                <td>Name:</td>
                <td><input type="submit" value="Thêm"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>

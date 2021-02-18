<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Doan Duong
  Date: 2/17/2021
  Time: 3:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Employee</h2>
<%--@elvariable id="employee2" type="com.doanduong.form.*"--%>
<form:form method="POST" action="addEmployee2" modelAttribute="employee2">
    <table>
        <tr>
            <td><form:label path="id">Id</form:label></td>
            <td><form:input path="id"/></td>
        </tr>
        <tr>
            <td><form:label path="name">Name</form:label></td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td><form:label path="Address">Addess</form:label></td>
            <td><form:textarea path="address"/></td>
        </tr>
        <tr>
            <td><form:label path="email">Email</form:label></td>
            <td><form:input path="email"/></td>
        </tr>
        <tr>
            <td><form:label path="gender">Gender</form:label></td>
            <td><form:radiobutton path="gender" value="male" label="male"/>
                <form:radiobutton path="gender" value="female" label="female"/></td>
        </tr>
        <tr>
            <td><form:label path="favorites">Favorite</form:label></td>
            <td>
                <form:checkboxes items="${listFavorite}"
                                 path="favorites"/>
            </td>
        </tr>
        <tr>
            <td><form:label path="position">Position</form:label></td>
            <td>
                <form:select path="position">
                    <form:option value="NONE" label="Select"/>
                    <form:options items="${listPosition}"/>
                </form:select>
            </td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>

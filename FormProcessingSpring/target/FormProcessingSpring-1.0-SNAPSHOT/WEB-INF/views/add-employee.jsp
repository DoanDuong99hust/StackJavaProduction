<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Doan Duong
  Date: 2/17/2021
  Time: 3:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring Form</title>
</head>
<body>
    <h2>Employee</h2>
<form:form method="POST" action="addEmployee" modelAttribute="employee">
    Id : <form:input path="id"/> <br/>
    Name : <form:input path="name" /> <br/>
    <input type="submit" value="submit">
</form:form>
</body>
</html>

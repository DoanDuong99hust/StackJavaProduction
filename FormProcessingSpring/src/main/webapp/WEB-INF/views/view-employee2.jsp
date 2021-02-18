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
<h2>employee2</h2>
<table>
    <tr>
        <td>Id:</td>
        <td>${employee2.id }</td>
    </tr>
    <tr>
        <td>Name:</td>
        <td>${employee2.name }</td>
    </tr>
    <tr>
        <td>Address:</td>
        <td>${employee2.address }</td>
    </tr>
    <tr>
        <td>Email:</td>
        <td>${employee2.email }</td>
    </tr>
    <tr>
        <td>Gender:</td>
        <td>${employee2.gender }</td>
    </tr>
    <tr>
        <td>Favorite:</td>
        <td>
            <c:if test="${not empty employee2.favorites}">
                <c:forEach var="favorite" items="${employee2.favorites}">${favorite}</c:forEach>
            </c:if>
        </td>
    </tr>
    <tr>
        <td>Position:</td>
        <td>${employee2.position}</td>
    </tr>
</table>
</body>
</html>

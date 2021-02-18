<%--
  Created by IntelliJ IDEA.
  User: Doan Duong
  Date: 2/17/2021
  Time: 11:13 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring Mvc Annotation</title>
</head>
<body>
    <h2>home.jsp</h2>
    <a href="home">/home</a> <br/>
    <a href="test">/test (GET)</a> <br/>
    <form method="post" action="test">
        <button type="submit">/test (POST)</button>
    </form>
    <br />
    <hr />
    <a href="test1/1">/test1/1</a>
    <br />
    <a href="test2/2/kai">/test2/2/kai</a>
    <br />
    <fieldset>
        <legend>/test3?id=&name=</legend>
        <form action="test3">
            Id: <input type="number" name="id" /> <br />
            Name: <input type="text" name="name" /> <br />
            <input type="submit" value="submit" />
        </form>
    </fieldset>
</body>
</html>

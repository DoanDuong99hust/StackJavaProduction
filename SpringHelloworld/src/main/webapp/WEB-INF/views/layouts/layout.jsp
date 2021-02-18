<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%--
  Created by IntelliJ IDEA.
  User: Doan Duong
  Date: 2/18/2021
  Time: 2:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><tiles:getAsString name="title" /></title>
</head>
<body>
<tiles:insertAttribute name="header" />
<br/>
<div style="display:inline">
    <tiles:insertAttribute name="menu" />
    <tiles:insertAttribute name="body" />
</div>
<br/>
<br/>
<tiles:insertAttribute name="footer" />
</body>
</html>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Doan Duong
  Date: 2/18/2021
  Time: 9:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="<c:url value="/resources/css/bootstrap.min.css" />"
          rel="stylesheet">
    <script src="<c:url value="/resources/js/jquery-3.5.1.min.js" />"></script>
    <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
    <script src="<c:url value="/resources/js/jquery.form.min.js" />"></script>
    <script src="<c:url value="/resources/js/style.js"/> "></script>
</head>
<body>
<%--@elvariable id="myFile" type="com.doanduong.files.*"--%>
<form:form id="formUploadFile" method="POST" action="uploadFileProgressBar" enctype="multipart/form-data" modelAttribute="myFile">
    File: <input type="file" name="multipartFile" /> <br /> <br/>
    Description: <form:input path="description"/> <br />
    <input type="submit" value="Submit" />
</form:form>

<br /> <br />
<div class="progress" id="progressbox" style="height: 45px; width: 70%" >
    <div class="progress-bar progress-bar-striped active" id="progressbar"
         role="progressbar" aria-valuenow="80" aria-valuemin="0"
         aria-valuemax="100" style="width: 0%">
        <div id="status" style="text-align: center; width: 100%; margin-top: 10px"></div>
    </div>
</div>
</body>
</html>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: vitalie.burcovschi
  Date: 31.05.2023
  Time: 07:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee Info</title>
</head>
<body>
<h2>Employee Info</h2>
<br>
<form:form action="saveEmployee" modelAttribute="employee">
    Name <form:input path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <br><br>
    Department <form:input path="department"/>
    <br><br>
    Salary <form:input path="salary"/>
    <br><br>
    <input type="submit" value="OK">
</form:form>
</body>
</html>

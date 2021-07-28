<%--
  Created by IntelliJ IDEA.
  User: rxlogix
  Date: 28/7/21
  Time: 11:43 AM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<form action="employee/create" method="post">
    <label for="name">Name</label>
    <input type="text" name="empName" id="name">
    <label for="number">Number</label>
    <input type="number" name="empNumber" id="number">
    <label for="location">Location</label>
    <input type="text" name="location" id="location">
    <input type="submit" name="" value="Create">
</form>
<body>

</body>
</html>
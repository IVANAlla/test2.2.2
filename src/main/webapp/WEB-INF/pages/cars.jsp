<%--@elvariable id="msg" type="java"--%>
<%--
  Created by IntelliJ IDEA.
  User: Alla
  Date: 05.12.2024
  Time: 11:02
  To change this template use File | Settings | File Templates.
--%>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
 lang="en">
<head>
    <title>List of Cars</title>
</head>
<body>
<header>
    <h2>ALL CARS</h2>
</header>

<div>
    <!--/*@thymesVar id="cars" type="org"*/-->
    <th:block th:each="msg : ${cars}">
        <!--/*@thymesVar id="msg" type="javax"*/-->
        <h1 th:text="${msg}"></h1>
    </th:block>
</div>

</body>
</html>


<%--
  Created by IntelliJ IDEA.
  User: ZeDongW
  Date: 2020/9/26 0026
  Time: 20:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>success</title>
</head>
<body>
    成功<br>
    success<br>
    ${user.userName}<br/>
    <fmt:formatDate value="${user.birthDay}" dateStyle="full"></fmt:formatDate>
    <br/>
</body>
</html>

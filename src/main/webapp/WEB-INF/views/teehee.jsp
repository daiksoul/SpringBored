<%--
  Created by IntelliJ IDEA.
  User: daiks
  Date: 2022-12-02
  Time: 오전 9:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>weehEE</title>
</head>
<body>
  <c:forEach items="${strg}" var="var">
    <p>${var}</p>
  </c:forEach>
</body>
</html>

<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/2/28
  Time: 13:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Spittr</title>
  </head>
  <body>
    <h1>Welcome to Spittr</h1>
    <a href="<c:url value="/sittles"/>">Spittles</a>
    <a href="<c:url value="/sitter/register"/>">Register</a>
  </body>
</html>

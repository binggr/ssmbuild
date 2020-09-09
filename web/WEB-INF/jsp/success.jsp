<%--
  Created by IntelliJ IDEA.
  User: bing
  Date: 2020/9/9
  Time: 10:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>成功界面</title>
</head>
<body>
    <h1>登录成功</h1>
    <hr>
    ${username}
    <a href="${pageContext.request.contextPath}/user/logout">注销登录</a>
</body>
</html>

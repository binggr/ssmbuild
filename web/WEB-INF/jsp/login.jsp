<%--
  Created by IntelliJ IDEA.
  User: bing
  Date: 2020/9/9
  Time: 10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
    <form style="text-align: center" action="${pageContext.request.contextPath}/user/login">
        用户名：<input type="text" name="username"> <br>
        密码：<input type="password" name="pwd"> <br>
        <input type="submit" value="提交">
    </form>
</body>
</html>

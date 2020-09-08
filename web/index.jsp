<%--
  Created by IntelliJ IDEA.
  User: bing
  Date: 2020/9/8
  Time: 17:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>
      <style>
          a{
              text-decoration: none;
              color: black;
              font-size: 18px;
          }
          h1{
              width: 280px;
              height: 38px;
              margin: 100px auto;
              text-align: center;
              line-height: 38px;
              background: deepskyblue;
              border-radius: 5px;
          }
      </style>
  </head>
  <body>
      <h1>
        <a href="${pageContext.request.contextPath}/book/allBook">进入书籍展示页面</a>
      </h1>
  </body>
</html>

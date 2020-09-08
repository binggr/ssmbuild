<%--
  Created by IntelliJ IDEA.
  User: bing
  Date: 2020/9/8
  Time: 23:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍页面</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改图书</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/book/updateBook" method="post" class="col-sm-8">
        <input type="hidden" value="${QBook.bookID}" name="bookID">

        <div class="form-group">
            <label >书籍名称</label>
            <input type="text" class="form-control" name="bookName" required value="${QBook.bookName}">
        </div>

        <div class="form-group">
            <label>书籍数量</label>
            <input type="text" class="form-control" name="bookCounts" required value="${QBook.bookCounts}">
        </div>

        <div class="form-group">
            <label>书籍详情</label>
            <input type="text" class="form-control" name="detail" required value="${QBook.detail}">
        </div>

        <button type="submit" class="btn btn-default">修改</button>
    </form>

</div>

</body>
</html>


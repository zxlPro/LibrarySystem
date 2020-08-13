<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>借还日志</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <script src="js/jquery-3.2.1.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/bootstrap-paginator.min.js"></script>
    <script src="js/lend/lendList.js"></script>
    <script>
        $(function () {
            $('#header').load('admin_header.html');
        })
    </script>
</head>
<body background="img/u5.jpeg" style=" background-repeat:no-repeat ;
background-size:100% 100%;
background-attachment: fixed;">
<div id="header"></div>
<div style="padding: 70px 450px 10px">
    <form class="form-inline"  id="searchform">
        <div class="form-group">
            <label for="bookName">图书名</label>
            <input type="text" class="form-control" id="bookName" name="bookName" placeholder="输入图书名">
        </div>
        <div class="form-group">
            <label for="readerName">读者名</label>
            <input type="email" class="form-control" id="readerName" name="readerName" placeholder="输入读者名">
        </div>
        <input type="button" value="搜索" onclick="getList(1)" class="btn btn-default">
    </form>
    <script>
    </script>
</div>

<div style="padding-top: 10px">
    <c:if test="${!empty succ}">
        <div class="alert alert-success alert-dismissable">
            <button type="button" class="close" data-dismiss="alert"
                    aria-hidden="true">
                &times;
            </button>
                ${succ}
        </div>
    </c:if>
    <c:if test="${!empty error}">
        <div class="alert alert-danger alert-dismissable">
            <button type="button" class="close" data-dismiss="alert"
                    aria-hidden="true">
                &times;
            </button>
                ${error}
        </div>
    </c:if>
</div>
<div class="panel panel-default" style="width: 90%;margin-left: 5%">
    <div class="panel-heading">
        <h3 class="panel-title">
            借还日志
        </h3>
    </div>
    <div class="panel-body">
        <table class="table table-hover">
            <thead>
            <tr>
                <th>流水号</th>
                <th>图书号</th>
                <th>图书名称</th>
                <th>读者证号</th>
                <th>读者名称</th>
                <th>借出日期</th>
                <th>归还日期</th>
            </tr>
            </thead>
            <tbody id="list_tbody">
            </tbody>
        </table>
    </div>
    <div style="text-align:center;"><ul id="pageLimit" ></ul></div>
</div>

</body>
</html>

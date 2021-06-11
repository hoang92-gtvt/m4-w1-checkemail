<%--
  Created by IntelliJ IDEA.
  User: YEN
  Date: 6/11/2021
  Time: 10:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Home</h1>
    <form method="post">

        <div>
           <span>Nhập Email</span>
           <input type ="text" name ="email" value="${email}" />
       </div>
        <button type="submit">Check</button>

    </form>
    <c:if test="${!check && email!=null}" >
        <h2>Email không hợp lệ</h2>
    </c:if>
    <c:if test="${check}" >
        <h2>Email Hợp lệ</h2>
    </c:if>

</body>

</body>
</html>

<style>
    div span {
        color: blue;
    }
</style>
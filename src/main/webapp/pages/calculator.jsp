<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<jsp:include page="_header.jsp"/>
<br>
<form style="width: 600px" action="/calc" method="post">
    <div class="container px-4">
        <div class="row">
            <div class="col">
                <input type="text" name="firstNum" class="form-control" placeholder="firstNum" aria-label="First name">
            </div>
            <div class="col">
                <input type="text" name="secondNum" class="form-control" placeholder="secondNum" aria-label="Last name">
            </div>
            <div class="col">
                <input type="text" name="operation" class="form-control" placeholder="operation" aria-label="Last name">
            </div>
        </div>
        <br>
        <button type="submit" class="btn btn-light">Calculate</button>
        <br>
        <br>
<%--        <c:if test="${requestScope.calculate==null}">--%>
            <span style="font-size: medium" class="badge rounded-pill bg-success">${requestScope.calculate}</span>
<%--        </c:if>--%>

<%--        <c:if test="${requestScope.message!=null}">--%>
<%--            <span style="font-size: medium" class="badge bg-danger" style="width: 150px; height: available">${requestScope.message}</span>--%>
<%--        </c:if>--%>
    </div>
</form>
</body>
</html>

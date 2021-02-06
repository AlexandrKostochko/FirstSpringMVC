<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>History</title>
</head>
<body>
<jsp:include page="_header.jsp"/>
<div style="width: 60%; margin-left: auto; margin-right: auto">
    <table class="table">
        <thead>
        <tr>
            <th scope="col">Id</th>
            <th scope="col">Operation</th>
        </tr>
        </thead>
        <tbody>
    <c:forEach items="${requestScope.operations}" var="operation">
        <tr>
            <th scope="row">${operation.getIdOperation()}</th>
            <td>${operation}</td>
        </tr>
    </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>

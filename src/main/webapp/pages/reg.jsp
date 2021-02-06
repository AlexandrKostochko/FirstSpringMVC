<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<jsp:include page="_header.jsp"/>
<div style="width: 60%; display: block; margin-left: auto; margin-right: auto">
    <form class="row g-3" action="/reg" method="post" style="width: 70%; display: block; margin-left: auto; margin-right: auto">
        <div class="form-floating mb-3">
            <input type="text" class="form-control" id="floatingInput" placeholder="name" name="name">
            <label for="floatingInput">Name</label>
        </div>
        <div class="form-floating">
            <input type="text" class="form-control"  placeholder="Login" name="login">
            <label for="floatingPassword">Login</label>
        </div>
        <div class="form-floating">
            <input type="password" class="form-control" id="floatingPassword" placeholder="Password" name="password">
            <label for="floatingPassword">Password</label>
        </div>
        <div class="col-12" >
            <button type="submit" class="btn btn-primary" style="display:block; margin-left: auto">Sign in</button>
        </div>
    </form>
    <c:if test="${requestScope.userService.add == true}">
        <span style="font-size: medium" class="badge rounded-pill bg-success">${requestScope.result}</span>
    </c:if>

    <c:if test="${requestScope.userService.add != true}">
        <span style="font-size: medium" class="badge bg-danger" style="width: 150px; height: available">${requestScope.wrongResult}</span>
    </c:if>
</div>
</body>
</html>

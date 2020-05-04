<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h1>Login page</h1>
    <h4 style="color:red">${errorMsg}</h4>

    <form action="${pageContext.request.contextPath}/users/login" method="post">
        Please provide your registration data:
        <br>
        login: <input type="text" name="login">
        <br>
        password: <input type="password" name="password">
        <br>
        <button type="submit">Login</button>
    </form>
</body>
</html>

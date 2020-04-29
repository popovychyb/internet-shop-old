<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
    <h1>Hello! Please provide your user details</h1>
    <h2>${message}</h2>
    <form method="post" action="${pageContext.request.contextPath}/users/registration">
        Please provide your registration data:
        <br>
        name: <input type="text" name="name">
        <br>
        login: <input type="text" name="login">
        <br>
        password: <input type="password" name="password">
        <br>
        repeat password: <input type="password" name="passwordRepeat">
        <br>
        <button type="submit">Register</button>
    </form>
</body>
</html>


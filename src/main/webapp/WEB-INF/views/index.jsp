<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Internet shop</h1>
    <a href="${pageContext.request.contextPath}/users/registration">Register user</a>
    <br>
    <a href="${pageContext.request.contextPath}/users/all">All users</a>
    <br>
    <br>
    <a href="${pageContext.request.contextPath}/products/createProduct">Create product</a>
    <br>
    <a href="${pageContext.request.contextPath}/products/allProducts">All products</a>
    <br>
    <br>
    <a href="${pageContext.request.contextPath}/cart/showCart">Show Cart</a>
</body>
</html>

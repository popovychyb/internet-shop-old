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
    <a href="${pageContext.request.contextPath}/products/create">Create product</a>
    <br>
    <a href="${pageContext.request.contextPath}/products/allProducts">All products(user)</a>
    <br>
    <a href="${pageContext.request.contextPath}/allProductsAdmin">All products(admin)</a>
    <br>
    <br>
    <a href="${pageContext.request.contextPath}/cart/show">Show Cart</a>
    <br>
    <br>
    <a href="${pageContext.request.contextPath}/oder/showAll">Show orders</a>
    <br>
    <br>
    <a href="${pageContext.request.contextPath}/logout">Logout</a>
    <br>
    <a href="${pageContext.request.contextPath}/inject">Inject data</a>
</body>
</html>

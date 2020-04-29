<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new product</title>
</head>
<body>
    <h1>Create new product</h1>
    <form method="post" action="${pageContext.request.contextPath}/products/createProduct">
        Please provide your product data:
        <br>
        name <input type="text" name="name">
        <br>
        price <input type="number" name="price">
        <br>
        <button type="submit">Submit</button>
    </form>
    <br>
    <a href="${pageContext.request.contextPath}/">Main page</a>
</body>
</html>

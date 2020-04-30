<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All orders</title>
</head>
<body>
    <h1>All orders</h1>
    <table border="1">
        <tr>
            <th>Oder id</th>
            <th>User id</th>
            <th>User Name</th>
        </tr>
        <c:forEach var="order" items="${orders}">
            <tr>
                <td>
                    <c:out value="${order.id}"/>
                </td>
                <td>
                    <c:out value="${order.user.id}"/>
                </td>
                <td>
                    <c:out value="${order.user.name}"/>
                </td>
                <td>
                    <a href="${pageContext.request.contextPath}/showOrder?id=${order.id}">Show</a>
                </td>
                <td>
                    <a href="${pageContext.request.contextPath}/deleteOrder?id=${order.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <a href="${pageContext.request.contextPath}/">Main page</a>
</body>
</html>

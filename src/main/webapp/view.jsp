<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<html>
<head>
    <title>Registered Couples</title>
</head>
<body>
    <h2>Registered Couples</h2>
    <table border="1">
        <tr>
            <th>Email</th>
            <th>Name</th>
            <th>Birthday</th>
            <th>Status</th>
        </tr>
        <c:forEach var="c" items="${couples}">
            <tr>
                <td>${c.email}</td>
                <td>${c.legalName}</td>
                <td>${c.birthday}</td>
                <td>${c.status}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
    <c:if test="${not empty message}">
        <c:forEach var="list" items="${message}">
            <h1>${list.getId()} <span style="color: red;">${list.getName()}</span></h1>
        </c:forEach>
    </c:if>
</body>
</html>
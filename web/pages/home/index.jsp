<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pogo cafe</title>

    <jsp:include page="/pages/shared/layoutDependecies.jsp"/>
</head>
<body>
<jsp:include page="/pages/shared/layoutTop.jsp"/>
<div id="containt">
    <jsp:include page="${containt}"/>
</div>
<jsp:include page="/pages/shared/layoutBottom.jsp"/>
</body>
</html>

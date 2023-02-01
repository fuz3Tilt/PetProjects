<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Second JSP</title>
</head>
<body>
<h1>Testing JSP</h1>
<p>
    <%=
    request.getParameter("name")
    %>
</p>
<a href="second-jsp/test">Click here to see test</a>
</body>
</html>
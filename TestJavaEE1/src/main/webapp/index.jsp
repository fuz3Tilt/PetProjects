<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <body>
        <h2>
            Hello World!
        </h2>
        <p>
            <%@ page import="java.util.Date" %>
                <%
                out.println(new Date());
                for(int i=0;i<10;i++)
                    out.println("<p>"+"Something"+i+"</p>");
                    %>
        </p>

        <a href="servlet1">Click here to see first servlet</a>
        <a href="servlet2">Click here to see second servlet</a>
    </body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: yasse
  Date: 6/1/2021
  Time: 10:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%
        String productName = (String)session.getAttribute("productName");
        String price = (String)session.getAttribute("price");

        if(productName == null || price == null){
            response.sendRedirect("index.jsp?error=2");
        }

        else {
            out.println("<h1>the product is</h1>");
            out.println("<p>product name is: "+productName+"</p>");
            out.println("<p>product price is: "+price+"</p>");
        }
    %>


</body>
</html>
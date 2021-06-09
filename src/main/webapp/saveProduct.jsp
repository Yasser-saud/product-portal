<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<%
    String productName = request.getParameter("productName");
    String price = request.getParameter("price");

    if(productName.length() <= 0 || price.length() <= 0){
        response.sendRedirect("index.jsp?error=1");
    }else {

    }
%>
    <jsp:useBean id="productBean" class="com.ProductBean" scope="session"></jsp:useBean>
        <jsp:setProperty name="productBean" property="*"></jsp:setProperty>
        <jsp:forward page="test"></jsp:forward>
</body>
</html>
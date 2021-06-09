<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%
        if(request.getParameter("error") != null){
            out.println("<h3>your session has ended or is invalid</h3>");
        }

    %>

    <form action="${pageContext.request.contextPath}/save" method="post">
        <label>Product name</label><br/>
        <input name="productName" type="text"/><br/>

        <label>price</label><br/>
        <input name="price" type="text"/><br/>
        <input type="submit" name="save" value="save product"/>
    </form>

</body>
</html>
package com;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet", value = "/Servlet")
public class SaveServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect(request.getContextPath()+"/");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productName = request.getParameter("productName");
        String price = request.getParameter("price");
        PrintWriter out = response.getWriter();
        ProductBean product = new ProductBean(productName, price);
        HttpSession session = request.getSession();
        session.setAttribute("product", product);
        out.println("<h2>Product is saved in the session</h2>");
        out.println("<a href='show'>show product</a>");
    }
}
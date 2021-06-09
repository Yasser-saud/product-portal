package com;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet", value = "/Servlet")
public class ShowServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        ProductBean product = (ProductBean) session.getAttribute("product");
        if(product == null){
            response.sendRedirect(request.getContextPath()+"/");
        }
        else {
            PrintWriter out = response.getWriter();
            out.println("<h4>product name: "+ product.getProductName()+"</h4>");
            out.println("<h4>product price: "+ product.getPrice()+"</h4>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
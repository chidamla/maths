package com.pesil.main;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// Changed for release 3.0
//@WebServlet("/addition")
public class additionServlet extends HttpServlet {
	
	private static final long serialVersionUID = 102831973239L;
	
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	int int1 = Integer.parseInt (req.getParameter("int1"));
    	int int2 = Integer.parseInt (req.getParameter("int2"));
    	int int3 = int1 + int2;
    	
        req.setAttribute("value", int3);
        RequestDispatcher view = req.getRequestDispatcher("result.jsp");
        view.forward(req, resp);
        
    }

}

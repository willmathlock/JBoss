package com.br.tutorial;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet")
public class BRServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@EJB
	BRSessionBean BrSessionBean;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entering the servlet doGet method...*");
		PrintWriter out = response.getWriter();
		out.println(BrSessionBean.BRSessionBeanMethod());
		System.out.println("Exiting the servlet doGet method...*");
	}

}

package com.example.servletjspdemo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/FormuServlet")
public class FormuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FormuServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String imie = request.getParameter("imie");
		String nazwisko = request.getParameter("nazwisko");
		String email = request.getParameter("email");
		String email2 = request.getParameter("email2");
		String pracodawca = request.getParameter("pracodawca");
		String skad = request.getParameter("skad");
		String inne = request.getParameter("inne");
		String zajecie = request.getParameter("zajecie");
		
		if (email != email2)response.sendRedirect("form.jsp");
		
		
	}

}

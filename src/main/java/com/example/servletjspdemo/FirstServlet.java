package com.example.servletjspdemo;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().println("Hello World !"); // Wypisanie
		//response.sendRedirect("test.jsp"); //Przekierowanie
		
		String name = request.getParameter("name");
		HttpSession session = request.getSession();
		ServletContext ctx = request.getServletContext();
		
		
		if(name != null && !name.equals(""))
		{
			session.setAttribute("name", name);
			ctx.setAttribute("name", name);
		}
		
		response.getWriter().println("Hello " + name + "!");
		response.getWriter().println("Hello from session " + session.getAttribute("name") + "!");
		response.getWriter().println("Hello from ctx " + ctx.getAttribute("name") + "!");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}

package com.phoenix.web.welcome;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class WelcomeServlet
 * @author MehulThakor
 */
@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(3);
		System.out.println("sessionId: "+session.getId());
		
		String uname =  request.getParameter("username");
		
		session.setAttribute("uname", uname);
		String EncodedUrl = response.encodeURL("products");
		out.println("<h1>Welcome to the servlet World</h1>");
	    out.println("<p style='font-size:25px'>Your session will be closed in "+session.getMaxInactiveInterval()+" second.</p>"); 
	    out.println("<p style='font-size:25px'>To enjoy shoping in <b>big billions days</b> <a href='"+EncodedUrl+"'>Click here</a><p>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package com.phoenix.web.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginServlet
 * @author MehulThakor
 */
@WebServlet("/LoginS")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String passwd = request.getParameter("passwd");
		if(username!=null && passwd!=null && username.equals("mehul") && passwd.equals("meth114"))
		{
		    RequestDispatcher rd=request.getRequestDispatcher("welcome");  
	        rd.forward(request, response);
		}
		else
		{
			out.print("<b>Invalid login!<b><br><br>"); 
	        RequestDispatcher rd=request.getRequestDispatcher("/login.html");  
	        rd.include(request, response);  
		}	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

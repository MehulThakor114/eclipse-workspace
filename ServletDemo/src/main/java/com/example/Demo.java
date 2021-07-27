package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/hello")
public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String str = request.getParameter("username");
		System.out.println(str);
		PrintWriter out = response.getWriter();
		//request.setAttribute("name", str);
     // RequestDispatcher rd = request.getRequestDispatcher("hello2");
      //rd.forward(request, response);
		HttpSession session = request.getSession();
		System.out.println(session.getId());
		session.setAttribute("uname", str);
		//response.sendRedirect("hello2");
		String url = response.encodeURL("hello2");
		out.println("<p style='font-size:25px'>To buy products of your choice <p><a href="+url+">Click here</a>");
		  
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

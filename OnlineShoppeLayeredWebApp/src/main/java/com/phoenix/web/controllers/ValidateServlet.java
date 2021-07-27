package com.phoenix.web.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.phoenix.web.models.LoginBean;
import com.phoniex.exceptions.UserNotFoundException;

/**
 * Servlet implementation class ValidateServlet
 * @author MehulThakor
 */
@WebServlet("/validation")
public class ValidateServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out =response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("passwd");
		LoginBean bean = new LoginBean();
		request.setAttribute("object", bean);
		bean.setUsername(username);
		bean.setPassword(password);
		try {
			if(bean.isValid()) {
				RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
				rd.forward(request, response);
			}else {
				out.println("Invalid login!!!");
				RequestDispatcher rd1=request.getRequestDispatcher("/login.html");  
			    rd1.include(request, response);
			}
		} catch (UserNotFoundException | ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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

package com.phoenix.web.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.phoenix.data.Product;
import com.phoenix.services.ProductService;
import com.phoenix.services.ProductServiceImpl;
import com.phoniex.exceptions.ServiceException;

/**
 * Servlet implementation class ProductAllServlet
 */
@WebServlet("/ProductAllServlet")
public class ProductAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
			ProductService ps = new ProductServiceImpl();
			List<Product> listofproducts = ps.findAll();
			HttpSession session = request.getSession(false);
			if(session!=null)
				session.setAttribute("product", listofproducts);
			    System.out.println("done");
			response.sendRedirect("products.jsp");
		} catch(ServiceException e) {
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

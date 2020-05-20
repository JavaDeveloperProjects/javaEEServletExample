package com.omer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AddressServlet", urlPatterns = { "/AddressServlet" })
public class AddressServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AddressServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void processRequest(HttpServletRequest request, 
    		HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/html; charset=UTF-8");
		try (PrintWriter out = response.getWriter()) {
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>AddressServlet</title>");
			out.println("</head>");
			out.println("<body>");
			String fname = request.getParameter("fname");
			String lname = request.getParameter("lname");
			String addr = request.getParameter("addr");
			String post = request.getParameter("post");
			String mail = request.getParameter("mail");
			String date = request.getParameter("date");
			out.println("</body>");
			out.println("</html>");
		} 
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

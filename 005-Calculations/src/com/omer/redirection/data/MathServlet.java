package com.omer.redirection.data;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name="MathServlet", urlPatterns= { "/MathServlet" })
public class MathServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public MathServlet() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String opr = request.getParameter("operation");
		if (opr.equals("add") || opr.equals("sub")) {
			String a = request.getParameter("numbera");
			String b = request.getParameter("numberb");
			String site = opr.equals("add") ? "AddServlet" : "SubServlet";
			site += "?numbera=" + a + "&numberb=" + b;
			response.sendRedirect(site);
		} else if(opr.equals("mul") || opr.equals("div")) {
			ServletContext context = getServletConfig().getServletContext();
			RequestDispatcher dispatcher = opr.equals("mul") ? context.getRequestDispatcher("/MulServlet")
					: context.getRequestDispatcher("/DivServlet");
			dispatcher.forward(request, response);
		}else {
			response.sendRedirect("index.html");
		}
	}

}

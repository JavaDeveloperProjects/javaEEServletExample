package com.omer;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet(name = "Time", urlPatterns = { "/Time" })
public class TimeServlet extends  HttpServlet{

	private static final long serialVersionUID = 1L;
    
    public TimeServlet() {
        super();
    }
    protected void processRequest(HttpServletRequest request, 
    		HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		try (PrintWriter out = response.getWriter()) {
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet TimeServlet</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>The time is: " + getTime() + "</h1>");
			out.println("</body>");
			out.println("</html>");
		} 
	}
    private String getTime() {
    	
		Calendar date = Calendar.getInstance();
		return String.format("%d. %s %d %02d:%02d:%02d",
				date.get(Calendar.DATE), getMonth(date.get(Calendar.MONTH)),
				date.get(Calendar.YEAR), date.get(Calendar.HOUR), 
				date.get(Calendar.MINUTE), date.get(Calendar.SECOND));
	}

	private String getMonth(int n) {
		switch (n) {
		case 0:
			return "January";
		case 1:
			return "February";
		case 2:
			return "March";
		case 3:
			return "April";
		case 4:
			return "May";
		case 5:
			return "June";
		case 6:
			return "July";
		case 7:
			return "August";
		case 8:
			return "September";
		case 9:
			return "October";
		case 10:
			return "November";
		case 11:
			return "December";
		}
		return "";
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
    
}

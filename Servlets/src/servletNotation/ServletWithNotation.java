package servletNotation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/iServlet") //Burada verilen url ile çalýþacak
@WebServlet(urlPatterns= {"/ilk","/iServlet"})//Birden fazla servleti ekleme
public class ServletWithNotation extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		PrintWriter writer=response.getWriter();
		writer.write("url ile Servlet!");
		
	}

}

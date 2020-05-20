package ilkServlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ilkServletKodum extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
		PrintWriter printWriter=response.getWriter();
		printWriter.write("<html><body>");//Servlet içine html ekleme
		String message="<h1>Merhaba java</h1>";
		printWriter.write(message);
		printWriter.write("</body></html>");
		
	}

}

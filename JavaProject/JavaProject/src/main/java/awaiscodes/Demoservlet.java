package awaiscodes;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/add")
public class Demoservlet extends HttpServlet {
   
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		
		int k=i+j;
		
		PrintWriter out = res.getWriter();
		out.println("Result is :"+k);
		
		
	}
	
}

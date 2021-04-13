import java.io.*;
import javax.servlet.http.*;
import javax.servlet.ServletException;
import javax.sql.*;
import javax.servlet.RequestDispatcher;
import java.lang.*;

public class add extends HttpServlet
{
	public void doPost ( HttpServletRequest req, HttpServletResponse res ) throws IOException, ServletException
	{
			int fir=Integer.parseInt(req.getParameter("num1"));
	                int sec=Integer.parseInt(req.getParameter("num2"));
			String op=req.getParameter("op");
        	        int thir=454;
			switch(op)
			{
				case "+":
					thir=fir+sec;
					break;
				case "-":
					thir=fir-sec;
					break;
				case "*":
					thir=fir*sec;
					break;
				case "/":
					thir=fir/sec;
					break;
				case "%":
					thir=fir%sec;
					break;
			}
			PrintWriter p=res.getWriter();
			p.println("<html><head><title>Result Page</title>");
			p.println("</head><body><center>");
			p.println("The Computation of <br> <b>" +  fir + "</b> " + op + " <b>" + sec + "</b> = <b>" + thir +"</b>");
			p.println("</center></body></html>");
			

	}
}





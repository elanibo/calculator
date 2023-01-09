package service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Operaciones")

public class Operaciones extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out= null;
		try {
			out = response.getWriter();
			out.println("<center>");
			double n1 = Double.parseDouble(request.getParameter("n1"));
			double n2 = Double.parseDouble(request.getParameter("n2"));
			double resultado = 0;
			String op = request.getParameter("btn");
		if(op.equals("+")) resultado = n1 + n2;
		if(op.equals("-")) resultado = n1 - n2;
		if(op.equals("*")) resultado = n1 * n2;
		if(op.equals("/")) resultado = n1 / n2;
		out.println("<h3>" + n1 + op + n2 + "=" + resultado + "</h3>" );
			
		} catch (Exception e) {
			out.println("Error: " + e.getMessage());
	
		} finally {
			
			out.println("<br>");
			out.println("Regresar a la pagina main <a href = index.html> Regresar </a>");
			out.println("</center>");
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);

	}

}

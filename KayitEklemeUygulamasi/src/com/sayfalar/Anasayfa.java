package com.sayfalar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Anasayfa")
public class Anasayfa extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Anasayfa() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		
		writer.append("<html>");
		writer.append("<head></head>");
		
		writer.append("<body>");
		
		writer.append("<h1>Servlet ile ilk Web Sayfam</h1>");
		
		writer.append("</body>");
		
		writer.append("</html>");
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		super.doDelete(req, resp);
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		super.doPut(req, resp);
	}
}

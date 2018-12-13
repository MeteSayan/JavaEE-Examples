package com.sayfalar;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sayfalar.model.Personel;

@WebServlet("/Anasayfa")
public class Anasayfa extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Anasayfa() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		ServletContext context = this.getServletContext();
		
		ArrayList<Personel> perlist = (ArrayList<Personel>)context.getAttribute("liste");
		
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		
		writer.append("<html>");
		writer.append("<head></head>");
		
		writer.append("<body>");
		
		writer.append("<h1>Servlet sayfasina hosgeldiniz.</h1>");
		
		writer.append("Listedeki Personel Sayimiz : "+perlist.size());
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

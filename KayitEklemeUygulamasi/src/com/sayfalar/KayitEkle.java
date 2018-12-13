package com.sayfalar;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/KayitEkle")
public class KayitEkle extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public KayitEkle() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("errors", false);
		
		RequestDispatcher view = request.getRequestDispatcher("bilgiEkle.jsp");
		
		view.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("Adý : "+request.getParameter("adi"));
		//System.out.println("Soyadý : "+request.getParameter("soyadi"));
		
		request.setAttribute("errors", false);
		
		if(request.getParameter("adi").trim().length() != 0) {
			String adi = request.getParameter("adi");
			System.out.println("Adý : "+adi);
			
		}else {
			request.setAttribute("errors", true);
			request.setAttribute("adi_errors", "Adý alaný boþ geçilemez.");
		}
		
		if(request.getParameter("soyadi").trim() != null) {
			
			String soyadi = request.getParameter("soyadi");
			System.out.println("Soyadý : "+soyadi);
		}else {
			request.setAttribute("errors", true);
			request.setAttribute("soyadi_errors", "Soyadý Alaný boþ geçilemez.");
		}
		
		
		if((Boolean)request.getAttribute("errors")) {
			RequestDispatcher view = request.getRequestDispatcher("bilgiEkle.jsp");
			
			view.forward(request, response);
		}
		
	}

}

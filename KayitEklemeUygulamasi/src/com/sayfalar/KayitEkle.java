package com.sayfalar;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sayfalar.model.Personel;



@WebServlet("/")
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
		
		Personel p = new Personel();
		
		request.setAttribute("errors", false);
		
		if(request.getParameter("adi").trim().length() != 0) {
			String adi = request.getParameter("adi");
			request.setAttribute("adiniz", adi);
			
			p.setAdi(adi);
			
		}else {
			request.setAttribute("errors", true);
			request.setAttribute("adi_errors", "Adý alaný boþ geçilemez.");
		}
		
		if(request.getParameter("soyadi").trim().length() != 0) {
			
			String soyadi = request.getParameter("soyadi");
			request.setAttribute("soyadiniz", soyadi);
			p.setSoyadi(soyadi);
		}else {
			request.setAttribute("errors", true);
			request.setAttribute("soyadi_errors", "Soyadý Alaný boþ geçilemez.");
		}
		
		if(request.getParameter("tc").trim().length() != 0) {
			String tcno = request.getParameter("tc");
			request.setAttribute("tcnumarasi", tcno);
			p.setTcno(tcno);
		}else {
			request.setAttribute("errors", true);
			request.setAttribute("tcno_errors", "TC Numarasý alaný boþ geçilemez.");
		}
		
		if(request.getParameter("okul").trim().length() != 0) {
			String okul = request.getParameter("okul");
			request.setAttribute("okulunuz", okul);
			p.setOkul(okul);
		}else {
			request.setAttribute("errors", true);
			request.setAttribute("okul_errors", "Okul alaný boþ geçilemez.");
		}
		
		if(request.getParameter("yas").trim().length() != 0) {
			String yas = request.getParameter("yas");
			request.setAttribute("yasiniz", yas);
			p.setYas(yas);
		}else {
			request.setAttribute("errors", true);
			request.setAttribute("yas_errors", "Yaþ alaný boþ geçilemez");
		}
		
		if((Boolean)request.getAttribute("errors")) {
			RequestDispatcher view = request.getRequestDispatcher("bilgiEkle.jsp");
			
			view.forward(request, response);
		}else {
			ServletContext scont = getServletContext();
			
			List<Personel> perlist = (ArrayList<Personel>) scont.getAttribute("liste") ;
			
			perlist.add(p);
			
			scont.setAttribute("liste", perlist);
			
			response.sendRedirect("Anasayfa");
		}
		
	}

}

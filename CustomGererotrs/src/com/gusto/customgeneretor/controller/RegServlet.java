package com.gusto.customgeneretor.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.gusto.customgeneretor.bean.CustomBean;

/**
 * Servlet implementation class RegServlet
 */
@WebServlet("/register")
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	SessionFactory sf;
       
@Override
public void init() throws ServletException {
	
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
	
	sf=cfg.buildSessionFactory();
}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		
		CustomBean cb=new CustomBean(null, name, password);
		
		org.hibernate.classic.Session s=sf.openSession();
		
		Transaction t=s.beginTransaction();
		String ac=(String)s.save(cb);
		t.commit();
		s.close();
		response.getWriter().println("Id"+ac);
	}

	private void desto() {
	sf.close();

	}

}

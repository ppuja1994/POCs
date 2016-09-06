package com.test.poc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ValidServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7122916002661022110L;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
		 String s1=req.getParameter("id");
		pw.println("entered:"+s1);
		String s2=req.getParameter("pswd");
		pw.println("entered:"+s2);
		req.setAttribute("userid", s1);
		req.setAttribute("password", s2);
		if(s1.equals("puja")&&s2.equals("123")){
			req.getRequestDispatcher("/jsp/One.jsp").forward(req, resp);
		}
		else{
			req.getRequestDispatcher("/jsp/Two.jsp").forward(req, resp);
		}
		
		//String s1=req.getParameter("id");
		//String s2=req.getParameter("pswd");
		//System.out.println("user id is:"+s1);
		//System.out.println("password is:"+s2);
		//req.setAttribute("userid", s1);
		//req.setAttribute("password", s2);
		//if(s1.equals("puja")&&s2.equals("123")){
			
		//	req.getRequestDispatcher("/jsp/One.jsp").forward(req, resp);
		//}
		//else{
			//req.getRequestDispatcher("/jsp/Two.jsp").forward(req, resp);
		//}
		
			
		
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("get");
	}
}

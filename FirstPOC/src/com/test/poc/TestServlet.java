package com.test.poc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





public class TestServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7474441394621223132L;
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 String s1=req.getParameter("userid");
	 String s2=req.getParameter("password");
	// System.out.println(s1);
	 //System.out.println(s2);
	 req.setAttribute("uid", s1);
	 req.setAttribute("pswd", s2);
	 if(s1.equals("puja")&&s2.equals("urmi")){
	 req.getRequestDispatcher("jsp/Div.jsp").forward(req, resp);
	 }
	 else{
		 req.getRequestDispatcher("jsp/Fwd.jsp").forward(req, resp);
	 }
}@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("get method");
}
}

package com.test.poc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8088784087152666360L;
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 
	System.out.println("post");
}
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String na=req.getParameter("nam");
	String pw=req.getParameter("pswd");
	String id=req.getParameter("userid");
	System.out.println("name is:" +na);
	System.out.println("paswd is" +pw);
	System.out.println("userid is:" +id);
	req.setAttribute("name",na);
	
	req.setAttribute("pswd", pw);
	req.setAttribute("userid", id);
	req.getRequestDispatcher("/jsp/home.jsp").forward(req, resp);
}

}

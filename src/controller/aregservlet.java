package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import beans.AdminBean;
import dao.AdminDao;

/**
 * Servlet implementation class aregservlet
 */
@SuppressWarnings({ "serial", "unused" })
@WebServlet("/aregservlet")
public class aregservlet extends HttpServlet {
	AdminBean ab=new AdminBean();
	AdminDao ad=new AdminDao();
	@SuppressWarnings("static-access")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ab.setAname(request.getParameter("aname"));
		ab.setAemail(request.getParameter("aemail"));
		ab.setAmobile(request.getParameter("amobile"));
		ab.setAaddress(request.getParameter("aaddress"));
		ab.setApass(request.getParameter("apass"));
		ab.setArpass(request.getParameter("arpass"));
		ad.registerAdmin(ab);
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("#.jsp");
		requestDispatcher.forward(request, response);
		
	}
	

}

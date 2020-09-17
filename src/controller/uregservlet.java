package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.UserBean;
import dao.UserDao;

/**
 * Servlet implementation class uregservlet
 */
@SuppressWarnings("serial")
@WebServlet("/uregservlet")
public class uregservlet extends HttpServlet {
	
	UserBean ub=new UserBean();
	UserDao ud=new UserDao();
	@SuppressWarnings("static-access")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ub.setUname(request.getParameter("uname"));
		ub.setUemail(request.getParameter("uemail"));
		ub.setUmobile(request.getParameter("umobile"));
		ub.setUaddress(request.getParameter("uaddress"));
		ub.setUpass(request.getParameter("upass"));
		ub.setUrpass(request.getParameter("urpass"));
		ud.registerUser(ub);
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("#.jsp");
		requestDispatcher.forward(request, response);
		}
		
}

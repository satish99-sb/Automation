package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.ProductBean;
import dao.ProductDao;

/**
 * Servlet implementation class RetrieveAllProduct
 */
@SuppressWarnings("serial")
@WebServlet("/RetrieveAllProduct")
public class RetrieveAllProduct extends HttpServlet {
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String date=request.getParameter("date");
		
		System.out.println(date);
		
		List<ProductBean> list=ProductDao.getAllProducts();
		
		request.setAttribute("List", list); 
	//	RequestDispatcher rd = getServletContext().getRequestDispatcher("/Report.jsp");  
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/reportdate1.jsp");
		rd.forward(request, response);
	}

}

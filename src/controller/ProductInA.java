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
 * Servlet implementation class ProductInA
 */
@WebServlet("/ProductInA")
public class ProductInA extends HttpServlet {
	
	ProductBean proB=new ProductBean();
	ProductDao proDao=new ProductDao();
	int selectedProNo;
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//@SuppressWarnings("unused")
		
		//proB.setProno((int) request.getAttribute("prono"));
		
		proB.setProname(request.getParameter("proname"));
		proB.setProdesc(request.getParameter("prodesc"));
		proB.setDate(request.getParameter("date"));
		proB.setProqty(request.getParameter("proqty"));
		proB.setCustname(request.getParameter("custname"));
		proB.setProprice(request.getParameter("proprice"));
		proDao.productIn(proB);
		
		List<ProductBean> list=ProductDao.getAllProducts();
		request.setAttribute("List", list); 

		
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("/squareautomation.jsp");
		requestDispatcher.forward(request, response);
		
		System.out.println("productNo"+selectedProNo);
		System.out.println("\nproddescrip:"+proB.getProdesc()+"\nproname"+proB.getProname()+"\ndate"+proB.getDate()+"\nqty:"+proB.getProqty());
		System.out.println("customerName:"+proB.getCustname()+"\nproduct Price:"+proB.getProprice());
	}

}

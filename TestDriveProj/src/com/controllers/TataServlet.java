package com.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.beans.Tata;
import com.dao.TataOracle;

@WebServlet("/TataServlet")
public class TataServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public TataServlet() {
		super();
	}
	
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String page = request.getParameter("page");
		
		if("addTestdrive".equals(page)) {
			String cName = request.getParameter("cname");
			int bookId  = Integer.parseInt(request.getParameter("bookingID"));
			String licNo  = request.getParameter("dlc");
			String vehMake  = request.getParameter("vehicle");
			String datePro = request.getParameter("tdate");
			
			Tata tataBean = new Tata();
			tataBean.setBookingID(bookId);
			tataBean.setCustomerName(cName);
			tataBean.setLicenseNo(licNo);
			tataBean.setVehicleMake(vehMake);
			tataBean.setDate(datePro);
			
			
			
			TataOracle tataDao = new TataOracle();
			
			tataDao.makeCustomerBooking(tataBean);
			
			response.sendRedirect("pages/Confirmation.jsp");
			
//			RequestDispatcher reqDispatch = request.getRequestDispatcher("successPage.html");
//			reqDispatch.forward(request, response);
			
		}else if("deleteTestdrive".equals(page)) {
			int bookId  = Integer.parseInt(request.getParameter("bookingID"));
			
			TataOracle tataDao = new TataOracle();
			
			tataDao.cancelBooking(bookId);
			
			response.sendRedirect("pages/cancelConfirm.jsp");
			
		}else if("viewTestdrive".equals(page)) {
			String dateSearch = request.getParameter("bookingdate");
			
			TataOracle tataDao = new TataOracle();
			
			List<Tata> tataList = tataDao.searchBooking(dateSearch);
			request.setAttribute("list1", tataList);
			
			RequestDispatcher reqDispatch = request.getRequestDispatcher("pages/ViewBookings.jsp");
			reqDispatch.forward(request, response);
		
		}
		
	}

	
	
	
	
	
	

}

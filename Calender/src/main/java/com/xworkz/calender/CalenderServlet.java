package com.xworkz.calender;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/gun",loadOnStartup = 3)
public class CalenderServlet extends HttpServlet{
	
	public CalenderServlet() {
		System.out.println("Running the Calender Servlet...");	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("Running the doPost Method...");
		
		String date=req.getParameter("date");
		String day=req.getParameter("day");
		String month=req.getParameter("month");
		String year=req.getParameter("year");
		
		System.out.println("DATE :"+date);
		System.out.println("DAY :"+day);
		System.out.println("MONTH :"+month);
		System.out.println("YEAR :"+year);
		
		
		req.setAttribute("DATE", date);
		req.setAttribute("DAY", day);
		req.setAttribute("MONTH", month);
		req.setAttribute("YEAR", year);
		RequestDispatcher dispatcher=req.getRequestDispatcher("daySuccess.jsp");
		dispatcher.forward(req, resp);
	}
}

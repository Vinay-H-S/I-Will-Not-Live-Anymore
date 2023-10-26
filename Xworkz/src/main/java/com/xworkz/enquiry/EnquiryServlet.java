package com.xworkz.enquiry;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.dto.EnquiryDto;

@WebServlet(urlPatterns = "/work", loadOnStartup = 5)
public class EnquiryServlet extends HttpServlet {

	public EnquiryServlet() {
		System.out.println("Enquiry Servlet is Created");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String phoneNo=req.getParameter("phoneNo");
		String email=req.getParameter("email");
		String dob=req.getParameter("dob");
		String location=req.getParameter("location");
		String password=req.getParameter("password");
		String confirmPassword=req.getParameter("confirmPassword");
		String checkBox=req.getParameter("checkBox");
		
		EnquiryDto dto=new EnquiryDto(name, phoneNo, email, dob, location, password, confirmPassword, checkBox);
		
		req.setAttribute("Xworkz", dto);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("EnquirySucess.jsp");
		dispatcher.forward(req, resp);
	}
}

package com.xworkz.contactt;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.contact.dto.ContactDTO;

@WebServlet(urlPatterns = "/inform",loadOnStartup = 3)
public class ContactServlet extends HttpServlet{

	public ContactServlet() {
	System.out.println("Running the Contact Servlet...");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String userName=req.getParameter("userName");
		String email=req.getParameter("email");
		String mobile=req.getParameter("mobile");
		String comment=req.getParameter("comment");
		
		ContactDTO contactDTO=new ContactDTO(userName, email, mobile, comment);
		
		req.setAttribute("contact", contactDTO);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("ContactSuccess.jsp");
		dispatcher.forward(req, resp);
	}
	
}

package com.assignmentweb.survey;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.assignmentweb.dto.SurveyFormDto;

@WebServlet(urlPatterns = "/assignment", loadOnStartup = 5)
public class SurveyFormServlet extends HttpServlet {

	public SurveyFormServlet() {
		System.out.println("SurveyFormServlet Created..");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		String dob = req.getParameter("dob");
		String country = req.getParameter("country");
		String gender = req.getParameter("gender");
		String profession = req.getParameter("profession");
		String email = req.getParameter("email");
		String mobileNumber = req.getParameter("mobileNumber");
		
		SurveyFormDto formDto=new SurveyFormDto(firstName, lastName, dob, country, gender, profession, email, mobileNumber);
		
		req.setAttribute("customer", formDto);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("SurveyFormSuccess.jsp");
		dispatcher.forward(req, resp);
		
	}

}

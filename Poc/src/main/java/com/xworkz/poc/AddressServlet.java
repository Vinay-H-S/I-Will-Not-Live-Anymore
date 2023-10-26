package com.xworkz.poc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.dto.AddressDto;
import com.xworkz.dto.LoginDto;

@WebServlet(urlPatterns = "/address" + "", loadOnStartup = 3)
public class AddressServlet extends HttpServlet {

	public AddressServlet() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String admin=req.getParameter("userId");
		String secret=req.getParameter("password");
		String no = req.getParameter("no");
		String street = req.getParameter("street");
		String city = req.getParameter("city");
		String state = req.getParameter("state");
		String country = req.getParameter("country");
		
		AddressDto dto = new AddressDto(no, street, city, state, country);

		req.setAttribute("address", dto);

		req.setAttribute("Msg", "Address Sent Successfully..");

		RequestDispatcher dispatcher = req.getRequestDispatcher("Address.jsp");
		dispatcher.forward(req, resp);

	}
}

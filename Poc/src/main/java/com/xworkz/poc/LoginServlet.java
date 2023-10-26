package com.xworkz.poc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.dto.AddressDto;
import com.xworkz.dto.LoginDto;

@WebServlet(urlPatterns = "/access", loadOnStartup = 3)
public class LoginServlet extends HttpServlet {

	public LoginServlet() {
		System.out.println("Created the Login Servlet...");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String admin = req.getParameter("userId");
		String secret = req.getParameter("password");
		
		LoginDto dto=new LoginDto(admin, secret);
		

		if (admin.equals("admin") && secret.equals("secret")) {
			
			req.setAttribute("login", dto);

			RequestDispatcher dispatcher = req.getRequestDispatcher("LoginSuccess.jsp");
			dispatcher.forward(req, resp);

		} else {
			req.setAttribute("errorMsg", "Credential is not matching.");

			RequestDispatcher dispatcher = req.getRequestDispatcher("Login.jsp");
			dispatcher.forward(req, resp);
		}

	}

}

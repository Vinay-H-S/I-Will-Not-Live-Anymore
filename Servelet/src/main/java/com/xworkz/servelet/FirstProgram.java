package com.xworkz.servelet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/run",loadOnStartup = 10)
public class FirstProgram extends HttpServlet{
	
	public FirstProgram() {
		System.out.println("Running the FirstProgram...");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("Running Service..");
		String name=req.getParameter("username");
		String pass=req.getParameter("password");
		String mail=req.getParameter("email");
		
		System.out.println("UserName "+name);
		System.out.println("Password "+pass);
		System.out.println("Email "+mail);
	}
	
}

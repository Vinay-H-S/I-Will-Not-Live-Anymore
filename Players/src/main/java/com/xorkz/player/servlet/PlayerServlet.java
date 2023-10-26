package com.xorkz.player.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/game",loadOnStartup = 30)
public class PlayerServlet extends HttpServlet{

	public PlayerServlet() {
		System.out.println("Running main in PlayerServlet....");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		System.out.println("Running main in Service...");
		System.out.println("HTTP METHOD :"+req.getMethod());
		System.out.println("URL :"+req.getRequestURI());
		
		System.out.println("\n");
		
		String name=req.getParameter("player");
		String sport=req.getParameter("sport");
		String place=req.getParameter("place");
		String exp=req.getParameter("exp");
		
		System.out.println("Player Name :"+name);
		System.out.println("Sports :"+sport);
		System.out.println("Place :"+place);
		System.out.println("Experience :"+exp);
		
		resp.setContentType("text/plain");
		
	
		
		
	}
}

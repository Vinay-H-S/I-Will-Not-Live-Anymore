package com.xworkz.police;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/danger",loadOnStartup = 100)
public class PoliceStationServlet extends HttpServlet{

	public PoliceStationServlet() {
		System.out.println("Running Police Station...");
}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running Service....");
		
		String uri=req.getRequestURI();
		String url=req.getRequestURL().toString();
		
		System.out.println("URI :"+uri);
		System.out.println("URL :"+url);
		
		String name=req.getParameter("stationName");
		String hc=req.getParameter("HC");
		String loc=req.getParameter("location");
		String ac=req.getParameter("AC");
		String insName=req.getParameter("inspectorName");
		String cells=req.getParameter("cells");
		String si=req.getParameter("SI");
		String pendingCase=req.getParameter("pendingCase");
		String painted=req.getParameter("painted");
		
		int cases=Integer.parseInt(pendingCase);
		int cell=Integer.parseInt(cells);
		boolean paint=Boolean.parseBoolean(painted);
		
		
		System.out.println("Station Name :"+name);
		System.out.println("Head Constable :"+hc);
		System.out.println("Location :"+loc);
		System.out.println("Assistant Commissioner :"+ac);
		System.out.println("Inspector Name :"+insName);
		System.out.println("No Of Cells :"+cells);
		System.out.println("Sub Inspector Name:"+si);
		System.out.println("No Of Case Pending :"+pendingCase);
		System.out.println("Station is Painted :"+painted);
		
		resp.setContentType("text/html");
		
		PrintWriter writer=resp.getWriter();
		writer.print("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"utf-8\">\r\n"
				+ "<meta class=\"viewport\" content=\"width=device-width,initial-scale=1\">\r\n"
				+ "<title>Default-Page</title>\r\n"
				+ "<style>\r\n"
				+ "*{\r\n"
				+ "text-decoration: none;\r\n"
				+ "}\r\n"
				+ ".navbar{\r\n"
				+ "background-color: black; padding-left: 15px; padding-right: 15px; font-family: sans-serief;;\r\n"
				+ "}\r\n"
				+ ".navdiv{\r\n"
				+ "display: flex; align-items: center; justify-content: space-between;\r\n"
				+ "}\r\n"
				+ ".logo{\r\n"
				+ "color: white; font-size: 25px;\r\n"
				+ "}\r\n"
				+ "li{\r\n"
				+ "display: inline-block;\r\n"
				+ "}\r\n"
				+ "li a{\r\n"
				+ "color: blue; margin-left: 10px; font-size: 19px;\r\n"
				+ "}\r\n"
				+ "</style>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "\r\n"
				+ "<nav class=\"navbar\">\r\n"
				+ "<div class=\"navdiv\"> \r\n"
				+ "<div class=\"logo\">KARNATAKA</div>\r\n"
				+ "	<ul>\r\n"
				+ "		<li> <a href=\"index.html\">HOME</a></li>\r\n"
				+ "      <li> <a href=\"policestation.html\">POLICE</a></li>\r\n"
				+ "	</ul>\r\n"
				+ "</div>\r\n"
				+ "\r\n"
				+ "</nav>\r\n"
				+ "<h2>Station Data is Saved Successfully</h2>"
				+ "</body>\r\n"
				+ "</html>");
		
		writer.println("<br>Station Name :"+name);
		writer.println("<br>Location :"+loc);
		writer.println("<br>Assistant Commissioner :"+ac);
		writer.println("<br>Inspector Name :"+insName);
		writer.println("<br>No Of Cells :"+cells);
		writer.println("<br>Head Constable :"+hc);
		writer.println("<br>Sub Inspector Name:"+si);
		writer.println("<br>No Of Case Pending :"+pendingCase);
		writer.println("<br>Station is Painted :"+painted);
		
		if(cases>100)
		{
			writer.print("<br><span style='color:red;'><h3>Too many cases is pending</h3>");
		}
		else
		{
			writer.print("<br><span style='color:green;'><h3>Less cases</h3>");
		}
		
		if(cell>5)
		{
			writer.print("<br><span style='color:green;'><h3>Big Station</h3>");
		}
		else
		{
			writer.print("<br><span style='color:red;'><h3>Small Station</h3>");
		}
		
		if(paint!=false)
		{
			writer.print("<br><span style='color:green;'><h3>Clean Station</h3>");
		}
		else
		{
			writer.print("<br><span style='color:red;'><h3>Dirty Station</h3>");
		}
	}
}

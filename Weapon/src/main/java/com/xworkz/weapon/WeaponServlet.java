package com.xworkz.weapon;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/gun",loadOnStartup = 5)
public class WeaponServlet extends HttpServlet{

	public WeaponServlet() {
		System.out.println("Running the Weapon Servlet");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running the Service..");
		
		String name=req.getParameter("name");
		String madeBy=req.getParameter("madeby");
		String price=req.getParameter("price");
		String type=req.getParameter("type");
		
		System.out.println("Name :"+name);
		System.out.println("Made By :"+madeBy);
		System.out.println("Price :"+price);
		System.out.println("Type :"+type);
		
		resp.setContentType("text/html");
		
		PrintWriter writer=resp.getWriter();
		writer.print("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>Insert title here</title>\r\n"
				+ "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" \r\n"
				+ "rel=\"stylesheet\" \r\n"
				+ "integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" \r\n"
				+ "crossorigin=\"anonymous\">\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "<div>\r\n"
				+ "<nav class=\"navbar navbar-expand-lg navbar navbar-dark bg-dark\">\r\n"
				+ "  <div class=\"container-fluid\" >\r\n"
				+ "    <a class=\"navbar-brand\"  style=\"color: red; font-size: 30px; \" href=\"#\">DANGER</a>\r\n"
				+ "    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n"
				+ "      <span class=\"navbar-toggler-icon\"></span>\r\n"
				+ "    </button>\r\n"
				+ "    <div class=\"d-flex\" style=\"font-size: 20px;text-transform: uppercase; padding-right: 25px;\">\r\n"
				+ "      <form >\r\n"
				+ "        <a href=\"index.html\">home</a>\r\n"
				+ "        <a href=\"weaponPage.html\">weapon</a>\r\n"
				+ "      </form>\r\n"
				+ "    </div>\r\n"
				+ "    \r\n"
				+ "    </div>\r\n"
				+ "  </div>\r\n"
				+ "</nav>\r\n"
				+ "</div>"
				+ "</body>\r\n"
				+ "</html>");
		
		writer.print("<br> <h2>Type :"+type);
		writer.print("<br> <h2>Name :"+name);
		writer.print("<br> <h2>Made By :"+madeBy);
		writer.print("<br> <h2>Price :"+price);

		
	}
	
}

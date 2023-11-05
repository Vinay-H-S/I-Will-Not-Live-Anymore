package com.xworkz.app;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.dto.ProductDTO;

@WebServlet(urlPatterns = "/items", loadOnStartup = 3)
public class ProductServlet extends HttpServlet {

	public ProductServlet() {

		System.out.println("Running the Product Servlet");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String productName = req.getParameter("productName");
		String price = req.getParameter("price");
		String discount = req.getParameter("discount");
		
		ProductDTO dto=new ProductDTO(productName, price, discount);
		
		int convertedPrice = Integer.parseInt(price);
		int convertedDiscount = Integer.parseInt(discount);
		int total=convertedPrice;
		double fullOffer=(total* (1 - (convertedDiscount / 100.0)));

		req.setAttribute("offer", fullOffer);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("Index.jsp");
		dispatcher.forward(req, resp);

	}

	
}
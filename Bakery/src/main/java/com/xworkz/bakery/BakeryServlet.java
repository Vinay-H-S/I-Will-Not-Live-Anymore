package com.xworkz.bakery;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.dto.BakeryDto;

@WebServlet(urlPatterns = "/baker", loadOnStartup = 7)
public class BakeryServlet extends HttpServlet {

	public BakeryServlet() {
		System.out.println("Created Bakery Servlet..");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String itemName = req.getParameter("itemName");
		String itemPrice = req.getParameter("itemPrice");
		String quantity = req.getParameter("quantity");
		String discount = req.getParameter("discount");
		String gst = req.getParameter("gst");
		String manfDate = req.getParameter("manfDate");
		String expDate = req.getParameter("expDate");

		BakeryDto dto = new BakeryDto(itemName, itemPrice, quantity, discount, gst, manfDate, expDate);

		double convertedItemPrice = Double.parseDouble(itemPrice);
		int convertedQuantity = Integer.parseInt(quantity);
		int convertedDiscount = Integer.parseInt(discount);
		double total = convertedItemPrice * convertedQuantity;
		double fullOffer=(total* (1 - (convertedDiscount / 100.0)));

		req.setAttribute("bakery", dto);
		req.setAttribute("item", total);
		req.setAttribute("offer", fullOffer);
		
	

		RequestDispatcher dispatcher = req.getRequestDispatcher("BakerySuccess.jsp");
		dispatcher.forward(req, resp);

	}

}

package com.xworkz.product;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.dto.ProductDto;

@WebServlet(urlPatterns = "/store", loadOnStartup = 3)
public class ProductServlet extends HttpServlet {

	public ProductServlet() {
		System.out.println("Created Product Servlet..");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		String type = req.getParameter("type");
		String price = req.getParameter("price");
		String brand = req.getParameter("brand");
		String quantity = req.getParameter("quantity");
		String description = req.getParameter("description");

		ProductDto dto = new ProductDto(name, type, price, brand, quantity, description);

		int convertedPrice = Integer.parseInt(price);
		int convertedQuantity = Integer.parseInt(quantity);
		int c = convertedPrice * convertedQuantity;
		if (convertedPrice <= 0) {
			req.setAttribute("errorMsg", "Price is Mandatory");

			RequestDispatcher dispatcher = req.getRequestDispatcher("Product.jsp");
			dispatcher.forward(req, resp);

		} else {
			req.setAttribute("msg", dto);

			req.setAttribute("total", c);

			RequestDispatcher dispatcher = req.getRequestDispatcher("ProductSuccess.jsp");
			dispatcher.forward(req, resp);
		}

	}
}

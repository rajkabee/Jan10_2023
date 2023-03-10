package servlets;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieServlet
 */
@WebServlet("/cookies")
public class CookieServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String product = "";
		Cookie cookie = new Cookie("products", product);
		cookie.setMaxAge(10);
		response.addCookie(cookie);
		request.getRequestDispatcher("cookies.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();
		int flag = 0;
		for (Cookie cookie : cookies) {
			if (cookie.getName().equalsIgnoreCase("products")) {
				String newProducts = cookie.getValue() + "+" + request.getParameter("product");
				cookie.setValue(newProducts);
				cookie.setMaxAge(10);
				//response.getWriter().write(newProducts);
				response.addCookie(cookie);
				flag = 1;
			}

		}
		if (flag == 0) {
			Cookie coo = new Cookie("products", "apples");
			response.addCookie(coo);

		}

		request.getRequestDispatcher("cookies.jsp").forward(request, response);
	}

}

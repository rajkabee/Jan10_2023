package servlets;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet({ "/SessionServlet", "/sessions" })
public class SessionServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if(session.isNew()) {
			ArrayList<String> toDoList = new ArrayList<String>();
			toDoList.add(request.getParameter("item"));
			session.setAttribute("toDoList", toDoList);
			request.setAttribute("toDoList", toDoList);
			//response.getWriter().write(toDoList.toString());
		}
		else {
			ArrayList<String> toDoList =  (ArrayList<String>) session.getAttribute("toDoList");
			toDoList.add(request.getParameter("item"));
			//response.getWriter().write(toDoList.toString());
			request.setAttribute("toDoList", toDoList);
			session.setMaxInactiveInterval(10);
		}
		request.getRequestDispatcher("session.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}

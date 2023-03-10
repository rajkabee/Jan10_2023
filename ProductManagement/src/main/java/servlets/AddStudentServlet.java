package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Student;
import model.StudentDao;

import java.io.IOException;
import java.sql.SQLException;
@WebServlet("/addStudent")
public class AddStudentServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("newStudent.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Student st = new Student();
		st.setName(request.getParameter("name"));
		st.setEmail(request.getParameter("email"));
		st.setActive(request.getParameter("active").equalsIgnoreCase("true")?true:false);
		StudentDao sDao = new StudentDao();
		try {
			sDao.save(st);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("students");
	}

}

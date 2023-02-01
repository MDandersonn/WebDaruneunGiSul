package sec04.ex01;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/loginTest")
public class LoginTest extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id =req.getParameter("id");
		String password =req.getParameter("password");
		
		req.setAttribute("id", id);
		req.setAttribute("password", password);
		req.getRequestDispatcher("view/LoginTest4.jsp").forward(req, resp);
		System.out.println("수행");
		

	}

}

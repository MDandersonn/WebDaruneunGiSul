package model.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.dto.MemberDTO;
import model.service.MemberService;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session =req.getSession();
		if(session.getAttribute("isLogin")==null) {
			Cookie[] allValues= req.getCookies();
			for(Cookie s : allValues) {
				if(s.getName().equals("id")) {
					req.setAttribute("id" ,s.getValue() );
				}
			}
			req.getRequestDispatcher( "./view/Login.jsp").forward(req, resp);
		
		}else {
			resp.sendRedirect("./");
		}
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id= req.getParameter("id");
		String pwd= req.getParameter("pwd");
		String remember= req.getParameter("remember");//켜져있으면on 꺼져있으면 null
		MemberDTO dtoId= new MemberDTO();
		dtoId.setId(id);
		MemberService service= new MemberService();
		MemberDTO dto= service.selectById(dtoId);
		
		
		if(dto!=null) {//아디가 맞았을때
			if(pwd.equals(dto.getPwd()) ) {// 아디, 비번이 맞았을때	
				Cookie c= new Cookie("id",id);
				if(remember!=null && remember.equals("on")) {
					c.setMaxAge(24*60*60);
				}else {
					c.setMaxAge(0);
				}
				
				resp.addCookie(c);
				HttpSession session = req.getSession();
				session.setAttribute("isLogin", true);
				session.setAttribute("login", dto);
				req.getRequestDispatcher("./index.jsp").forward(req, resp);
			}
		}
		String msg="아이디 혹은 비밀번호를 확인해주세요.";
		req.setAttribute("msg", msg);
		req.getRequestDispatcher("./view/Login.jsp").forward(req, resp);

	
		
		
		
	}

}

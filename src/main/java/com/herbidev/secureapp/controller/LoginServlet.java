package com.herbidev.secureapp.controller;

import java.io.IOException;
import java.util.Optional;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.herbidev.secureapp.dto.UserDto;
import com.herbidev.secureapp.service.IUserService;
import com.herbidev.secureapp.service.UserService;

@WebServlet(name = "login", value = "/login")
public class LoginServlet extends HttpServlet{
	
	private Logger log = LoggerFactory.getLogger(LoginServlet.class);
	private IUserService userService = new UserService();
	@Override
	public void init(ServletConfig config) throws ServletException {
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		log.info("L'email envoyé est {}", email);
		try {
		Optional<UserDto> user = userService.login(email, password);
		if (user.isPresent()) {
			req.getSession().setAttribute("username", email);
			resp.sendRedirect("welcome");
		}else {
			resp.sendRedirect("login");

		}
		}catch (Exception e){
			log.error("erreur", e);
			resp.sendRedirect("login");

		}
		
	}

}

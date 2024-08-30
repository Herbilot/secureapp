package com.herbidev.secureapp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.herbidev.secureapp.dao.UserDao;
import com.herbidev.secureapp.dto.UserDto;
import com.herbidev.secureapp.service.IUserService;
import com.herbidev.secureapp.service.UserService;

@WebServlet(name = "signup", value = "/signup")
public class SingUpServlet extends HttpServlet {

	private IUserService userService = new UserService();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("WEB-INF/jsp/users/signup.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String firstName =req.getParameter("firstName");
		String lastName =req.getParameter("lastName");
		String email =req.getParameter("email");
		String password =req.getParameter("password");
		
		UserDto userDto = new UserDto(0, firstName, lastName, email, password);
		
		userService.save(userDto);
		
		doGet(req, resp);
	}
}

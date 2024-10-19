package vn.zelecshop.controllers;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.zelecshop.entity.Account;
import vn.zelecshop.services.IAccountService;
import vn.zelecshop.services.impl.AccountServiceImpl;

@WebServlet(urlPatterns = { "/signup" })
public class SignupController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	IAccountService accServ = new AccountServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/views/signup.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// encoding
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html");

		// get attribute from view
		String userid = req.getParameter("userid");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String confirmpass = req.getParameter("c-password");
		String alert = "";

		// process
		if (userid.isEmpty() || password.isEmpty() || password.isEmpty()
				|| confirmpass.isEmpty()) {
			alert = "Please fill out the given fields";
			req.setAttribute("alert", alert);
			// req.getRequestDispatcher("/views/login.jsp").forward(req, resp);
		}

		if (!confirmpass.equals(password)) {
			alert = "Confirm password does not match the password. Try again";
			req.setAttribute("alert", alert);
		}

		if (accServ.isExist(userid)) {
			alert = "This account is already exist. Try another username or Login";
			req.setAttribute("alert", alert);
		}
		
		Account acc = new Account(userid, password, null, null, null, email, null, null, false, 2);
		boolean signup_done = accServ.signup(acc);
		if (signup_done) {
			alert = "Sign up successfully. Please log in into your account";
			req.setAttribute("alert", alert);
			req.getRequestDispatcher("/login").forward(req, resp);
		} else {
			alert = "Something went wrong. Try again";
			req.setAttribute("alert", alert);
		}
	}
}
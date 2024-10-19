package vn.zelecshop.controllers;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import vn.zelecshop.entity.Account;

@WebServlet(urlPatterns = {"/waiting"})
public class WaitingController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session= req.getSession();
		if(session != null && session.getAttribute("account") != null) {
			Account u = (Account)session.getAttribute("account");
			req.setAttribute("username", u.getName());
		if(u.getRoleId() == Integer.parseInt("1")) {
			resp.sendRedirect(req.getContextPath()+"/admin/home");
		}else if(u.getRoleId() == Integer.parseInt("2")){
			resp.sendRedirect(req.getContextPath()+"/user/home");
		}else {
			resp.sendRedirect(req.getContextPath()+"/home");
			}
		}else {
			resp.sendRedirect(req.getContextPath()+"/login");
		}
	}
}
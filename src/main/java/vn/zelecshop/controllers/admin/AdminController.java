package vn.zelecshop.controllers.admin;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import vn.zelecshop.entity.Account;

@WebServlet(urlPatterns = { "/admin/home", "/admin"})
public class AdminController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		if (session != null && session.getAttribute("account") != null) {
//			String name = (String)session.getAttribute("name");
//			req.setAttribute("name", name);
			Account u = (Account) session.getAttribute("account");
			req.setAttribute("username", u.getUserid());
			req.setAttribute("password", u.getPassword());
			req.setAttribute("email", u.getEmail());
			req.setAttribute("name", u.getName());
			req.setAttribute("phone", u.getPhonenum());
		}
		req.getRequestDispatcher("/views/admin/home.jsp").forward(req, resp);
	}
}
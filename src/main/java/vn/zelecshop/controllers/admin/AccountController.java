package vn.zelecshop.controllers.admin;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.zelecshop.entity.Account;
import vn.zelecshop.services.IAccountService;
import vn.zelecshop.services.impl.AccountServiceImpl;

@WebServlet(urlPatterns = {"/admin/accounts", "/admin/account/delete", 
		"/admin/account/setDeactive", "/admin/account/setActive"})
public class AccountController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	IAccountService accServ = new AccountServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url = req.getRequestURI();
		if(url.contains("accounts")) {
			List<Account> listacc = accServ.selectAll();
			req.setAttribute("accounts", listacc);
			req.getRequestDispatcher("/views/admin/accounts.jsp").forward(req, resp);
		}
	}
}

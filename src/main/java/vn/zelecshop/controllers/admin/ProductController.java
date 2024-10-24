package vn.zelecshop.controllers.admin;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.zelecshop.services.IProductService;
import vn.zelecshop.services.impl.ProductServiceImpl;

@WebServlet(urlPatterns = {"/admin/products", "/admin/product/edit", "/admin/product/add", "/admin/product/delete"})
public class ProductController extends HttpServlet{

	IProductService pServ = new ProductServiceImpl();
	
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url = req.getContextPath();
		if (url.contains("admin/products")) {
			
		}
	}
}

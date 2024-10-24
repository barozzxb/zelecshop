package vn.zelecshop.controllers.admin;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.jsp.PageContext;
import vn.zelecshop.entity.Genre;
import vn.zelecshop.entity.Product;
import vn.zelecshop.services.IGenreService;
import vn.zelecshop.services.IProductService;
import vn.zelecshop.services.impl.GenreServiceImpl;
import vn.zelecshop.services.impl.ProductServiceImpl;

@WebServlet(urlPatterns = {"/admin/products", "/admin/product/edit", "/admin/product/add", "/admin/product/delete"})
public class ProductController extends HttpServlet{

	IProductService pServ = new ProductServiceImpl();
	IGenreService gServ = new GenreServiceImpl();
	
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url = req.getRequestURI();
		if (url.contains("/products")) {
			List<Product> listprod = pServ.findAll();
			req.setAttribute("listprod", listprod);
			req.getRequestDispatcher("/views/admin/product/products.jsp").forward(req, resp);
		}
		if (url.contains("admin/product/add")) {
			List<Genre> genres = gServ.findAll();
			req.setAttribute("listgenre", genres);
			req.getRequestDispatcher("/views/admin/product/product-add.jsp").forward(req, resp);
		}
		if (url.contains("admin/product/edit")) {
			String pid = req.getParameter("pid");
			Product p = pServ.findById(pid);
			req.setAttribute("prod", p);
			req.getRequestDispatcher("/views/admin/product/product-edit.jsp").forward(req, resp);
		} else {
			String pid = req.getParameter("pid");
//			if (pServ.delete(pid)) {
//				resp.sendRedirect(req.getContextPath() + "/admin/genre/genres");
//			}
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html");
		
		
		String url = req.getRequestURI();
		if (url.contains("admin/product/add")) {
			String pid = req.getParameter("pid");
			String pname = req.getParameter("pname");
			int pquantity = Integer.parseInt(req.getParameter("pquantity"));
			int pprice = Integer.parseInt(req.getParameter("pprice"));
			String pinfo = req.getParameter("pinfo");
			String pmanufacturer = req.getParameter("pmanufacturer");
			String pgenre = req.getParameter("pgenre");
			
			Product prod = new Product();
			prod.setGid(pgenre);
			prod.setPid(pid);
			prod.setPinfo(pinfo);
			prod.setPmanufacturer(pmanufacturer);
			prod.setPname(pname);
			prod.setPprice(pprice);
			prod.setPquantity(pquantity);
			
			if(pServ.insert(prod)) {
				req.getRequestDispatcher("/admin/products").forward(req, resp);
			}
			
		}
		if (url.contains("admin/product/edit")) {
			
		}
	}
}

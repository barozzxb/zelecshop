package vn.zelecshop.controllers.admin;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Paths;
import java.util.List;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jakarta.servlet.http.Part;
import vn.zelecshop.entity.Product;
import vn.zelecshop.services.IProductService;
import vn.zelecshop.services.impl.ProductServiceImpl;
import vn.zelecshop.util.Constant;

@WebServlet(urlPatterns = { "/admin/products", "/admin/product/add", "/admin/product/insert", "/admin/product/edit",
		"/admin/product/update", "/admin/product/delete", "/admin/product/search" })
public class ProductController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	public IProductService proService = new ProductServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		String url = req.getRequestURI();

		if (url.contains("products")) {
			List<Product> list = proService.findAll();
			req.setAttribute("listcate", list);
			req.getRequestDispatcher("/views/admin/product-list.jsp").forward(req, resp);

	

		} else if (url.contains("search")) {
			String search = req.getParameter("search");
			if (search != null && !search.strip().isEmpty()) {
				List<Product> list = proService.findByName(search);
				req.setAttribute("listcate", list);
				req.getRequestDispatcher("/views/admin/product-list.jsp").forward(req, resp);
				return;
			}
			List<Product> list = proService.findAll();
			req.setAttribute("listcate", list);
			req.getRequestDispatcher("/views/admin/product-list.jsp").forward(req, resp);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url = req.getRequestURI();
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");

		if (url.contains("insert")) {
			Product product = new Product();
			String productName = req.getParameter("productName");
			String ProductQuantity = req.getParameter("ProductQuantity");
			String ProductPrice = req.getParameter("ProductPrice");
			String ProductInfo = req.getParameter("ProductInfo");
			String PManufacture = req.getParameter("PManufacture");
			String PRating = req.getParameter("PRating");

			int ProductQuantityInt = Integer.parseInt(ProductQuantity);
			int PRatingInt = Integer.parseInt(PRating);
			BigDecimal ProductPriceDecimal = new BigDecimal(ProductPrice);

			product.setProductName(productName);
			product.setProductQuantity(ProductQuantityInt);
			product.setProductPrice(ProductPriceDecimal);
			product.setProductInfo(ProductInfo);
			product.setPManufacture(PManufacture);
			product.setPRating(PRatingInt);

			// Xử lý file ảnh
			String fname = "";
			String uploadPath = Constant.UPLOAD_DIRECTORY;
			File uploadDir = new File(uploadPath);
			if (!uploadDir.exists()) {
				uploadDir.mkdir();
			}
			try {
				Part part = req.getPart("productPicture1");
				if (part.getSize() > 0) {
					String filename = Paths.get(part.getSubmittedFileName()).getFileName().toString();
					int index = filename.lastIndexOf(".");
					String ext = filename.substring(index + 1);
					fname = System.currentTimeMillis() + "." + ext;
					part.write(uploadPath + "/" + fname);
					product.setProductPicture(fname);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

			proService.insert(product);
			resp.sendRedirect(req.getContextPath() + "/admin/products");

		} else if (url.contains("update")) {
			int productId = Integer.parseInt(req.getParameter("productid"));
			String productName = req.getParameter("productName");
			String ProductQuantity = req.getParameter("ProductQuantity");
			String ProductPrice = req.getParameter("ProductPrice");
			String ProductInfo = req.getParameter("ProductInfo");
			String PManufacture = req.getParameter("PManufacture");
			String PRating = req.getParameter("PRating");

			int ProductQuantityInt = Integer.parseInt(ProductQuantity);
			int PRatingInt = Integer.parseInt(PRating);
			BigDecimal ProductPriceDecimal = new BigDecimal(ProductPrice);

			Product product = proService.findById(productId);
			
			product.setProductName(productName);
			product.setProductQuantity(ProductQuantityInt);
			product.setProductPrice(ProductPriceDecimal);
			product.setProductInfo(ProductInfo);
			product.setPManufacture(PManufacture);
			product.setPRating(PRatingInt);

			// Xử lý hình ảnh
			String fname = "";
			String uploadPath = Constant.UPLOAD_DIRECTORY;
			File uploadDir = new File(uploadPath);
			if (!uploadDir.exists()) {
				uploadDir.mkdir();
			}
			try {
				Part part = req.getPart("ProductPicture");
				if (part.getSize() > 0) {
					String filename = Paths.get(part.getSubmittedFileName()).getFileName().toString();
					int index = filename.lastIndexOf(".");
					String ext = filename.substring(index + 1);
					fname = System.currentTimeMillis() + "." + ext;
					part.write(uploadPath + "/" + fname);
					product.setProductPicture(fname);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

			proService.update(product);
			resp.sendRedirect(req.getContextPath() + "/admin/products");
		}
	}
}

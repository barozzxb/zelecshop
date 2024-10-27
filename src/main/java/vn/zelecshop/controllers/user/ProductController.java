package vn.zelecshop.controllers.user;

import java.io.IOException;
import java.util.List;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.zelecshop.entity.Product;
import vn.zelecshop.services.IProductService;
import vn.zelecshop.services.impl.ProductServiceImpl;

@WebServlet(urlPatterns = { "/user/products", "/user/product/detail", "/user/product/search" })
public class ProductController extends HttpServlet {

    private static final long serialVersionUID = 1L;
    public IProductService proService = new ProductServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        String url = req.getRequestURI();

        // Xem danh sách sản phẩm
        if (url.contains("products")) {
            List<Product> list = proService.findAll();
            req.setAttribute("listcate", list);
            req.getRequestDispatcher("/views/user/product-list.jsp").forward(req, resp);

        // Xem chi tiết sản phẩm
        } else if (url.contains("detail")) {
            String productIdStr = req.getParameter("productid");
            if (productIdStr != null && !productIdStr.isEmpty()) {
                int productId = Integer.parseInt(productIdStr);
                Product product = proService.findById(productId);
                req.setAttribute("product", product);
                req.getRequestDispatcher("/views/user/product-detail.jsp").forward(req, resp);
            } else {
                resp.sendRedirect(req.getContextPath() + "/user/products");
            }

        // Tìm kiếm sản phẩm
        } else if (url.contains("search")) {
            String search = req.getParameter("search");
            List<Product> list;
            if (search != null && !search.strip().isEmpty()) {
                list = proService.findByName(search);
            } else {
                list = proService.findAll();
            }
            req.setAttribute("listcate", list);
            req.getRequestDispatcher("/views/user/product-list.jsp").forward(req, resp);
        }
    }
}

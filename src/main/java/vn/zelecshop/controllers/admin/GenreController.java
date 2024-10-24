package vn.zelecshop.controllers.admin;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import vn.zelecshop.entity.Genre;
import vn.zelecshop.services.IGenreService;
import vn.zelecshop.services.impl.GenreServiceImpl;

@WebServlet(urlPatterns = {"/admin/genres", "/admin/genre/add", "/admin/genre/edit", "/admin/genre/info", "/admin/genre/delete"})
public class GenreController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	IGenreService genreServ = new GenreServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url = req.getRequestURI();
		if (url.contains("/genres")) {
			List<Genre> listgenre = genreServ.findAll();
			req.setAttribute("listgenre", listgenre);
			req.getRequestDispatcher("/views/admin/genre/genres.jsp").forward(req, resp);
		}else if(url.contains("/genre/add")) {
			req.getRequestDispatcher("/views/admin/genre/genre-add.jsp").forward(req, resp);
		}else if (url.contains("edit")) {
			String gid = req.getParameter("gid");
			Genre genre = genreServ.findById(gid);
			req.setAttribute("genre", genre);
			req.getRequestDispatcher("/views/admin/genre/genre-edit.jsp").forward(req, resp);
		}else if (url.contains("delete")) {
			String gid = req.getParameter("gid");
			if (genreServ.delete(gid)) {
				resp.sendRedirect(req.getContextPath() + "/admin/genre/genres");
			}
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html");
		
		String url = req.getRequestURI();
		if(url.contains("/genre/add")) {
			String gid = req.getParameter("gid");
			String gname = req.getParameter("gname");
			String gdescription = req.getParameter("gdescription");
			
			Genre genre = new Genre(gid, gname, gdescription);
			if(genreServ.insert(genre)) {
				req.getRequestDispatcher("/admin/genres").forward(req, resp);
			}else {
				return;
			}
			
		}else if (url.contains("edit")) {
			String gid = req.getParameter("gid");
			String gname = req.getParameter("gname");
			String gdescription = req.getParameter("gdescription");
			
			Genre genre = new Genre(gid, gname, gdescription);
			if(genreServ.update(genre)) {
				req.getRequestDispatcher("/admin/genres").forward(req, resp);
			}else {
				return;
			}
		}
	}
}

package vn.zelecshop.controllers;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.zelecshop.entity.Genre;
import vn.zelecshop.services.IGenreService;
import vn.zelecshop.services.impl.GenreServiceImpl;

@WebServlet(urlPatterns= {"/home"})
public class HomeController extends HttpServlet{
	
	IGenreService genreServ = new GenreServiceImpl();
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Genre> genres = genreServ.findAll();
		req.setAttribute("genres", genres);
		req.getRequestDispatcher("/views/guest/home.jsp").forward(req, resp);
	}
}
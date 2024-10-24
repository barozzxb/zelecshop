package vn.zelecshop.services.impl;

import java.util.List;

import vn.zelecshop.dao.IGenreDAO;
import vn.zelecshop.dao.impl.GenreDAOImpl;
import vn.zelecshop.entity.Genre;
import vn.zelecshop.services.IGenreService;

public class GenreServiceImpl implements IGenreService{

	IGenreDAO genreDAO = new GenreDAOImpl();
	@Override
	public List<Genre> findAll() {
		return genreDAO.findAll();
	}

	@Override
	public Genre findById(String gid) {
		return genreDAO.findById(gid);
	}

	@Override
	public Genre findByName(String gname) {
		return genreDAO.findByName(gname);
	}

	@Override
	public boolean insert(Genre genre) {
		if(genreDAO.findById(genre.getGid()) != null) {
			return false;
		}
		try {
			genreDAO.insert(genre);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public boolean update(Genre genre) {
		try {
			genreDAO.update(genre);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean delete(String gid) {
		try {
			genreDAO.delete(gid);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public int countProducts(String gid) {
		return 0;
	}

}

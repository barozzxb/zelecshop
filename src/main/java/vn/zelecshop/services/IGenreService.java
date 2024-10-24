package vn.zelecshop.services;

import java.util.List;

import vn.zelecshop.entity.Genre;

public interface IGenreService {
	List<Genre> findAll();
	
	Genre findById(String gid);
	
	Genre findByName(String gname);
	
	boolean insert(Genre genre);
	
	boolean update(Genre genre);
	
	boolean delete(String gid);
	
	int countProducts(String gid);
}

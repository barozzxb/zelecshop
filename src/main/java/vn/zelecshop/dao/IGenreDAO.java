package vn.zelecshop.dao;

import java.util.List;

import vn.zelecshop.entity.Genre;

public interface IGenreDAO {
	List<Genre> findAll();
	
	Genre findById(String gid);
	
	Genre findByName(String gname);
	
	void insert(Genre genre);
	
	void update(Genre genre);
	
	void delete(String gid);
	
	int countProducts(String gid);
}

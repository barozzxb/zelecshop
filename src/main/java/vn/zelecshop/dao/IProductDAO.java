package vn.zelecshop.dao;

import java.util.List;

import vn.zelecshop.entity.Product;

public interface IProductDAO {
	
	List<Product> findAll();

	Product findById(String pid);

	List<Product> findByName(String pname);

	void insert(Product product);

	void delete(String pid) throws Exception;
	
	void update(Product product);
}

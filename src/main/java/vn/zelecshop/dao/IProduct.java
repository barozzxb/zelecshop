package vn.zelecshop.dao;

import java.util.List;


import vn.zelecshop.entity.Product;

public interface IProduct {

	List<Product> findAll();

	Product findById(int productId);

	List<Product> findByproductname(String proname);

	void insert(Product product);

	void delete(int productId ) throws Exception;
	
	
	
	void update(Product product);
}

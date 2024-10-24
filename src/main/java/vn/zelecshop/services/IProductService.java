package vn.zelecshop.services;

import java.util.List;

import vn.zelecshop.entity.Product;

public interface IProductService {
	
	List<Product> findAll();

	Product findById(String pid);

	List<Product> findByName(String pname);

	boolean insert(Product product);

	boolean delete(String pid) throws Exception;
	
	boolean update(Product product);
}

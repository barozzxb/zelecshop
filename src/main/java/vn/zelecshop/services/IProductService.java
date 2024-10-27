package vn.zelecshop.services;

import java.util.List;

import vn.zelecshop.entity.Product;

public interface IProductService {

	List<Product> findAll();

	Product findById(int productId);

	List<Product> findByName(String pname);

	public void insert(Product product);

	public void delete(int productId) throws Exception;
	
	public void update(Product product);

}

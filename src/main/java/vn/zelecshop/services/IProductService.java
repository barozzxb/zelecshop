package vn.zelecshop.services;

import java.util.List;

import vn.zelecshop.entity.Product;

public interface IProductService {
<<<<<<< HEAD

	List<Product> findAll();

	Product findById(int productId);

	List<Product> findByproductname(String proname);

	void insert(Product product);

	void delete(int productId ) throws Exception;
	
	
	
	void update(Product product);
=======
	
	List<Product> findAll();

	Product findById(String pid);

	List<Product> findByName(String pname);

	boolean insert(Product product);

	boolean delete(String pid) throws Exception;
	
	boolean update(Product product);
>>>>>>> master
}

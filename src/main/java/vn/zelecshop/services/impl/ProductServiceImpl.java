package vn.zelecshop.services.impl;

import java.util.List;

import vn.zelecshop.dao.IProduct;

import vn.zelecshop.dao.impl.ProductDAOImpl;
import vn.zelecshop.entity.Product;
import vn.zelecshop.services.IProductService;

public class ProductServiceImpl implements IProductService{

	IProduct proDao = new ProductDAOImpl();
	@Override
	public List<Product> findAll() {
		return proDao.findAll();
	}

	@Override
	public Product findById(int productId) {
	
		return proDao.findById(productId);
	}

	@Override
	public List<Product> findByproductname(String proname) {
		return proDao.findByproductname(proname);
	}

	@Override
	public void insert(Product product) {
		proDao.insert(product);
		
	}

	@Override
	public void delete(int productId) throws Exception {
		proDao.delete(productId);
		
	}

	@Override
	public void update(Product product) {
		proDao.update(product);
		
	}

}

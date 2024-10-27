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
	public Product findById(int pid) {
	return proDao.findById(pid);
	}

	@Override
	public List<Product> findByName(String pname) {
		return proDao.findByproductname(pname);
	}

	@Override
	public void insert(Product product) {
		proDao.insert(product);
	}



	@Override
	public void update(Product product) {
		proDao.update(product);
		
	}

	@Override
	public void delete(int productId) throws Exception {
		proDao.delete(productId);
		
	}

	

}

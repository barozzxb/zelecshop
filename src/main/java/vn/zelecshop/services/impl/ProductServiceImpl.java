package vn.zelecshop.services.impl;

import java.util.List;

import vn.zelecshop.dao.IProductDAO;
import vn.zelecshop.dao.impl.ProductDAOImpl;
import vn.zelecshop.entity.Product;
import vn.zelecshop.services.IProductService;

public class ProductServiceImpl implements IProductService{

	IProductDAO pDAO = new ProductDAOImpl();
	
	@Override
	public List<Product> findAll() {
		return pDAO.findAll();
	}

	@Override
	public Product findById(String pid) {
		return pDAO.findById(pid);
	}

	@Override
	public List<Product> findByName(String pname) {
		return pDAO.findByName(pname);
	}

	@Override
	public boolean insert(Product product) {
		if (pDAO.findById(product.getPid()) != null) {
			return false;
		}
		try {
			pDAO.insert(product);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean delete(String pid) throws Exception {
		try {
			pDAO.delete(pid);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean update(Product product) {
		try {
			pDAO.update(product);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}

package vn.zelecshop.dao.impl;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;
import vn.zelecshop.configs.JPAConfig;
import vn.zelecshop.dao.IProductDAO;
import vn.zelecshop.entity.Product;

public class ProductDAOImpl implements IProductDAO{

	@Override
	public List<Product> findAll() {
		EntityManager enma = JPAConfig.getEntityManager();
		TypedQuery<Product> pros = enma.createNamedQuery("product.findAll", Product.class);
		return pros.getResultList();
	}

	@Override
	public Product findById(String productId) {
		EntityManager enma = JPAConfig.getEntityManager();
		Product pro = enma.find(Product.class, productId);
		return pro;
	}

	@Override
	public void insert(Product product) {
		EntityManager enma = JPAConfig.getEntityManager();
		EntityTransaction trans = enma.getTransaction();
		try {
			trans.begin();
			enma.persist(product);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
			throw e;
		} finally {
			enma.close();
		}
		
	}

	@Override
	public void update(Product product) {
		EntityManager enma = JPAConfig.getEntityManager();
		EntityTransaction trans = enma.getTransaction();
		try {
			trans.begin();
			enma.merge(product); // edit
			trans.commit();
	
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
			throw e;
		} finally {
			enma.close();
		}
		
	}

	@Override
	public List<Product> findByName(String pname) {
		EntityManager enma = JPAConfig.getEntityManager();
		String jpql = "SELECT p FROM Product p WHERE p.productName like : pname";
		TypedQuery<Product> query= enma.createQuery(jpql, Product.class);
		query.setParameter("pname", "%" + pname +"%");
		return query.getResultList();
	}

	@Override
	public void delete(String pid) throws Exception {
		EntityManager enma = JPAConfig.getEntityManager();
		EntityTransaction trans = enma.getTransaction();
		try {
			trans.begin();
			Product product = enma.find(Product.class, pid);
			if (product !=null) {
				enma.remove(product);
			}
			else {
				throw new Exception("Khong tim thay");
			}
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
			throw e;
		} finally {
			enma.close();
		}		
	}
}

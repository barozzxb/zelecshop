package vn.zelecshop.dao.impl;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;
import vn.zelecshop.configs.JPAConfig;
<<<<<<< HEAD
import vn.zelecshop.dao.IProduct;
import vn.zelecshop.entity.Product;

public class ProductDAOImpl implements IProduct{
=======
import vn.zelecshop.dao.IProductDAO;
import vn.zelecshop.entity.Product;

public class ProductDAOImpl implements IProductDAO{
>>>>>>> master

	@Override
	public List<Product> findAll() {
		EntityManager enma = JPAConfig.getEntityManager();
		TypedQuery<Product> pros = enma.createNamedQuery("Product.findAll", Product.class);
		return pros.getResultList();
	}

	@Override
<<<<<<< HEAD
	public Product findById(int productId) {
=======
	public Product findById(String productId) {
>>>>>>> master
		EntityManager enma = JPAConfig.getEntityManager();
		Product pro = enma.find(Product.class, productId);
		return pro;
	}

<<<<<<< HEAD




	


=======
>>>>>>> master
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
<<<<<<< HEAD
	public List<Product> findByproductname(String proname) {
		EntityManager enma = JPAConfig.getEntityManager();
		String jpql = "SELECT p FROM Product p WHERE p.productName like : proname";
		TypedQuery<Product> query= enma.createQuery(jpql, Product.class);
		query.setParameter("proname", "%" + proname +"%");
=======
	public List<Product> findByName(String pname) {
		EntityManager enma = JPAConfig.getEntityManager();
		String jpql = "SELECT p FROM Product p WHERE p.productName like : pname";
		TypedQuery<Product> query= enma.createQuery(jpql, Product.class);
		query.setParameter("pname", "%" + pname +"%");
>>>>>>> master
		return query.getResultList();
	}

	@Override
<<<<<<< HEAD
	public void delete(int productId) throws Exception {
=======
	public void delete(String pid) throws Exception {
>>>>>>> master
		EntityManager enma = JPAConfig.getEntityManager();
		EntityTransaction trans = enma.getTransaction();
		try {
			trans.begin();
<<<<<<< HEAD
			Product product = enma.find(Product.class, productId);
=======
			Product product = enma.find(Product.class, pid);
>>>>>>> master
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
<<<<<<< HEAD
		
	}

=======
	}
>>>>>>> master
}

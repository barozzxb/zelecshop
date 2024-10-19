package vn.zelecshop.dao.impl;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;
import vn.zelecshop.configs.DBConnection;
import vn.zelecshop.configs.JPAConfig;
import vn.zelecshop.dao.IAccountDAO;
import vn.zelecshop.entity.Account;

public class AccountDAOImpl extends DBConnection implements IAccountDAO {

	@Override
	public List<Account> selectAll() {
		EntityManager enma = JPAConfig.getEntityManager();
		TypedQuery<Account> accs = enma.createNamedQuery("Account.findAll", Account.class);
		return accs.getResultList();
	}

	@Override
	public Account findByUserId(String userid) {
		EntityManager enma = JPAConfig.getEntityManager();
		Account acc = enma.find(Account.class, userid);
		return acc;
	}

	@Override
	public boolean insert(Account acc) {
	    EntityManager enma = JPAConfig.getEntityManager();
	    EntityTransaction trans = enma.getTransaction();
	    try {
	        trans.begin();
	        enma.persist(acc);
	        trans.commit();
	        return true;
	    } catch (Exception e) {
	        e.printStackTrace();
	        trans.rollback();
	        throw e;
	    } finally {
	        enma.close();
	    }
	}

	@Override
	public boolean update(Account acc) {
		EntityManager enma = JPAConfig.getEntityManager();
		EntityTransaction trans = enma.getTransaction();
		try {
			trans.begin();
			enma.merge(acc); // edit
			trans.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
			throw e;
		} finally {
			enma.close();
		}
	}
}
package vn.zelecshop.services.impl;

import vn.zelecshop.dao.IAccountDAO;
import vn.zelecshop.dao.impl.AccountDAOImpl;
import vn.zelecshop.entity.Account;
import vn.zelecshop.services.IAccountService;

public class AccountServiceImpl implements IAccountService{

	IAccountDAO accDAO = new AccountDAOImpl();
	@Override
	public Account login(String userid, String password) {
		Account acc = accDAO.findByUserId(userid);
		
		if (acc != null)
			if (password.equals(acc.getPassword()))
				return acc;
		return null;
	}
	
	@Override
	public boolean isExist(String userid) {
		Account acc = accDAO.findByUserId(userid);
		if (acc != null)
			return true;
		else
			return false;
	}

	@Override
	public boolean signup(Account acc) {
		return accDAO.insert(acc);
	}

	@Override
	public boolean update(Account acc) {
		return accDAO.update(acc);
	}

}
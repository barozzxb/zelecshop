package vn.zelecshop.dao;

import java.util.List;

import vn.zelecshop.entity.Account;

public interface IAccountDAO {
	// Designed for administration to list all account
	List<Account> selectAll();

	// Use for finding account when login
	Account findByUserId(String userid);

	// Use for register
	boolean insert(Account acc);

	// Use for update info
	boolean update(Account acc);
}

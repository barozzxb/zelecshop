package vn.zelecshop.services;

import java.util.List;

import vn.zelecshop.entity.Account;

public interface IAccountService {
	public Account login(String userid, String password);

	public boolean isExist(String userid);

	public boolean signup(Account acc);

	public boolean update(Account acc);
	
	List<Account> selectAll();

	// Use for finding account when login
	Account findByUserId(String userid);
}

package vn.zelecshop.services;

import vn.zelecshop.entity.Account;

public interface IAccountService {
	public Account login(String userid, String password);

	public boolean isExist(String userid);

	public boolean signup(Account acc);

	public boolean update(Account acc);
}

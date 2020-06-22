package com.spring.account.service;

import java.util.List;

import com.spring.account.vo.AccountVO;

public interface AccountService {
	public void updateAccount(AccountVO av);
	public boolean isValidName(String name);
	public int getBalanceByName(String name);
	public List<AccountVO> showAllData();
}

package com.spring.account.dao;

import java.util.HashMap;
import java.util.List;

import com.spring.account.vo.AccountVO;

public interface AccountDAO {
	public List<AccountVO> selectAllAccount();
	public int insertPerson(AccountVO av);
	public int updateBalance(AccountVO av);
	public int updateRecent(AccountVO av);
}

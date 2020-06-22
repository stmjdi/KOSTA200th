package com.spring.account.service;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.spring.account.dao.AccountDAO;
import com.spring.account.vo.AccountVO;

@Transactional(propagation=Propagation.REQUIRED)
public class AccountServiceImpl implements AccountService{
	AccountDAO accountDAO;

	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}

	@Override
	public void updateAccount(AccountVO av) {
		accountDAO.updateRecent(av);
		int bal=av.getBalance()+av.getRecent();
		av.setBalance(bal);
		accountDAO.updateBalance(av);
//		accountDAO.updateBalance(av);
//		accountDAO.updateRecent(av);
	}

	@Override
	public boolean isValidName(String name) {
		List<AccountVO> avs = accountDAO.selectAllAccount();
		
		for(int i=0;i<avs.size();i++) {
			if(avs.get(i).getName().equals(name)) return true;
		}
		return false;
	}

	@Override
	public int getBalanceByName(String name) {
		int ret=0;
		List<AccountVO> avl = accountDAO.selectAllAccount();
		for(int i=0;i<avl.size();i++) {
			if(avl.get(i).getName().equals(name)) {
				ret=avl.get(i).getBalance();
				break;
			}
		}
		
		return ret;
	}

	@Override
	public List<AccountVO> showAllData() {
		return accountDAO.selectAllAccount();
	}
	
}

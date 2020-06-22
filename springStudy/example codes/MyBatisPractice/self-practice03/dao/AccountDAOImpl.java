package com.spring.account.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.spring.account.vo.AccountVO;

public class AccountDAOImpl implements AccountDAO{
	SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<AccountVO> selectAllAccount() {
		List<AccountVO> ret = sqlSession.selectList("mapper.account.selectAllAccount");
		
		return ret;
	}

	@Override
	public int insertPerson(AccountVO av) {
		int ret = sqlSession.insert("mapper.account.insertPerson",av);
		
		return ret;
	}

	@Override
	public int updateBalance(AccountVO av) {
		int ret = sqlSession.update("mapper.account.updateBalance",av);
		
		return ret;
	}

	@Override
	public int updateRecent(AccountVO av) {
		int ret = sqlSession.update("mapper.account.updateRecent",av);

		return ret;
	}
	
}

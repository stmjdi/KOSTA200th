package com.spring.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.vo.GiftVO;

@Repository("giftDAO")
public class GiftDAOImpl implements GiftDAO{
	@Autowired
	SqlSession sqlSession;
	
	@Override
	public List<GiftVO> selectAllList() {
		List<GiftVO> ret = sqlSession.selectList("mapper.gift.selectAllList");
		
		return ret;
	}
	
}

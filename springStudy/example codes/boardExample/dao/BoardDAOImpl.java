package com.spring.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.vo.BoardVO;

@Repository("boardDAO")
public class BoardDAOImpl implements BoardDAO{

	@Autowired
	SqlSession sqlSession;
	
	@Override
	public List<BoardVO> selectAll() {
		
		return sqlSession.selectList("mapper.board.selectAll");
	}

	@Override
	public void insertNewBoard(BoardVO bv) {
		// TODO Auto-generated method stub
		sqlSession.insert("mapper.board.insertNewBoard",bv);
	}

	@Override
	public void deleteBoard(BoardVO bv) {
		// TODO Auto-generated method stub
		sqlSession.delete("mapper.board.deleteBoard",bv);
	}

}

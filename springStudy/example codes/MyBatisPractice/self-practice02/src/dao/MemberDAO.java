package com.spring.member.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.spring.member.vo.MemberVO;

public class MemberDAO {
	SqlSession sqlSession;
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public List<MemberVO> selectMember(){
		List<MemberVO> ret;
		
		ret=sqlSession.selectList("mapper.member.selectMember");
		
		return ret;
	}
}

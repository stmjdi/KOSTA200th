package com.spring.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.vo.MemberVO;

@Repository("memberDAO")
public class MemberDAO {
	@Autowired
	SqlSession sqlSession;
	
	public List<MemberVO> selectAllMembers(){
		List<MemberVO> ret = sqlSession.selectList("mapper.member.selectAllMembers");
		
		return ret;
	}
	
	public int insertMember(MemberVO mv) {
		int ret = sqlSession.insert("mapper.member.insertMember",mv);
		
		return ret;
	}
	
	public int deleteMember(String id) {
		int ret = sqlSession.delete("mapper.member.deleteMember",id);
		
		return ret;
	}
}

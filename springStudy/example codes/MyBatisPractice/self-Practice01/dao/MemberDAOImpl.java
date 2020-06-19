package com.spring.dao;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.spring.vo.MemberVO;

public class MemberDAOImpl implements MemberDAO{
	private static SqlSessionFactory sqlMapper=null;
	private static SqlSessionFactory getInstance() {
		if(sqlMapper==null) {
			try {
				Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
				sqlMapper=new SqlSessionFactoryBuilder().build(reader);
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return sqlMapper;
	}
	@Override
	public List<MemberVO> showInfo() {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		List<MemberVO> memlist = session.selectList("mapper.member.selectAllList");
		return memlist;
	}
	
	@Override
	public int regisMember(MemberVO memv) {
		sqlMapper=getInstance();
		SqlSession session = sqlMapper.openSession();
		
		int result = session.insert("mapper.member.regisMember",memv);
		session.commit();
		return result;
	}
	
	@Override
	public int leaveMember(String id) {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		
		int result = session.delete("mapper.member.delMember",id);
		session.commit();
		
		return result;
	}
	
}

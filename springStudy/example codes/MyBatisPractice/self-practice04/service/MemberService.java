package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.MemberDAO;
import com.spring.vo.MemberVO;

@Service("memberService")
public class MemberService {
	@Autowired
	MemberDAO memberDAO;
	
	public boolean isValidIdf(String id, String pwd) {
		List<MemberVO> lmv = memberDAO.selectAllMembers();
		
		for(MemberVO i : lmv) {
			if(i.getId().equals(id) && i.getPwd().equals(pwd)) {
				return true;
			}
		}
		return false;
	}
	
	public List<MemberVO> showAllMembers(){
		return memberDAO.selectAllMembers();
	}
	
	public boolean regisMember(String id, String pwd) {
		List<MemberVO> lmv = memberDAO.selectAllMembers();
		for(MemberVO mv : lmv) {
			if(mv.getId().equals(id)) {
				return false; // 중복 아이디 체크 
			}
		}
		memberDAO.insertMember(new MemberVO(id,pwd));
		return true;
	}
	
}

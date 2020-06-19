package com.spring.dao;

import java.util.HashMap;
import java.util.List;

import com.spring.vo.MemberVO;

public interface MemberDAO {
	public List<MemberVO> showInfo();
	public int regisMember(MemberVO memv);
	public int leaveMember(String id);
}

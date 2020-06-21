package com.spring.member.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.spring.member.dao.MemberDAO;
import com.spring.member.vo.MemberVO;

public class MemberController extends MultiActionController{
	MemberDAO memberDAO;

	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}

	
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("loginFailed");
		String username = (String)request.getParameter("name");
		mav.addObject("username",username);
		List<MemberVO> lst = memberDAO.selectMember();
		
		for(int i=0;i<lst.size();i++) {
			if(lst.get(i).getName().equals(username)) {
				mav.setViewName("login");
				break;
			}
		}
		
		return mav;
	}
	
	public ModelAndView result(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		List<MemberVO> lst = memberDAO.selectMember();
		if(!lst.isEmpty()) System.out.println(lst.get(0).getName());
		mav.addObject("lst",lst);
		mav.setViewName("result");
		return mav;
	}
	
	public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("index");
		return mav;
	}
}
